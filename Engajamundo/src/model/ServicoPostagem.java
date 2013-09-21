package model;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.DAOPostagem;
import dao.IDAOPostagem;
import entities.Engajador;
import entities.Postagem;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import exceptions.UsuarioNaoAutenticadoException;

public class ServicoPostagem {

	private static ServicoPostagem singleton = null;

	
	private IDAOPostagem daoPostagem;

	public ServicoPostagem() {
		this.daoPostagem = new DAOPostagem();
	}

	public static ServicoPostagem getInstance() {

		if (singleton == null) {
			singleton = new ServicoPostagem();
		}

		return singleton;

	}
	
	public List<Postagem> getPostagens() throws DaoException{
		return daoPostagem.listar("Postagem");
	}
	
	public void postar(Postagem post, String tagAux) throws UsuarioNaoAutenticadoException, DaoException, CadastroFailException
    {
	    if (post == null || post.equals(null) ||
	        post.getTitulo().equals(null) ||
	        post.getTexto().equals(null))
	        throw new CadastroFailException();
	    else {
            post.setTags(tagAux);
            
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            
            String login = null;
            
            if (session.getAttribute("usuario")!=null){
                    login = ((Engajador) session.getAttribute("usuario")).getLogin();
            } else throw new UsuarioNaoAutenticadoException(); 
            
            post.setLogin(login);
            
            daoPostagem.cadastrar(post);
	    }
    }
	
	public void deletar(int idPostagem) throws DaoException{
		daoPostagem.deletar(idPostagem);
	}
}