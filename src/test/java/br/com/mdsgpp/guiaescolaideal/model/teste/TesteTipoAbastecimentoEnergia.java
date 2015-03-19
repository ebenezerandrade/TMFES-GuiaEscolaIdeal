package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.TipoAbastecimentoEnergia;

public class TesteTipoAbastecimentoEnergia {

	private TipoAbastecimentoEnergia tipo;
	
	@Before
	public void setUP(){
		tipo = new TipoAbastecimentoEnergia();
		tipo.setTipo("publica");
	}
	
	@Test
	public void testGetTipo() {
		assertTrue(tipo.getTipo().equalsIgnoreCase("publica"));	
	}

	@Test
	public void testSetTipo() {
		tipo.setTipo("gerador");
		assertTrue(tipo.getTipo().equalsIgnoreCase("gerador"));	
		assertFalse(tipo.getTipo().equalsIgnoreCase("publica"));	
	}

}
