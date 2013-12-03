package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.DaoHibernate;
import entities.Crowdfunding;
import entities.Engajador;
import entities.Postagem;
import exceptions.DaoException;

public class DaoHibernateTest {

	@Test
	public void testEng() {
		Engajador eng = new Engajador();
		DaoHibernate d = new DaoHibernate();
		try {
			d.cadastrarEngajador(eng);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testPost() {
		Postagem post = new Postagem();
		DaoHibernate d = new DaoHibernate();
		d.savePost(post);
	}
	
	
	@Test
	public void testFunding() {
		Crowdfunding cf = new Crowdfunding();
		DaoHibernate d = new DaoHibernate();
		d.saveDoacao(cf);
	}
	
	@Test
	public void testEditar() {
		Engajador eng = new Engajador();
		DaoHibernate d = new DaoHibernate();
		d.editar(eng, "xunda");
	}

}
