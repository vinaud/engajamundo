package testes;

import static org.junit.Assert.*;
import model.ServicoUsuario;
import entities.Engajador;

import org.junit.Test;

import exceptions.LoginInvalidoException;
import exceptions.CadastroFailException;

public class ServicoUsuarioTeste {

	@Test
	public void testLogin() throws LoginInvalidoException {
		ServicoUsuario ser = new ServicoUsuario();
		
			ser.autenticar("usuario", "senha");
	
	}
	
	@Test
	public void testCadastro() throws LoginInvalidoException{
		ServicoUsuario ser = new ServicoUsuario();
		Engajador eng = new Engajador();
		
			ser.cadastrarEngajador(eng);
		
		
		
	}

}
