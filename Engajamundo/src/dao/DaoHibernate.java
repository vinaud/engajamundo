package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Crowdfunding;
import entities.Engajador;
import entities.Postagem;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public class DaoHibernate implements IDAO {
	
	public DaoHibernate(){
		
	}
	
	public void cadastrarEngajador(Engajador engajador) throws DaoException { //DAOEngajador
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(engajador);
		em.getTransaction().commit();	
	}

	@Override
	public void savePost(Postagem post) { //DAOPostagem
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("__________\n\n\n\n" + post.getIdPostagem() + post.getLogin());
		em.persist(post);
		em.getTransaction().commit();		
	}

	@Override
	public void saveDoacao(Crowdfunding doacao) {//daoCrowdfunding
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(doacao);
		em.getTransaction().commit();	
	}

	@Override
	public void editar(Engajador engajador, String login) { //DAOEngajador
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
	
		Engajador engajador_old = buscarPorLogin(login);
		engajador_old.setNome(engajador.getNome());
		engajador_old.setSobrenome((engajador.getSobrenome()));
		engajador_old.setEmail(engajador.getEmail());
		
		em.merge(engajador_old);
		em.getTransaction().commit();
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> buscarEngajador (String nome) //DAOEngajador
			throws DaoException, BuscaSemResultadoException {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		Query query = em.createQuery("select f from Engajador f where nome = :nome");
		query.setParameter("nome", nome);
	
		if (query.getResultList().size() == 0)
			throw new BuscaSemResultadoException();
	    return query.getResultList();
	
	}

	public Engajador buscarPorLogin(String login) {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		Query query = em.createQuery("select f from Engajador f where login = :login");
		query.setParameter("login", login);
	
		
	    return (Engajador) query.getResultList().get(0);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> buscarEngajadorPorPais(String pais)
			throws DaoException, BuscaSemResultadoException {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		Query query = em.createQuery("select f from Engajador f where pais = :pais");
		query.setParameter("pais", pais);
	
		if (query.getResultList().size() == 0)
			throw new BuscaSemResultadoException();
		
	    return query.getResultList();
	}

	public boolean deletar(String login) { //DAOEngajador
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		em.getTransaction().begin();
		Engajador engajador = em.find(Engajador.class, login);
		em.remove(engajador);
		em.getTransaction().commit();
	
		if (existeLogin(login)) {
			return false;
		} else
			return true;
	
	}

	public void deletarPostagem(int idPostagem) //DAOPostagem
	{
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		em.getTransaction().begin();
		Postagem post = em.find(Postagem.class, idPostagem);
		em.remove(post);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Postagem> listarPostagens() {  //DAOPostagem
	    
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		String query = "select p from Postagem p";
	
		return em.createQuery(query).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> getUsers() { //DAOEngajador

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		String query = "select f from Engajador f";

		return em.createQuery(query).getResultList();

	}

	@Override
	public Engajador autenticar(String login, String senha) throws LoginInvalidoException{ //DAOEngajador
		try{
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
	
		Query query = em
				.createQuery("select f from Engajador f where login = :login and senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
	
		return (Engajador) query.getSingleResult();
		}catch(Exception e){
			throw new LoginInvalidoException();
		}
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
	
	@Override
	public Double getDoacoes() { //DAOCrowdfunding
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		String query = "select SUM(d.valor) from Crowdfunding d";
		
		return (Double) em.createQuery(query).getSingleResult();
		
	}
	

}