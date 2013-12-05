package testes;

import static org.junit.Assert.*;

import javax.faces.validator.ValidatorException;

import model.ValidatorData;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorDataTest {
	
	private ValidatorData validator = null;

	@Before
	public void setUp() throws Exception {
		validator = new ValidatorData();
	}

	@After
	public void tearDown() throws Exception {
		validator = null;
	}

	@Test(expected=NumberFormatException.class) 
	public void testValidate() {
		validator.validate(null, null, null);
	}
	
	@Test 
	public void testValidateDataCorreta() {
		try{
		validator.validate(null, null, "19/12/2000");
		}catch(ValidatorException e){
			fail("não deve lançar exceção");
		}
	}

}
