package dao;

import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public interface IDAOEngajador extends IDaoGenerico<Engajador> {

	Engajador autenticar(String login, String senha) throws LoginInvalidoException;

	void editar(Engajador engajador, String login) throws DaoException, BuscaSemResultadoException;

	boolean existeLogin(String valueOf);

}
