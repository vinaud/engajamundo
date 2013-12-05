package testes;

import static org.junit.Assert.*;

import java.util.List;

import model.ServicoPostagem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Postagem;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import exceptions.UsuarioNaoAutenticadoException;

public class ServicoPostagemTest {
	
	private ServicoPostagem service = null;

	@Before
	public void setUp() throws Exception {
		service  = new ServicoPostagem();
	}

	@After
	public void tearDown() throws Exception {
		service  = null;
	}

	@Test
	public final void testGetInstance() {
		ServicoPostagem servico = service.getInstance();
		assertNotNull(servico);
	}

	@Test
	public final void testGetPostagens() throws DaoException {
		List<Postagem>  posts = service.getPostagens();
		
		assertNull(posts);
	}

	@Test
	public final void testPostar() throws UsuarioNaoAutenticadoException, DaoException, CadastroFailException {
		Postagem post = new Postagem();
		post.setLogin("loguin");
		post.setTags("tag");
		post.setTexto("texto");
		post.setTitulo("titulo");
		
		service.postar(post, "aux");
	}

	@Test
	public final void testDeletar() throws DaoException {
		service.deletar(-1);
	}

}
