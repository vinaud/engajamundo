package model;

import java.util.List;

import entities.Crowdfunding;
import entities.Postagem;

public interface IServicoCrowdfunding {
	
	public List<Postagem> getPostagens();
	
	public void doar(Crowdfunding doacao);

}