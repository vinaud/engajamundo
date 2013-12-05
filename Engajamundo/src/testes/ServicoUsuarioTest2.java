package testes;

import static org.junit.Assert.*;

import java.util.List;

import javax.faces.validator.ValidatorException;

import model.IServicoUsuario;
import model.ServicoUsuario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public class ServicoUsuarioTest {
	
	private ServicoUsuario validator;

	@Before
	public void setUp() throws Exception {
		validator = new ServicoUsuario();
	}

	@After
	public void tearDown() throws Exception {
		validator = null;
	}

	

	@Test
	public final void testGetInstance() {
		IServicoUsuario service = validator.getInstance();
		assertTrue(service != null);
	}

	@Test
	public final void testGetUsers() throws DaoException {
		 List<Engajador> users = validator.getUsers();
		 assertTrue(users != null);
	}

	@Test (expected=ValidatorException.class)
	public final void testCadastrarEngajadorNulo() throws CadastroFailException {
		validator.cadastrarEngajador(null);
	}
	
	@Test 
	public final void testCadastrarEngajador() throws CadastroFailException {
		
		Engajador eng = new Engajador();
		eng.setCidade("cidade");
		eng.setNome("nome");
		eng.setEmail("eng@gmail.com");
		eng.setLogin("eng");
		eng.setComentarios("fssf");
		eng.setData_nascimento("21/07/2003");
		eng.setPais("Brasil");
		validator.cadastrarEngajador(eng);
	}

	@Test (expected=CadastroFailException.class)
	public final void testBuscarEngajador() {
		try {
			validator.buscarEngajador("admin");
		} catch (DaoException e) {
			fail();
		} catch (BuscaSemResultadoException e) {
			fail();
		}
	}

	@Test (expected=CadastroFailException.class)
	public final void testBuscarEngajadorPorPais() throws BuscaSemResultadoException, DaoException {
		
			validator.buscarEngajadorPorPais("Correia");
		
	}

	@Test
	public final void testBuscarPorLogin() throws BuscaSemResultadoException, DaoException {
		Engajador eng = validator.buscarPorLogin("admin");
		
		assertNotNull(eng);
		
	}

	@Test
	public final void testAutenticar() throws LoginInvalidoException {
		Engajador eng = validator.autenticar(null, null);
		
		assertNull(eng);
		
		
	}

	@Test
	public final void testDeletar() {
		
	}

	@Test
	public final void testEditar() {
		
	}

}
