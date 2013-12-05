/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.dao;

import dao.DAOPostagem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class DAOPostagemTest {
    
    public DAOPostagemTest() {
    }

    /**
     * Test of deletar method, of class DAOPostagem.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        int idPostagem = 0;
        DAOPostagem instance = new DAOPostagem();
        instance.deletar(idPostagem);
        
    }
}
