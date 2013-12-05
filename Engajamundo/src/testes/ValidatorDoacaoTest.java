package testes;

import static org.junit.Assert.*;

import javax.faces.validator.ValidatorException;

import model.ValidatorDoacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorDoacaoTest {

	
	private ValidatorDoacao validator = null;
	@Before
	public void setUp() throws Exception {
		validator = new ValidatorDoacao();
	}

	@After
	public void tearDown() throws Exception {
		validator = null;
	}

	@Test(expected=ValidatorException.class) 
	public void testValidate() {
		
		validator.validate(null, null, null);
		
	}

}
