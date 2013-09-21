package dao;

import java.util.ArrayList;
import java.util.List;

import exceptions.DaoException;

import entities.Crowdfunding;
import entities.Engajador;
import entities.Postagem;

public class DaoEmMemoria implements IDAO {

	private ArrayList<Engajador> engajadores;
	private ArrayList<Postagem> postagens;
	private String nome = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DaoEmMemoria() {
		engajadores = new ArrayList();
		engajadores.add(new Engajador("Lucas", "Rodrigues", "lucas@bol.com.br", "01/07/1993", 99749574, "Brasil", "lucas", "123"));
		engajadores.add(new Engajador("Itanildo", "Augusto", "ssdfg@bol.com.br", "12/12/1567", 45364756, "Brasil", "ita", "321"));
		engajadores.add(new Engajador("Mariana", "Cagona", "shalala@ig.com.br", "04/05/1667", 85746352, "Japao", "usp", "oquer"));
		
		postagens = new ArrayList();
	}

	public ArrayList<Engajador> getUsers(){
		return this.engajadores;
	}

	public void saveUsers(ArrayList<Engajador> usuarios) {
		this.engajadores = usuarios;
	}
	
	public void cadastrarEngajador(Engajador engajador)
			throws DaoException {

		try {

			engajadores.add(engajador);

			for (int i = 0; i < engajadores.size(); i++) {
				System.out.println(engajadores.get(i).getNome()
						+ " foi cadastrado com sucesso!!!");
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}

	}

	@Override
	public ArrayList<Engajador> buscarEngajador(String query) throws DaoException {

		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<Engajador> usuarios = new ArrayList();
		for (int i = 0; i < engajadores.size(); i++) {
			if (engajadores.get(i).getNome().equals(query)) {
				System.out.println("Resultado:" + query);
				usuarios.add(engajadores.get(i));
			}

		}
		if (usuarios.size() == 0)
			throw new DaoException(new Exception());
		else
			return usuarios;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public ArrayList<Engajador> buscarEngajadorPorPais(String query) throws DaoException {

		ArrayList<Engajador> usuarios = new ArrayList();
		for (int i = 0; i < engajadores.size(); i++) {
			if (engajadores.get(i).getPais().equals(query)) {
				System.out.println("Resultado:" + query);
				usuarios.add(engajadores.get(i));
			}

		}
		if (usuarios.size() == 0) {
			System.out.println("array vazio");//throw new DaoException("Usuário não encontrado");
		return new ArrayList();
		}
		else
			return usuarios;
	}
	
	
	
	@Override
	public Engajador autenticar(String login, String senha)
	{
		Engajador e = null;
		for (int i = 0; i < engajadores.size(); i++)
		{
			if (engajadores.get(i).getLogin().equals(login) && engajadores.get(i).getSenha().equals(senha))
			{
				e = engajadores.get(i);
				i = engajadores.size();
			}
		}
		return e;
	}
	public void savePost(Postagem post)
	{
		postagens.add(post);
	}

	@Override
	public boolean existeLogin(String login) {
		
		for (int i = 0; i < engajadores.size(); i++)
		{
			if (engajadores.get(i).getLogin().equals(login))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(String login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Postagem> listarPostagens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Engajador buscarPorLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Engajador engajador, String login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDoacao(Crowdfunding doacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getDoacoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletarPostagem(int idPostagem) {
		// TODO Auto-generated method stub
		
	}

}