package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import exceptions.BuscaSemResultadoException;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import entities.Engajador;
import model.IServicoUsuario;
import model.ServicoUsuario;

@SessionScoped
@ManagedBean(name="controllerEngajador")
public class ControllerEngajador {

	private Engajador engajador;
	private List<Engajador> usuarios;
	private List<Engajador> usuarioSelecionados;
	private ArrayList<Boolean> selecionados;
	private boolean buscou = false;
	private String query;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	FacesContext context = FacesContext.getCurrentInstance();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void selecionados(int tam)
	{
		selecionados = new ArrayList();
		for (int i = 0; i < tam; i++)
			selecionados.add(false);
	}
	
	@SuppressWarnings({ })
	public ControllerEngajador() throws DaoException {
		engajador = new Engajador();
		usuarios = servicoUsuario.getUsers();
		usuarioSelecionados = new ArrayList<Engajador>();
	}
	
	public String editar(){
		
		try {
			for (int i = 0; i < usuarios.size(); i++)
			{
				if (usuarios.get(i).isSelecionado())
					usuarioSelecionados.add((usuarios.get(i)));
			}  
			return "Editar";
		}
		catch (Exception e)
		{
			return "erro";
		}
		
	}
	
	public String buscarPorPais()
    {
            buscou = false;
            query = "";
            return "BuscarPorPais";
    }
    
    public String buscarPorNome() {
            buscou = false;
            query = "";
            return "BuscarPorNome";
    }

	public String cadastrarEngajador() {

		String action = "";
		 
		try {
				servicoUsuario.cadastrarEngajador(engajador);
				action = "sucesso";
				FacesContext context = FacesContext.getCurrentInstance(); 
				context.addMessage(null, new FacesMessage("", engajador.getLogin() +  ", agora você faz parte do Engajamundo!"));				
		} catch (DaoException e) {
			action = "erro";
			System.out.println(e);
		} catch (CadastroFailException e) {
		    action = "erro";
		}
		
		return action;

		
	}
	
	public String deletar() {
		
		try {
			for (int i = 0; i < usuarios.size(); i++)
			{
				if (usuarios.get(i).isSelecionado())
					servicoUsuario.deletar(usuarios.get(i).getLogin());
			} 
			
			usuarios = (List<Engajador>) servicoUsuario.getUsers();
			
			return "sucesso";
		}
		catch (Exception e)
		{
			return "erro";
		}
		
	}
	
	public String visualizar() throws DaoException
	{
		usuarios = (List<Engajador>) servicoUsuario.getUsers();
		selecionados(usuarios.size());
		return "Visualizar";
	}
	
	public String criarPostagem(){ 
		return "criarPostagem";
	}
	
	public String buscas(){
		return "buscas";
	}
	
	public String atualizar() throws DaoException, BuscaSemResultadoException
	{
		String login;
		
		for (int i = 0; i < usuarioSelecionados.size(); i++) {
			login = usuarioSelecionados.get(i).getLogin();
			System.out.println("editando....chamando servicos...");
			servicoUsuario.editar(usuarioSelecionados.get(i), login);
		}
	
		return "sucesso";
	}
	
	
	public String buscarEngajadorPorNome() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajador(query);
			selecionados(usuarios.size());
			if (usuarios.size() > 0) buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BuscaSemResultadoException e) {
			FacesMessage message = new FacesMessage("Não existem usuários cadastrados com esse nome!");  
            message.setSeverity(FacesMessage.SEVERITY_ERROR);  
            FacesContext.getCurrentInstance().addMessage("busca:nome", message);  
			return "erro";
		}
		return action;
	}
	
	public String buscarEngajadorPorPais() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajadorPorPais(query);
			selecionados(usuarios.size());
			if (usuarios.size() > 0) buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BuscaSemResultadoException e) {
			FacesMessage message = new FacesMessage("Não existem usuários cadastrados nesse país!");  
            message.setSeverity(FacesMessage.SEVERITY_ERROR);  
            FacesContext.getCurrentInstance().addMessage("busca:nome", message);  
			return "erro";
		}
		return action;
	}

	public Engajador getEngajador() {
		return engajador;
	}

	public void setEngajador(Engajador engajador) {
		this.engajador = engajador;
	}

	public List<Engajador> getUsuarios() {
		return usuarios;
	}
	
	public List<Engajador> buscarEngajadores() throws DaoException {
		return servicoUsuario.getUsers();
	}

	public void setUsuarios(List<Engajador> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isBuscou() {
		return buscou;
	}

	public void setBuscou(boolean buscou) {
		this.buscou = buscou;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public List<Engajador> getUsuarioSelecionados() {
		return usuarioSelecionados;
	}

	public void setUsuarioSelecionados(List<Engajador> usuarioSelecionados) {
		this.usuarioSelecionados = usuarioSelecionados;
	}

}