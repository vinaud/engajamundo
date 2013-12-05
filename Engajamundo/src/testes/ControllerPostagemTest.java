/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.controller;

import controller.ControllerPostagem;
import entities.Postagem;
import exceptions.DaoException;
import java.util.List;
import javax.faces.event.ActionEvent;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class ControllerPostagemTest {
    
    public ControllerPostagemTest() {
    }

    /**
     * Test of podeDeletar method, of class ControllerPostagem.
     */
    @Test
    public void testPodeDeletar() throws DaoException {
        System.out.println("podeDeletar");
        String login = "";
        String autor = "";
        ControllerPostagem instance = new ControllerPostagem();
        boolean expResult = false;
        boolean result = instance.podeDeletar(login, autor);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of postar method, of class ControllerPostagem.
     */
    @Test
    public void testPostar() throws Exception {
        System.out.println("postar");
        ControllerPostagem instance = new ControllerPostagem();
        String expResult = "";
        String result = instance.postar();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deletar method, of class ControllerPostagem.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        ActionEvent actionEvent = null;
        ControllerPostagem instance = new ControllerPostagem();
        instance.deletar(actionEvent);
        
    }

    /**
     * Test of getPostagem method, of class ControllerPostagem.
     */
    @Test
    public void testGetPostagem() throws DaoException {
        System.out.println("getPostagem");
        ControllerPostagem instance = new ControllerPostagem();
        Postagem expResult = null;
        Postagem result = instance.getPostagem();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTagAux method, of class ControllerPostagem.
     */
    @Test
    public void testGetTagAux() throws DaoException {
        System.out.println("getTagAux");
        ControllerPostagem instance = new ControllerPostagem();
        String expResult = "";
        String result = instance.getTagAux();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPost method, of class ControllerPostagem.
     */
    @Test
    public void testSetPost() throws DaoException {
        System.out.println("setPost");
        Postagem postagem = null;
        ControllerPostagem instance = new ControllerPostagem();
        instance.setPost(postagem);
        
    }

    /**
     * Test of setTagAux method, of class ControllerPostagem.
     */
    @Test
    public void testSetTagAux() throws DaoException {
        System.out.println("setTagAux");
        String tagAux = "";
        ControllerPostagem instance = new ControllerPostagem();
        instance.setTagAux(tagAux);
       
    }

    /**
     * Test of salvarPostagem method, of class ControllerPostagem.
     */
    @Test
    public void testSalvarPostagem() throws DaoException {
        System.out.println("salvarPostagem");
        ControllerPostagem instance = new ControllerPostagem();
        instance.salvarPostagem();
       
    }

    /**
     * Test of getPostagens method, of class ControllerPostagem.
     */
    @Test
    public void testGetPostagens() throws DaoException {
        System.out.println("getPostagens");
        ControllerPostagem instance = new ControllerPostagem();
        List expResult = null;
        List result = instance.getPostagens();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPostagens method, of class ControllerPostagem.
     */
    @Test
    public void testSetPostagens() throws DaoException {
        System.out.println("setPostagens");
        List<Postagem> postagens = null;
        ControllerPostagem instance = new ControllerPostagem();
        instance.setPostagens(postagens);
        
    }
}
