package testes;

import static org.junit.Assert.*;

import javax.faces.validator.ValidatorException;

import model.ValidatorMensagem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValidatorMensagemTest {

	private ValidatorMensagem validator = null;
	
	@Before
	public void setUp() throws Exception {
		validator = new ValidatorMensagem();
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
	public final void testValidateMaisde140() {
		
		validator.validate(null, null,"cccccccccccccccccccccccccccccccccccccccccc"
				+ "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"
				+ "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
				+ "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
				+ "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
				+ "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
				+ "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
				+ "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
		
	}
	
	@Test 
	public final void testValidateNotNull() {
		try{
		validator.validate(null, null,"messagem");
		}catch(Exception e){
			fail();
		}
		
	}

}
