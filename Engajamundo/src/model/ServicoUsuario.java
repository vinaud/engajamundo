package model;

import java.util.List;

import dao.DAOEngajador;
import dao.IDAOEngajador;
import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.CadastroFailException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

@SuppressWarnings("unused")
public class ServicoUsuario implements IServicoUsuario {

	private static ServicoUsuario singleton = null;

	private IDAOEngajador daoEngajador;
	private ValidatorNome vNome;
	private ValidatorEmail vEmail;
	private ValidatorTelefone vTelefone;
	private ValidatorData vData;
	private ValidatorLogin vLogin;
	
	public ServicoUsuario() {
		this.daoEngajador = new DAOEngajador();
		vNome = new ValidatorNome();
		vEmail = new ValidatorEmail();
		vTelefone = new ValidatorTelefone();
		vData = new ValidatorData();
		vLogin = new ValidatorLogin();
	}

	public static IServicoUsuario getInstance() {

		if (singleton == null) {
			singleton = new ServicoUsuario();
		}

		return singleton;

	}

	public List<Engajador> getUsers() throws DaoException
	{
		return daoEngajador.listar(Engajador.class.getName());
	}
	
	@Override
	public void cadastrarEngajador(Engajador engajador) throws CadastroFailException{
		try {
		    if(daoEngajador.existeLogin(String.valueOf(engajador.getLogin())) ||
		       engajador.getNome() == null || engajador.getNome().equals(null) ||
		       engajador.getNome().length() > 50 ||
		       !(engajador.getEmail().contains("@") ||
		       !(checaData(quebraData(engajador.getData_nascimento()))))) {
		           throw new CadastroFailException();
		       }
		    else
    		    this.daoEngajador.cadastrar(engajador);
		} catch (DaoException e) {
			
		}
	}

	public List<Engajador> buscarEngajador(String nomeEngajador) throws DaoException, BuscaSemResultadoException {
		List<Engajador> resultado = daoEngajador.buscar(Engajador.class.getSimpleName(), "nome", nomeEngajador);
	    if (resultado == null || resultado.equals(null))
	        throw new BuscaSemResultadoException();
	    else
	        return resultado; 
	}
	
	@Override
	public List<Engajador> buscarEngajadorPorPais(String nomePais) throws BuscaSemResultadoException, DaoException{
	    List<Engajador> resultado = daoEngajador.buscar(Engajador.class.getSimpleName(), "pais", nomePais);
        if (resultado == null || resultado.equals(null))
            throw new BuscaSemResultadoException();
        else
            return resultado; 		
	}

	@Override
	public Engajador buscarPorLogin(String nomeLogin) throws BuscaSemResultadoException, DaoException{
		return daoEngajador.buscar(Engajador.class.getSimpleName(), "login", nomeLogin).get(0);
	}

	@Override
	public Engajador autenticar(String login, String senha) throws LoginInvalidoException
	{
		return daoEngajador.autenticar(login, senha);
	}
	
	public void deletar(String login) throws DaoException {
		daoEngajador.deletar(login);
	}
	
	public void editar(Engajador engajador, String login) throws DaoException, BuscaSemResultadoException{
		this.daoEngajador.editar(engajador, login);
	}
	
	private int[] quebraData(String dataString) {
        String[] aux = dataString.split("/");
        int[] dataInt = new int[3];
        for (int i = 0; i < 3; i++) {
            dataInt[i] = Integer.parseInt(aux[i]);

        }
        return dataInt;
    }

    private boolean checaData(int[] dataInt) {
        int dia = dataInt[0];
        int mes = dataInt[1];
        int ano = dataInt[2];
        boolean bissexto = false;
        if (ano >= 1896 && ano <= 2020) { // se for um ano valido
            if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) { // se for bissexto
                bissexto = true;
            }

            if (mes >= 1 && mes <= 12) { // se for um mes valido

                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                        || mes == 10 || mes == 12) { // se for um mes com 31 dias
                    if (dia >= 1 && dia <= 31) { // se tiver 31 dias
                        return true;
                    }
                } else

                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // se for
                        // um mes com 30 dias
                        if (dia >= 1 && dia <= 30) { // se tiver ate 30 dias
                            return true;
                        }
                    } else

                        if (mes == 2) { // se for o mes 2
                            if (bissexto) { // se for bissexto
                                if (dia >= 1 && dia <= 29) { // se tem ate 29 dias
                                    return true;
                                }
                            } else { // se nao for bissexto
                                if (dia >= 1 && dia <= 28) { // se tem ate 28 dias
                                    return true;
                                }
                            }
                        }
            }

        }
        return false;
    }
}