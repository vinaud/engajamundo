package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;

import entities.Postagem;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import exceptions.UsuarioNaoAutenticadoException;
import model.ServicoPostagem;

@SessionScoped
@ManagedBean(name="controllerPostagem")
public class ControllerPostagem {

	ServicoPostagem servicoPostagem = ServicoPostagem
			.getInstance();
	private Postagem postagem;
	private String tag;
	private List<Postagem> postagens;
	
	public boolean podeDeletar(String login, String autor) {
		
		if (login.equals("admin") || login.equals(autor))
			return true;
		else
			return false;
	}
	
	public String postar() throws DaoException
    {
            try {
                    servicoPostagem.postar(postagem, tag);
                    postagem.setIdPostagem(0);
                    postagens = servicoPostagem.getPostagens();
                    return "sucesso";
            } catch (UsuarioNaoAutenticadoException e) {
                    FacesMessage message = new FacesMessage("Login necessário");  
        message.setSeverity(FacesMessage.SEVERITY_ERROR);  
        FacesContext.getCurrentInstance().addMessage("home:password", message);
            } catch (CadastroFailException e) {
                return "erro";
            }
            
            return  "erro";
    }
	
	public void deletar(ActionEvent actionEvent) throws DaoException{
		FacesContext context = FacesContext.getCurrentInstance();  
		HttpServletRequest req = (HttpServletRequest) context.getExternalContext().getRequest();  
		int idPostagem = new Integer( req.getParameter("idPostagem") ).intValue();  
		System.out.println("-->> " + idPostagem + " <<--");  
		servicoPostagem.deletar(idPostagem);
		postagens = servicoPostagem.getPostagens();
	}
	
	public ControllerPostagem() throws DaoException{
		postagem = new Postagem();
		postagens = servicoPostagem.getPostagens();
	}
	public Postagem getPostagem() {
		return postagem;
	}

	public String getTagAux() {
		return tag;
	}

	public void setPost(Postagem postagem) {
		this.postagem = postagem;
	}

	public void setTagAux(String tagAux) {
		this.tag = tagAux;
	}
	
	public void salvarPostagem()
	{
		
	}
	
	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

}