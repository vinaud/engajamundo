package testes;

import static org.junit.Assert.*;
import model.ServicoUsuario;

import org.junit.Test;

import exceptions.LoginInvalidoException;

public class ServicoUsuarioTeste {

	@Test
	public void testLogin() {
		ServicoUsuario ser = new ServicoUsuario();
		try {
			ser.autenticar("usuario", "senha");
		} catch (LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCadastro() {
		ServicoUsuario ser = new ServicoUsuario();
		Engajador eng = new Engajador();
		try {
			ser.cadastrarEngajador(eng);
		} catch (CadastroFailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
