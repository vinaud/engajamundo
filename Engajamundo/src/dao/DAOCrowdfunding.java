package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Crowdfunding;

public class DAOCrowdfunding extends DAOGenericoJPA<Crowdfunding> implements IDAOCrowdfunding{

	public Double getDoacoes() { 
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		String query = "select SUM(d.valor) from Crowdfunding d";
		
		return (Double) em.createQuery(query).getSingleResult();
		
	}
}
