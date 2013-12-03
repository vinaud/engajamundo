package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Crowdfunding;

public class CrowdfundingTeste {

	@Test
	public void test() {
		Crowdfunding cr = new Crowdfunding();
		cr.setLogin("login");
		cr.setValor(56);
	
	}

}
