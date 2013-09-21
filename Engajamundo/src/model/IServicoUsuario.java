package model;

import java.util.List;


import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public interface IServicoUsuario {
	
	void cadastrarEngajador(Engajador engajador) throws DaoException, CadastroFailException;

	List<Engajador> getUsers() throws DaoException;

	List<Engajador> buscarEngajador(String nome) throws DaoException, BuscaSemResultadoException;

	List<Engajador> buscarEngajadorPorPais(String pais) throws DaoException, BuscaSemResultadoException;
	
	Engajador buscarPorLogin(String login) throws BuscaSemResultadoException, DaoException;

	Engajador autenticar(String login, String senha) throws LoginInvalidoException;
	
	void deletar(String login) throws DaoException;

	void editar(Engajador engajador, String login) throws DaoException, BuscaSemResultadoException;
	
}