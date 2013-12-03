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

}
