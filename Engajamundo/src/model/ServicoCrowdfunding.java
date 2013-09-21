package model;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.DAOCrowdfunding;
import dao.IDAOCrowdfunding;
import entities.Crowdfunding;
import entities.Engajador;
import exceptions.CadastroFailException;
import exceptions.DaoException;

public class ServicoCrowdfunding {
	
	private static ServicoCrowdfunding singleton = null;

	private IDAOCrowdfunding daoCrowdfunding;

	public ServicoCrowdfunding() {
		this.daoCrowdfunding = new DAOCrowdfunding();
	}

	public static ServicoCrowdfunding getInstance() {

		if (singleton == null) {
			singleton = new ServicoCrowdfunding();
		}

		return singleton;

	}
	
	public Double getDoacoes(){
		return daoCrowdfunding.getDoacoes();
	}
	
	public void doar(Crowdfunding doacao) throws DaoException, CadastroFailException
	{
		if (doacao == null || doacao.equals(null) ||
		    doacao.getValor() == null || doacao.getValor().equals(null))
		    throw new CadastroFailException();
		else {
    		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    		String login = ((Engajador) session.getAttribute("usuario")).getLogin();
    		doacao.setLogin(login);
    		
    		daoCrowdfunding.cadastrar(doacao);
		}
		
	}

}