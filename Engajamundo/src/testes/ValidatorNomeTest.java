package testes;

import static org.junit.Assert.*;

import javax.faces.validator.ValidatorException;

import model.ValidatorNome;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorNomeTest {
	
	private ValidatorNome validator = null;

	@Before
	public void setUp() throws Exception {
		validator = new ValidatorNome();
	}

	@After
	public void tearDown() throws Exception {
		validator = null;
	}

	
	@Test(expected=NullPointerException.class) 
	public final void testValidateNull() {
		
		validator.validate(null, null,null);
		
	}
	
	@Test(expected=ValidatorException.class) 
	public final void testValidateMais50() {
		validator.validate(null, null, "fdnfdjnssssssssssssssssssssssssssssssssssssssss"
				+ "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "ddddddddddddddddddddddd");
	}
	
	@Test(expected=ValidatorException.class) 
	public final void testValidateCaractereEspecial() {
		validator.validate(null, null, "Q&%");
	}

}
