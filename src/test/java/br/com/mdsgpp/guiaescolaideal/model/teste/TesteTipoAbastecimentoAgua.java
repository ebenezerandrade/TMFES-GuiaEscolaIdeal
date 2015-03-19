package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.TipoAbastecimentoAgua;

public class TesteTipoAbastecimentoAgua {

	private TipoAbastecimentoAgua tipo;

	@Before
	public void setUP() {
		tipo = new TipoAbastecimentoAgua();
		tipo.setTipo("publica");
	}

	@Test
	public void testGetTipo() {
		assertTrue(tipo.getTipo().equalsIgnoreCase("publica"));
	}

	@Test
	public void testSetTipo() {
		tipo.setTipo("fonte");
		assertTrue(tipo.getTipo().equalsIgnoreCase("fonte"));
		assertFalse(tipo.getTipo().equalsIgnoreCase("publica"));
	}

}
