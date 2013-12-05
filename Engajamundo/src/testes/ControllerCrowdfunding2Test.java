package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.ControllerCrowdfunding;
import entities.Crowdfunding;
import exceptions.DaoException;

public class ControllerCrowdfunding2Test {

	private ControllerCrowdfunding controller = null;
	
	@Before
	public void setUp() throws Exception {
		controller = new ControllerCrowdfunding();
	}

	@After
	public void tearDown() throws Exception {
		controller = null;
	}

	@Test
	public final void testDoar() throws DaoException {
		controller.doar();
	}

	@Test
	public final void testGetDoacao() {
		Crowdfunding d =controller.getDoacao();
		
		assertNull(d);
		
	}

	@Test
	public final void testSetDoacao() {
		controller.setDoacao(null);
		assertNull(controller.getDoacao());
	}

	@Test
	public final void testGetMetaCapacitacao() {
		double d = controller.getMetaCapacitacao();
		assertEquals(d, 200.000);
	}

	@Test
	public final void testSetMetaCapacitacao() {
		controller.setMetaCapacitacao(20.00);
		double d = controller.getMetaCapacitacao();
		assertEquals(d, 20.00);
	}

	@Test
	public final void testGetValorCapitado() {
		Double  d = controller.getValorCapitado();
		assertNotNull(d);
	}

	@Test
	public final void testSetValorCapitado() {
		
	}

	@Test
	public final void testGetPorcentagem() {
		
	}

	@Test
	public final void testSetPorcentagem() {
		
	}

	@Test
	public final void testGetQtdPatrocinadores() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSetQtdPatrocinadores() {
		fail("Not yet implemented"); // TODO
	}

}
