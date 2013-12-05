/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.controller;

import controller.ControllerSession;
import entities.Engajador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class ControllerSessionTest {
    
    public ControllerSessionTest() {
    }

    /**
     * Test of autenticar method, of class ControllerSession.
     */
    @Test
    public void testAutenticar() {
        System.out.println("autenticar");
        ControllerSession instance = new ControllerSession();
        String expResult = "";
        String result = instance.autenticar();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of logoff method, of class ControllerSession.
     */
    @Test
    public void testLogoff() {
        System.out.println("logoff");
        ControllerSession instance = new ControllerSession();
        String expResult = "";
        String result = instance.logoff();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUsuarioAtual method, of class ControllerSession.
     */
    @Test
    public void testGetUsuarioAtual() {
        System.out.println("getUsuarioAtual");
        ControllerSession instance = new ControllerSession();
        Engajador expResult = null;
        Engajador result = instance.getUsuarioAtual();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getLogin method, of class ControllerSession.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        ControllerSession instance = new ControllerSession();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getSenha method, of class ControllerSession.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        ControllerSession instance = new ControllerSession();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUsuarioAtual method, of class ControllerSession.
     */
    @Test
    public void testSetUsuarioAtual() {
        System.out.println("setUsuarioAtual");
        Engajador usuarioAtual = null;
        ControllerSession instance = new ControllerSession();
        instance.setUsuarioAtual(usuarioAtual);
        
    }

    /**
     * Test of setLogin method, of class ControllerSession.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        ControllerSession instance = new ControllerSession();
        instance.setLogin(login);
        
    }

    /**
     * Test of setSenha method, of class ControllerSession.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        ControllerSession instance = new ControllerSession();
        instance.setSenha(senha);
       
    }

    /**
     * Test of isEhAdmin method, of class ControllerSession.
     */
    @Test
    public void testIsEhAdmin() {
        System.out.println("isEhAdmin");
        ControllerSession instance = new ControllerSession();
        boolean expResult = false;
        boolean result = instance.isEhAdmin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEhAdmin method, of class ControllerSession.
     */
    @Test
    public void testSetEhAdmin() {
        System.out.println("setEhAdmin");
        boolean ehAdmin = false;
        ControllerSession instance = new ControllerSession();
        instance.setEhAdmin(ehAdmin);
        
    }

    /**
     * Test of isEstaLogado method, of class ControllerSession.
     */
    @Test
    public void testIsEstaLogado() {
        System.out.println("isEstaLogado");
        ControllerSession instance = new ControllerSession();
        boolean expResult = false;
        boolean result = instance.isEstaLogado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstaLogado method, of class ControllerSession.
     */
    @Test
    public void testSetEstaLogado() {
        System.out.println("setEstaLogado");
        boolean estaLogado = false;
        ControllerSession instance = new ControllerSession();
        instance.setEstaLogado(estaLogado);
        
    }
}
