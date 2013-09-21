package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Postagem;

public class DAOPostagem extends DAOGenericoJPA<Postagem> implements IDAOPostagem{
	
	
	public void deletar(int idPostagem)
	{
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		em.getTransaction().begin();
		Postagem post = em.find(Postagem.class, idPostagem);
		em.remove(post);
		em.getTransaction().commit();
	}

}
