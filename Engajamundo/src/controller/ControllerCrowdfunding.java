package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.ServicoCrowdfunding;

import entities.Crowdfunding;
import exceptions.CadastroFailException;
import exceptions.DaoException;

@SessionScoped
@ManagedBean(name="controllerCrowdfunding")
public class ControllerCrowdfunding {
	
	ServicoCrowdfunding servicoCrowdfunding = ServicoCrowdfunding
			.getInstance();
	
	private Crowdfunding doacao;
	public Double metaCapacitacao;
	public Double valorCapitado;
	public Double porcentagem;
	int qtdPatrocinadores;
	
	public ControllerCrowdfunding(){
		doacao = new Crowdfunding();
		this.metaCapacitacao = 200.000;
	}
	
	public String doar() throws DaoException{
		String action = "";
	    try {
            servicoCrowdfunding.doar(doacao);
            action = "doacao";
        } catch (CadastroFailException e) {
            action = "error";
        }
		return action;
	}

	public Crowdfunding getDoacao() {
		return doacao;
	}

	public void setDoacao(Crowdfunding doacao) {
		this.doacao = doacao;
	}
	
	public Double getMetaCapacitacao() {
		return metaCapacitacao;
	}
	public void setMetaCapacitacao(Double metaCapacitacao) {
		this.metaCapacitacao = metaCapacitacao;
	}
	public Double getValorCapitado() {
		return servicoCrowdfunding.getDoacoes();
	}
	public void setValorCapitado(Double valorCapitado) {
		this.valorCapitado = valorCapitado;
	}
	public Double getPorcentagem() {
		return (getValorCapitado()/metaCapacitacao)*100;
	}
	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public int getQtdPatrocinadores() {
		return qtdPatrocinadores;
	}
	public void setQtdPatrocinadores(int qtdPatrocinadores) {
		this.qtdPatrocinadores = qtdPatrocinadores;
	}

}