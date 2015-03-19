package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Municipio;
import br.com.mdsgpp.guiaescolaideal.model.Telefone;

public class TesteTelefone {

	Telefone telefone = new Telefone();
	
	@Before
	public void setUp(){
		telefone.setTelefone("96465022");
		Municipio municipio = new Municipio();
		telefone.setMunicipio(municipio);
	}
	
	@Test
	public void testGetTelefone(){
		assertTrue(telefone.getTelefone().equalsIgnoreCase("96465022"));
	}
	
	@Test
	public void testSetTelefone(){
		telefone.setTelefone("teste");
		assertTrue(telefone.getTelefone().equalsIgnoreCase("teste"));
	}
	
	@Test
	public void testGetMunicipio(){
		assertNotNull(telefone.getMunicipio());
	}
	
	@Test
	public void testSetMunicipio(){
		telefone.setMunicipio(null);
		assertNull(telefone.getMunicipio());
	}
}
