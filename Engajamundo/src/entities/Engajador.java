package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Engajador", schema="engajamundoDB")  
public class Engajador {
	
	@Column(name="nome", length=50)
	private String nome;
	@Column(name="sobrenome", length=50)
	private String sobrenome;
	@Column(name="email", length=50)
	private String email;
	@Column(name="dataNascimento", length=10)
	private String data_nascimento; 
	@Column(name="telefone", length=12)
	private int telefone; 
	@Column(name="skype", length=20)
	private String profile_skype; 
	@Column(name="fbProfile", length=50)
	private String profile_facebook;
	@Column(name="cidade", length=30)
	private String cidade;
	@Column(name="estado", length=30)
	private String estado;
	@Column(name="pais", length=30)
	private String pais;
	private String comentarios;
	@Id
	@Column(name="login", length=20)
	private String login;
	@Column(name="senha", length=16)
	private String senha;
	
	private boolean selecionado;
	
	public Engajador(){
		
	}

	
	public Engajador(String nome, String sobrenome, String email,
			String data_nascimento, int telefone, String pais, String login, String senha) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.telefone = telefone;
		this.pais = pais;
		this.selecionado = false;
		this.login = login;
		this.senha = senha;
	}


	public Engajador(String nome) {
		this.nome = nome; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getProfile_skype() {
		return profile_skype;
	}

	public void setProfile_skype(String profile_skype) {
		this.profile_skype = profile_skype;
	}

	public String getProfile_facebook() {
		return profile_facebook;
	}

	public void setProfile_facebook(String profile_facebook) {
		this.profile_facebook = profile_facebook;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public boolean isSelecionado() {
		return selecionado;
	}


	public void setSelecionado(boolean selecionado) {
		this.selecionado = selecionado;
	}


	public String getLogin() {
		return login;
	}


	public String getSenha() {
		return senha;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

}