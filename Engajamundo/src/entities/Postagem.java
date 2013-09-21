package entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Postagem", schema="engajamundoDB")  
public class Postagem {

	@Id
	@Column(name="idPostagem")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPostagem;
	@Column(name="login", length=20)
	private String login;
	@Column(name="titulo", length=20)
	private String titulo;
	@Column(name="texto", length=140)
	private String texto;
	@Column(name="tag", length=50)
	private String tags;
	public Postagem()
	{
		
	}
	
	public Postagem(String titulo, String texto, String tags, String login){ 
		this.titulo = titulo; 
		this.texto = texto; 
		this.tags = tags; 
		this.login = login;
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(int idPostagem) {
		this.idPostagem = idPostagem;
	}
}