/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.dao;

import dao.DAOEngajador;
import entities.Engajador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class DAOEngajadorTest {
    
    public DAOEngajadorTest() {
    }

    /**
     * Test of autenticar method, of class DAOEngajador.
     */
    @Test
    public void testAutenticar() throws Exception {
        System.out.println("autenticar");
        String login = "";
        String senha = "";
        DAOEngajador instance = new DAOEngajador();
        Engajador expResult = null;
        Engajador result = instance.autenticar(login, senha);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of editar method, of class DAOEngajador.
     */
    @Test
    public void testEditar() throws Exception {
        System.out.println("editar");
        Engajador engajador = null;
        String login = "";
        DAOEngajador instance = new DAOEngajador();
        instance.editar(engajador, login);
       
    }

    /**
     * Test of existeLogin method, of class DAOEngajador.
     */
    @Test
    public void testExisteLogin() {
        System.out.println("existeLogin");
        String login = "";
        DAOEngajador instance = new DAOEngajador();
        boolean expResult = false;
        boolean result = instance.existeLogin(login);
        assertEquals(expResult, result);
       
    }
}
