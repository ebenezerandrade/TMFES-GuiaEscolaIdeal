package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Municipio;
import br.com.mdsgpp.guiaescolaideal.model.Uf;

public class TesteMunicipio {
	Municipio municipio = new Municipio();

	@Before
	public void setUp() {
		municipio.setCodigoDDD("teste");
		municipio.setNome("teste");
		municipio.setUf(new Uf());
	}

	@Test
	public void testGetcodigoDDD() {
		assertTrue(municipio.getCodigoDDD().equals("teste"));
	}

	@Test
	public void testSetCodigoDDD() {
		municipio.setCodigoDDD("teste2");
		assertTrue(municipio.getCodigoDDD().equals("teste2"));
	}

	@Test
	public void testGetNome() {
		assertTrue(municipio.getNome().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetNome() {
		municipio.setNome("teste2");
		assertTrue(municipio.getNome().equalsIgnoreCase("teste2"));
	}
	
	@Test
	public void testGetUF() {
		assertNotNull(municipio.getUf());
	}

	@Test
	public void testSetUF() {
		municipio.setUf(null);
		assertNull(municipio.getUf());
	}
}
