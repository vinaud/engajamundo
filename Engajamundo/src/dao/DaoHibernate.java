package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class DaoHibernate implements IDAO {
	
	public DaoHibernate(){
		
	}
	
	
	@Override
	public boolean existeLogin(String login) { //DAOEngajador
	
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		Query query = em
				.createQuery("select f from Engajador f where login = :login");
		query.setParameter("login", login);

		if (query.getResultList().isEmpty()) {
			return false;
		} else return true;
	}
	
}
