package testes;

import controller.ControllerEngajador;
import dao.DaoHibernate;
import entities.Engajador;
import exceptions.DaoException;

public class TesteInsereProduto {
	
	@Test
	
	public static void testeInserir throws DaoException {
		
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
