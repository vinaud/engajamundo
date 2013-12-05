package testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import controller.FormPaises;

public class TesteFormPaises {

	@Test
	public void test() {
		FormPaises f = new FormPaises();
		List<String> selectedMovies = null;
		selectedMovies.add("Chile");
		f.setSelectedPaises(selectedMovies);
		assertEquals(f.getPaises().isEmpty(), false);
		
		
	}
	
	 @Test
    public void testGetSelectedPaises() {
        System.out.println("getSelectedPaises");
        FormPaises instance = new FormPaises();
        List expResult = null;
        List result = instance.getSelectedPaises();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSelectedPaises method, of class FormPaises.
     */
    @Test
    public void testSetSelectedPaises() {
        System.out.println("setSelectedPaises");
        List<String> selectedMovies = null;
        FormPaises instance = new FormPaises();
        instance.setSelectedPaises(selectedMovies);
       
    }

    /**
     * Test of getPaises method, of class FormPaises.
     */
    @Test
    public void testGetPaises() {
        System.out.println("getPaises");
        FormPaises instance = new FormPaises();
        Map expResult = null;
        Map result = instance.getPaises();
        assertEquals(expResult, result);
        
    }

}
