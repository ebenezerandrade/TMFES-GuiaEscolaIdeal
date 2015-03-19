package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.LocalFuncionamento;

public class TesteLocalFuncionamento {
	
	private LocalFuncionamento local;
	
	@Before
	public void setUP(){
		local = new LocalFuncionamento();
		
		boolean condicao = true;
		local.setCodLocalFuncionamento(666);
		local.setTipoLocalFuncionamento("alugado");
		local.setFuncionaEmCasaProfessor(condicao);
		local.setFuncionaEmOutraEscola(condicao);
		local.setFuncionaEmOutros(condicao);
		local.setFuncionaEmRancho(condicao);
		local.setFuncionaEmSalaEmpresa(condicao);
		local.setFuncionaEmTemplosIgrejas(condicao);
		local.setFuncionaEmUnidadeInternacao(condicao);
		
	}
	
	@Test
	public void testGetCodLocalFuncionamento() {
		assertTrue(local.getCodLocalFuncionamento() == 666);
	}

	@Test
	public void testSetCodLocalFuncionamento() {
		local.setCodLocalFuncionamento(0);
		assertTrue(local.getCodLocalFuncionamento() == 0);
	}

	@Test
	public void testGetTipoLocalFuncionamento() {
		assertTrue(local.getTipoLocalFuncionamento().equalsIgnoreCase("Alugado"));
	}

	@Test
	public void testSetTipoLocalFuncionamento() {
		local.setTipoLocalFuncionamento("proprio");
		assertTrue(local.getTipoLocalFuncionamento().equalsIgnoreCase("proprio"));
	}

	@Test
	public void testIsFuncionaEmSalaEmpresa() {
		assertTrue(local.isFuncionaEmSalaEmpresa());
	}

	@Test
	public void testSetFuncionaEmSalaEmpresa() {
		local.setFuncionaEmSalaEmpresa(false);
		assertFalse(local.isFuncionaEmSalaEmpresa());
	}

	@Test
	public void testIsFuncionaEmUnidadeInternacao() {
		assertTrue(local.isFuncionaEmUnidadeInternacao());
	}

	@Test
	public void testSetFuncionaEmUnidadeInternacao() {
		local.setFuncionaEmUnidadeInternacao(false);
		assertFalse(local.isFuncionaEmUnidadeInternacao());
	}

	@Test
	public void testIsFuncionaEmTemplosIgrejas() {
		assertTrue(local.isFuncionaEmTemplosIgrejas());
	}

	@Test
	public void testSetFuncionaEmTemplosIgrejas() {
		local.setFuncionaEmTemplosIgrejas(false);
		assertFalse(local.isFuncionaEmTemplosIgrejas());
	}

	@Test
	public void testIsFuncionaEmCasaProfessor() {
		assertTrue(local.isFuncionaEmCasaProfessor());
	}

	@Test
	public void testSetFuncionaEmCasaProfessor() {
		local.setFuncionaEmCasaProfessor(false);
		assertFalse(local.isFuncionaEmCasaProfessor());
	}

	@Test
	public void testIsFuncionaEmRancho() {
		assertTrue(local.isFuncionaEmRancho());
	}

	@Test
	public void testSetFuncionaEmRancho() {
		local.setFuncionaEmRancho(false);
		assertFalse(local.isFuncionaEmRancho());
	}

	@Test
	public void testIsFuncionaEmOutros() {
		assertTrue(local.isFuncionaEmOutros());
	}

	@Test
	public void testSetFuncionaEmOutros() {
		local.setFuncionaEmOutros(false);
		assertFalse(local.isFuncionaEmOutros());
	}

	@Test
	public void testIsFuncionaEmOutraEscola() {
		assertTrue(local.isFuncionaEmOutraEscola());
	}

	@Test
	public void testSetFuncionaEmOutraEscola() {
		local.setFuncionaEmOutraEscola(false);
		assertFalse(local.isFuncionaEmOutraEscola());
	}

}
