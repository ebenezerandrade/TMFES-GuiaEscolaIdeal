package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Equipamento;

public class TesteEquipamento {
	private Equipamento equipamento;
	
	@Before
	public void setUp(){
		equipamento = new Equipamento();
		equipamento.setCodEquipamento(3);
		equipamento.setAparelho("tv");
	}
	
	@Test
	public void testGetCodEquipamento(){
		assertTrue(equipamento.getCodEquipamento() == 3);
	}
	
	@Test
	public void testSetCodEquipamento(){
		equipamento.setCodEquipamento(5);
		assertTrue(equipamento.getCodEquipamento() == 5);
	}
	
	@Test
	public void testGetAparelho(){
		assertTrue(equipamento.getAparelho().equalsIgnoreCase("tv"));
	}
	
	@Test
	public void testSetAparelho(){
		equipamento.setAparelho("dvd");
		assertTrue(equipamento.getAparelho().equalsIgnoreCase("dvd"));
	}

}
