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
	public void testDeletar() throws DaoException{
	
			ControllerEngajador control = new ControllerEngajador();
			
			assertEquals("false",control.deletar());
	
		
	}
	
	@Test
	public void testBuscaNome() throws DaoException{
	
			ControllerEngajador control = new ControllerEngajador();
			
			assertEquals("erro",control.buscarEngajadorPorNome());
		
		
	}
	
	@Test
	public void testBuscaPais() throws DaoException{
		
			ControllerEngajador control = new ControllerEngajador();
			
			assertEquals("erro",control.buscarEngajadorPorPais());
		
		
	}
}
