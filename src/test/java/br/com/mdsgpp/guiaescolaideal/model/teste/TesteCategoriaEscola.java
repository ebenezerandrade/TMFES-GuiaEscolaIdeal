package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.CategoriaEscola;

public class TesteCategoriaEscola {
	
	private CategoriaEscola catEscola;
	
	@Before
	public void inic(){
		this.catEscola =  new CategoriaEscola(true);
	}
	
	@Test
	public void testValorConstrutor() {
		assertTrue(this.catEscola.isEscolaPublica());
	}
	
	@Test
	public void testGetSetDependenciaAdministritativa(){
		String dependencia = "privada";
		this.catEscola.setDependenciaAdministrativa(dependencia);
		
		assertTrue(this.catEscola.getDependenciaAdministrativa().equals(dependencia));
	}
	
	@Test
	public void testGetSetCategoriaEscolaPrivada(){
		String catEscolaPrivada = "privada";
				
		this.catEscola.setCategoriaEscolaPrivada(catEscolaPrivada);
		assertTrue(this.catEscola.getCategoriaEscolaPrivada().equals(catEscolaPrivada));
	}
	
	@Test
	public void testGetSetEscolaPublica(){
		boolean teste = false;
		
		this.catEscola.setEscolaPublica(teste);
		
		assertFalse(this.catEscola.isEscolaPublica());
	}
	
	@Test
	public void testConstrutor(){
	    assertFalse(new CategoriaEscola().isEscolaPublica());
	}

}
