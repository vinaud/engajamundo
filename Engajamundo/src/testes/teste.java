package testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {

	@Test
	public void test() {
		Engajador engajador1 = new Engajador("Joseph","D�cimo","joseph@teste.teste","01/01/0001",12345678,"galileia","joseph","senha");
		assertEquals("Joseph", engajador1.getNome());
	}

}
