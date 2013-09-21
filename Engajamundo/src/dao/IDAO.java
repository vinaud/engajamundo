package dao;

import java.util.List;

import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;
import entities.Crowdfunding;
import entities.Engajador;
import entities.Postagem;

public interface IDAO  {

	void cadastrarEngajador(Engajador engajador) throws DaoException;

	List<Engajador> getUsers();

	List<Engajador> buscarEngajador(String query) throws DaoException, BuscaSemResultadoException;

	List<Engajador> buscarEngajadorPorPais(String query) throws DaoException, BuscaSemResultadoException;
	
	void savePost(Postagem post);

	Engajador autenticar(String login, String senha) throws LoginInvalidoException;
	
	boolean existeLogin(String login);
	
	boolean deletar(String login);

	List<Postagem> listarPostagens();
	
	Engajador buscarPorLogin(String login);

	void editar(Engajador engajador, String login);

	void saveDoacao(Crowdfunding doacao);

	Double getDoacoes();

	void deletarPostagem(int idPostagem);
}