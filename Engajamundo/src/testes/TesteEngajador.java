package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Engajador;

public class TesteEngajador {

	@Test
	public void test() {
		Engajador engajador1 = new Engajador("Joseph","Decimo","joseph@teste.teste","01/01/0001",12345678,"galileia","joseph","senha");
		assertEquals("Joseph", engajador1.getNome());
		assertEquals("Decimo", engajador1.getSobrenome());
		assertEquals("joseph@teste.teste", engajador1.getEmail());
		
	}

}
