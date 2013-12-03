package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Crowdfunding", schema="engajamundoDB")  
public class Crowdfunding {

	@Column (name="doacao")
	private Double valor;
	@Id
	@Column (name="login", length=20)
	private String login;
	
	public Double getValor() {
		return valor;
	}
	public void setValor(int i) {
		this.valor = (double) i;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}