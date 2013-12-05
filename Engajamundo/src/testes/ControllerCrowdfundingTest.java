/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import controller.ControllerCrowdfunding;
import entities.Crowdfunding;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class ControllerCrowdfundingTest {
    
    public ControllerCrowdfundingTest() {
    }

    /**
     * Test of doar method, of class ControllerCrowdfunding.
     */
    @Test
    public void testDoar() throws Exception {
        System.out.println("doar");
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        String expResult = "";
        String result = instance.doar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDoacao method, of class ControllerCrowdfunding.
     */
    @Test
    public void testGetDoacao() {
        System.out.println("getDoacao");
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        Crowdfunding expResult = null;
        Crowdfunding result = instance.getDoacao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDoacao method, of class ControllerCrowdfunding.
     */
    @Test
    public void testSetDoacao() {
        System.out.println("setDoacao");
        Crowdfunding doacao = null;
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        instance.setDoacao(doacao);
        
    }

    /**
     * Test of getMetaCapacitacao method, of class ControllerCrowdfunding.
     */
    @Test
    public void testGetMetaCapacitacao() {
        System.out.println("getMetaCapacitacao");
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        Double expResult = null;
        Double result = instance.getMetaCapacitacao();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setMetaCapacitacao method, of class ControllerCrowdfunding.
     */
    @Test
    public void testSetMetaCapacitacao() {
        System.out.println("setMetaCapacitacao");
        Double metaCapacitacao = null;
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        instance.setMetaCapacitacao(metaCapacitacao);
        
    }

    /**
     * Test of getValorCapitado method, of class ControllerCrowdfunding.
     */
    @Test
    public void testGetValorCapitado() {
        System.out.println("getValorCapitado");
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        Double expResult = null;
        Double result = instance.getValorCapitado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setValorCapitado method, of class ControllerCrowdfunding.
     */
    @Test
    public void testSetValorCapitado() {
        System.out.println("setValorCapitado");
        Double valorCapitado = null;
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        instance.setValorCapitado(valorCapitado);
       
    }

    /**
     * Test of getPorcentagem method, of class ControllerCrowdfunding.
     */
    @Test
    public void testGetPorcentagem() {
        System.out.println("getPorcentagem");
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        Double expResult = null;
        Double result = instance.getPorcentagem();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPorcentagem method, of class ControllerCrowdfunding.
     */
    @Test
    public void testSetPorcentagem() {
        System.out.println("setPorcentagem");
        Double porcentagem = null;
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        instance.setPorcentagem(porcentagem);
       
    }

    /**
     * Test of getQtdPatrocinadores method, of class ControllerCrowdfunding.
     */
    @Test
    public void testGetQtdPatrocinadores() {
        System.out.println("getQtdPatrocinadores");
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        int expResult = 0;
        int result = instance.getQtdPatrocinadores();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setQtdPatrocinadores method, of class ControllerCrowdfunding.
     */
    @Test
    public void testSetQtdPatrocinadores() {
        System.out.println("setQtdPatrocinadores");
        int qtdPatrocinadores = 0;
        ControllerCrowdfunding instance = new ControllerCrowdfunding();
        instance.setQtdPatrocinadores(qtdPatrocinadores);
       
    }
}
