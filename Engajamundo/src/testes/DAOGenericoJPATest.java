/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.dao;

import dao.DAOGenericoJPA;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class DAOGenericoJPATest {
    
    public DAOGenericoJPATest() {
    }

    /**
     * Test of cadastrar method, of class DAOGenericoJPA.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        Object entidade = null;
        DAOGenericoJPA instance = new DAOGenericoJPA();
        instance.cadastrar(entidade);
       
    }

    /**
     * Test of deletar method, of class DAOGenericoJPA.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        String id = "";
        DAOGenericoJPA instance = new DAOGenericoJPA();
        instance.deletar(id);
        
    }

    /**
     * Test of buscar method, of class DAOGenericoJPA.
     */
    @Test
    public void testBuscar() throws Exception {
        System.out.println("buscar");
        String tabela = "";
        String coluna = "";
        String parametro = "";
        DAOGenericoJPA instance = new DAOGenericoJPA();
        List expResult = null;
        List result = instance.buscar(tabela, coluna, parametro);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of existeID method, of class DAOGenericoJPA.
     */
    @Test
    public void testExisteID() throws Exception {
        System.out.println("existeID");
        String tabela = "";
        String parametro = "";
        DAOGenericoJPA instance = new DAOGenericoJPA();
        boolean expResult = false;
        boolean result = instance.existeID(tabela, parametro);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of listar method, of class DAOGenericoJPA.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        String tabela = "";
        DAOGenericoJPA instance = new DAOGenericoJPA();
        List expResult = null;
        List result = instance.listar(tabela);
        assertEquals(expResult, result);
        
    }
}
