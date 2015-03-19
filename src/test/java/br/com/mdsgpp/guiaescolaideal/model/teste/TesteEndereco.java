package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Endereco;
import br.com.mdsgpp.guiaescolaideal.model.Municipio;
import br.com.mdsgpp.guiaescolaideal.model.Posicao;

public class TesteEndereco {
	Endereco endereco = new Endereco();

	@Before
	public void setUp() {
		endereco.setBairro("teste");
		endereco.setRua("teste");
		endereco.setCep(1234);
		endereco.setNumero("teste");
		endereco.setComplemento("teste");
		endereco.setMunicipio(new Municipio());
	}

	@Test
	public void testGetBairro() {
		assertTrue(endereco.getBairro().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetBairro() {
		endereco.setBairro("teste2");
		assertTrue(endereco.getBairro().equalsIgnoreCase("teste2"));
	}

	@Test
	public void testGetRua() {
		assertTrue(endereco.getRua().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetRua() {
		endereco.setRua("teste2");
		assertTrue(endereco.getRua().equalsIgnoreCase("teste2"));
	}

	@Test
	public void testGetCep() {
		assertEquals(endereco.getCep(), 1234);
	}

	@Test
	public void testSetCep() {
		endereco.setCep(4321);
		assertEquals(endereco.getCep(), 4321);
	}

	@Test
	public void testGetNumero() {
		assertTrue(endereco.getNumero().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetNumero() {
		endereco.setNumero("teste2");
		assertTrue(endereco.getNumero().equalsIgnoreCase("teste2"));
	}

	@Test
	public void testGetComplemento() {
		assertTrue(endereco.getComplemento().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetComplemento() {
		endereco.setComplemento("teste2");
		assertTrue(endereco.getComplemento().equalsIgnoreCase("teste2"));
	}

	@Test
	public void testGetMunicipio() {
		assertNotNull(endereco.getMunicipio());
	}

	@Test
	public void testSetMunicipio() {
		endereco.setMunicipio(null);
		assertNull(endereco.getMunicipio());
	}
	
	@Test
	public void testPosicao(){
	    endereco.setPosicao(new Posicao());
	    
	    assertNotNull(endereco.getPosicao());
	}
}
