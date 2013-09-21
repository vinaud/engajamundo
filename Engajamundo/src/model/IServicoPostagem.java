package model;

import java.util.List;
import entities.Postagem;
import exceptions.UsuarioNaoAutenticadoException;

public interface IServicoPostagem {
	
	public List<Postagem> getPostagens();
	
	public void postar(Postagem post, String tagAux) throws UsuarioNaoAutenticadoException;

}