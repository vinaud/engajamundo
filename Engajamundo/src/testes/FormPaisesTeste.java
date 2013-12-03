package testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import controller.FormPaises;

public class FormPaisesTeste {

	@Test
	public void test() {
		FormPaises f = new FormPaises();
		List<String> selectedMovies = null;
		selectedMovies.add("Chile");
		f.setSelectedPaises(selectedMovies);
		assertEquals(f.getPaises().isEmpty(), false);
		
		
	}

}
