package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.ControllerEngajador;
import exceptions.DaoException;

public class TesteControllerEngajador {

	@Test
	public void test() throws DaoException{
	
			ControllerEngajador control = new ControllerEngajador();
			
			control.cadastrarEngajador();
		
		
	}
	
	@Test
	public void testDeletar() {
		try {
			ControllerEngajador control = new ControllerEngajador();
			
			assertEquals("false",control.deletar());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testBuscaNome() {
		try {
			ControllerEngajador control = new ControllerEngajador();
			
			assertEquals("erro",control.buscarEngajadorPorNome());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testBuscaPais() {
		try {
			ControllerEngajador control = new ControllerEngajador();
			
			assertEquals("erro",control.buscarEngajadorPorPais());
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
