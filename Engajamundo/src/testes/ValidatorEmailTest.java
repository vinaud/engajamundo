package testes;

import static org.junit.Assert.*;

import javax.faces.validator.ValidatorException;

import model.ValidatorEmail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorEmailTest {

	ValidatorEmail validatorEmail = null;
	@Before
	public void setUp() throws Exception {
		validatorEmail = new ValidatorEmail();
	}

	@After
	public void tearDown() throws Exception {
		validatorEmail = null;
	}

	@Test(expected=ValidatorException.class) 
	public final void testValidate() {
		
		validatorEmail.validate(null, null,null);
		
	}

}
