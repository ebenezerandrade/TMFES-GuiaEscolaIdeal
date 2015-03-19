package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.TipoDestinacaoLixo;

public class TesteTipoDestinacaoLixo {

	private TipoDestinacaoLixo tipo;

	@Before
	public void setUP() {
		tipo = new TipoDestinacaoLixo();
		tipo.setTipo("publica");
	}

	@Test
	public void testGetTipo() {
		assertTrue(tipo.getTipo().equalsIgnoreCase("publica"));
	}

	@Test
	public void testSetTipo() {
		tipo.setTipo("queima");
		assertTrue(tipo.getTipo().equalsIgnoreCase("queima"));
		assertFalse(tipo.getTipo().equalsIgnoreCase("publica"));
	}

}
