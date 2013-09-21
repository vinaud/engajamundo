package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Engajador;
import entities.Postagem;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
;

@SuppressWarnings("unused")
public class DAOGenericoJPA <T> implements IDaoGenerico <T> {
	
	private Class<T> entidade;
    protected static final EntityManagerFactory fabrica = 
    		Persistence.createEntityManagerFactory("engajamundoDB");
     
	@SuppressWarnings("unchecked")
	public DAOGenericoJPA() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.entidade = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void cadastrar(T entidade) throws DaoException {
		EntityManager em = fabrica.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}


	@Override
	public void deletar(String id) throws DaoException {
		EntityManager em = fabrica.createEntityManager();

		try {
			em.getTransaction().begin();
			T entidade = em.find(this.entidade, id);
			if (entidade != null) {
				em.remove(entidade);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new DaoException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> buscar(String tabela, String coluna, String parametro) throws DaoException {
		
		EntityManager em = fabrica.createEntityManager();

		Query query = em.createQuery("select f from " + tabela + " f where " + coluna + " like "+"'%"+parametro+"%'");
		//query.setParameter("parametro", parametro);
 
		if (query == null || query.equals(null) || query.getResultList().size() == 0)
			return null;
        return query.getResultList();

	}

	@Override
	public boolean existeID(String tabela, String parametro) throws DaoException {
		EntityManager em = fabrica.createEntityManager();

		Query query = em
				.createQuery("select f from " + tabela + " f where " + parametro + " = :" + parametro);
		query.setParameter(parametro, parametro);

		if (query.getResultList().isEmpty()) {
			return false;
		} else return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar(String tabela) throws DaoException {
		EntityManager em = fabrica.createEntityManager();

		String query = "select p from " + tabela +  " p ";

		return em.createQuery(query).getResultList();

	}
}
	