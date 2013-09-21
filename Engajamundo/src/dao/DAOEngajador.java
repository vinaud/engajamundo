package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public class DAOEngajador extends DAOGenericoJPA<Engajador> implements IDAOEngajador {

	@Override
	public Engajador autenticar(String login, String senha) throws LoginInvalidoException {
		try{
			EntityManagerFactory fabrica = Persistence
					.createEntityManagerFactory("engajamundoDB");
			EntityManager em = fabrica.createEntityManager();
		
			Query query = em
					.createQuery("select f from Engajador f where login = :login and senha = :senha");
			query.setParameter("login", login);
			query.setParameter("senha", senha);
		
			return (Engajador) query.getSingleResult();
			}catch(Exception e){
				throw new LoginInvalidoException();
			}
	}
	
	public void editar(Engajador engajador, String login) throws DaoException {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
	
		Engajador engajador_old = buscar(Engajador.class.getSimpleName(), "login", login).get(0);
		engajador_old.setNome(engajador.getNome());
		engajador_old.setSobrenome((engajador.getSobrenome()));
		engajador_old.setEmail(engajador.getEmail());
		
		em.merge(engajador_old);
		em.getTransaction().commit();
	
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
