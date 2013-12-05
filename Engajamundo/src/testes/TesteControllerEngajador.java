/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.controller;

import controller.ControllerEngajador;
import entities.Engajador;
import exceptions.DaoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class ControllerEngajadorTest {
    
    public ControllerEngajadorTest() {
    }

    /**
     * Test of selecionados method, of class ControllerEngajador.
     */
    @Test
    public void testSelecionados() throws DaoException {
        System.out.println("selecionados");
        int tam = 0;
        ControllerEngajador instance = new ControllerEngajador();
        instance.selecionados(tam);
        
    }

    /**
     * Test of editar method, of class ControllerEngajador.
     */
    @Test
    public void testEditar() throws DaoException {
        System.out.println("editar");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.editar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of buscarPorPais method, of class ControllerEngajador.
     */
    @Test
    public void testBuscarPorPais() throws DaoException {
        System.out.println("buscarPorPais");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.buscarPorPais();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of buscarPorNome method, of class ControllerEngajador.
     */
    @Test
    public void testBuscarPorNome() throws DaoException {
        System.out.println("buscarPorNome");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.buscarPorNome();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of cadastrarEngajador method, of class ControllerEngajador.
     */
    @Test
    public void testCadastrarEngajador() throws DaoException {
        System.out.println("cadastrarEngajador");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.cadastrarEngajador();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of deletar method, of class ControllerEngajador.
     */
    @Test
    public void testDeletar() throws DaoException {
        System.out.println("deletar");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.deletar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of visualizar method, of class ControllerEngajador.
     */
    @Test
    public void testVisualizar() throws Exception {
        System.out.println("visualizar");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.visualizar();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of criarPostagem method, of class ControllerEngajador.
     */
    @Test
    public void testCriarPostagem() throws DaoException {
        System.out.println("criarPostagem");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.criarPostagem();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of buscas method, of class ControllerEngajador.
     */
    @Test
    public void testBuscas() {
        System.out.println("buscas");
        ControllerEngajador instance = null;
        try {
            instance = new ControllerEngajador();
        } catch (DaoException ex) {
            Logger.getLogger(ControllerEngajadorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        String expResult = "";
        String result = instance.buscas();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of atualizar method, of class ControllerEngajador.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.atualizar();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of buscarEngajadorPorNome method, of class ControllerEngajador.
     */
    @Test
    public void testBuscarEngajadorPorNome() throws DaoException {
        System.out.println("buscarEngajadorPorNome");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.buscarEngajadorPorNome();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of buscarEngajadorPorPais method, of class ControllerEngajador.
     */
    @Test
    public void testBuscarEngajadorPorPais() throws DaoException {
        System.out.println("buscarEngajadorPorPais");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.buscarEngajadorPorPais();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEngajador method, of class ControllerEngajador.
     */
    @Test
    public void testGetEngajador() throws DaoException {
        System.out.println("getEngajador");
        ControllerEngajador instance = new ControllerEngajador();
        Engajador expResult = null;
        Engajador result = instance.getEngajador();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setEngajador method, of class ControllerEngajador.
     */
    @Test
    public void testSetEngajador() throws DaoException {
        System.out.println("setEngajador");
        Engajador engajador = null;
        ControllerEngajador instance = new ControllerEngajador();
        instance.setEngajador(engajador);
        
    }

    /**
     * Test of getUsuarios method, of class ControllerEngajador.
     */
    @Test
    public void testGetUsuarios() throws DaoException {
        System.out.println("getUsuarios");
        ControllerEngajador instance = new ControllerEngajador();
        List expResult = null;
        List result = instance.getUsuarios();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of buscarEngajadores method, of class ControllerEngajador.
     */
    @Test
    public void testBuscarEngajadores() throws Exception {
        System.out.println("buscarEngajadores");
        ControllerEngajador instance = new ControllerEngajador();
        List expResult = null;
        List result = instance.buscarEngajadores();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsuarios method, of class ControllerEngajador.
     */
    @Test
    public void testSetUsuarios() throws DaoException {
        System.out.println("setUsuarios");
        List<Engajador> usuarios = null;
        ControllerEngajador instance = new ControllerEngajador();
        instance.setUsuarios(usuarios);
       
    }

    /**
     * Test of isBuscou method, of class ControllerEngajador.
     */
    @Test
    public void testIsBuscou() throws DaoException {
        System.out.println("isBuscou");
        ControllerEngajador instance = new ControllerEngajador();
        boolean expResult = false;
        boolean result = instance.isBuscou();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setBuscou method, of class ControllerEngajador.
     */
    @Test
    public void testSetBuscou() throws DaoException {
        System.out.println("setBuscou");
        boolean buscou = false;
        ControllerEngajador instance = new ControllerEngajador();
        instance.setBuscou(buscou);
        
    }

    /**
     * Test of getQuery method, of class ControllerEngajador.
     */
    @Test
    public void testGetQuery() throws DaoException {
        System.out.println("getQuery");
        ControllerEngajador instance = new ControllerEngajador();
        String expResult = "";
        String result = instance.getQuery();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQuery method, of class ControllerEngajador.
     */
    @Test
    public void testSetQuery() throws DaoException {
        System.out.println("setQuery");
        String query = "";
        ControllerEngajador instance = new ControllerEngajador();
        instance.setQuery(query);
       
    }

    /**
     * Test of getUsuarioSelecionados method, of class ControllerEngajador.
     */
    @Test
    public void testGetUsuarioSelecionados() throws DaoException {
        System.out.println("getUsuarioSelecionados");
        ControllerEngajador instance = new ControllerEngajador();
        List expResult = null;
        List result = instance.getUsuarioSelecionados();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsuarioSelecionados method, of class ControllerEngajador.
     */
    @Test
    public void testSetUsuarioSelecionados() throws DaoException {
        System.out.println("setUsuarioSelecionados");
        List<Engajador> usuarioSelecionados = null;
        ControllerEngajador instance = new ControllerEngajador();
        instance.setUsuarioSelecionados(usuarioSelecionados);
        
    }
}
