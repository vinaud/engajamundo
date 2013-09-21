package twitter;

import java.util.Date;


public class MyTweets {
	public MyTweets(Date data, String autor, String texto) {
		super();
		this.data = data;
		this.autor = autor;
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	private Date data;
	private String autor;
	private String texto;
}