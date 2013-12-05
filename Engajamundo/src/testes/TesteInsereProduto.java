package testes;

import controller.ControllerEngajador;
import dao.DaoHibernate;
import entities.Engajador;
import exceptions.DaoException;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteInsereProduto {
		
		@Test
		public  void testeInserir () throws DaoException, BuscaSemResultadoException {
		
		ControllerEngajador ce = new ControllerEngajador();
		
		@SuppressWarnings("unused")
		DaoHibernate daoH = new DaoHibernate();
		
		Engajador p = new Engajador();
		p.setLogin("bbbbb");
		
		ce.setEngajador(p);
//		ce.cadastrarEngajador();
		
//		List<Engajador> lista; 
		ce.buscarEngajadores();

		
		
	}
}
