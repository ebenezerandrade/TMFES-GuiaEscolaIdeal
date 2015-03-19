package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Regiao;
import br.com.mdsgpp.guiaescolaideal.model.Uf;

public class TesteUf {
	Uf uf = new Uf();

	@Before
	public void setUp() {
		uf.setEstado("teste");
		uf.setRegiao(new Regiao());
	}

	@Test
	public void testGetEstado() {
		assertTrue(uf.getEstado().equalsIgnoreCase("teste"));
	}

	@Test
	public void testSetEstado() {
		uf.setEstado("teste2");
		assertTrue(uf.getEstado().equalsIgnoreCase("teste2"));
	}
	
	@Test
	public void testGetRegiao() {
		assertNotNull(uf.getRegiao());
	}

	@Test
	public void testSetRegiao() {
		uf.setRegiao(null);
		assertNull(uf.getRegiao());
	}
	
}
