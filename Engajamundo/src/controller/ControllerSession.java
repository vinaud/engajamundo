package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import entities.Engajador;
import exceptions.LoginInvalidoException;
import model.IServicoUsuario;
import model.ServicoUsuario;

@SessionScoped
@ManagedBean(name="controllerSession")
public class ControllerSession {

	Engajador usuarioAtual;
	private String login, senha;
	private boolean ehAdmin;
	private boolean estaLogado = false;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	
	public String autenticar()
	{
		try{
		usuarioAtual = servicoUsuario.autenticar(login, senha);
		HttpSession session = ( HttpSession ) FacesContext.getCurrentInstance().getExternalContext().getSession(false);  
		session.setAttribute("usuario", usuarioAtual);
		
		if (usuarioAtual == null){
			return "erro";
		}
		else {
			estaLogado = true;
			if (usuarioAtual.getLogin().equals("admin")){
				ehAdmin = true;
				return "admin";
			} else {
				ehAdmin = false;
				return "engajador";
			}
		}
		}
			catch(LoginInvalidoException e){
			FacesMessage message = new FacesMessage("Senha incorreta");  
            message.setSeverity(FacesMessage.SEVERITY_ERROR);  
            FacesContext.getCurrentInstance().addMessage("home:password", message);  
			return "erro";
			}
	}
	
	public String logoff (){
		
		HttpSession session = ( HttpSession ) FacesContext.getCurrentInstance().getExternalContext().getSession(false);	
		session.removeAttribute("usuario");
		estaLogado = false;
		ehAdmin = false;
		
		return "logoff";
		
	}
	
	public Engajador getUsuarioAtual() {
		return usuarioAtual;
	}
	
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setUsuarioAtual(Engajador usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isEhAdmin() {
		return ehAdmin;
	}

	public void setEhAdmin(boolean ehAdmin) {
		this.ehAdmin = ehAdmin;
	}

	public boolean isEstaLogado() {
		return estaLogado;
	}

	public void setEstaLogado(boolean estaLogado) {
		this.estaLogado = estaLogado;
	}
	
	
}