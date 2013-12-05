package testes;

import static org.junit.Assert.*;

import javax.faces.validator.ValidatorException;

import model.ValidatorLogin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorLoginTest {
	
	private ValidatorLogin validator;

	@Before
	public void setUp() throws Exception {
		validator = new ValidatorLogin();
	}

	@After
	public void tearDown() throws Exception {
		validator = null;
	}

	@Test(expected=ValidatorException.class) 
	public final void testValidateNull() {
		
		validator.validate(null, null,null);
		
	}
	
	@Test 
	public final void testValidate() {
		try{
		validator.validate(null, null,"admin");
		}catch(ValidatorException e){
			fail("não deve lançar exceção ");
		}
		
	}

}
