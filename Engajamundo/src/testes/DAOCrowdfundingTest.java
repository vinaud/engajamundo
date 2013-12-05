/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes.dao;

import dao.DAOCrowdfunding;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinaud
 */
public class DAOCrowdfundingTest {
    
    public DAOCrowdfundingTest() {
    }

    /**
     * Test of getDoacoes method, of class DAOCrowdfunding.
     */
    @Test
    public void testGetDoacoes() {
        System.out.println("getDoacoes");
        DAOCrowdfunding instance = new DAOCrowdfunding();
        Double expResult = null;
        Double result = instance.getDoacoes();
        assertEquals(expResult, result);
        
    }
}
