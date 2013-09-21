package dao;

import entities.Postagem;

public interface IDAOPostagem extends IDaoGenerico<Postagem>{

	public void deletar(int idPostagem);
}
