package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Crowdfunding", schema="engajamundoDB")  
public class Crowdfunding {

	@Column (name="doacao")
	public Double valor;
	@Id
	@Column (name="login", length=20)
	public String login;
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}