package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;

public class TesteEscolaDAO extends DAO {
	
	private EscolaDAO dao;
	
	public TesteEscolaDAO(String name) throws SQLException, Exception {
		super(name);
		this.dao = new EscolaDAO(getConnection().getConnection());
	}
	
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-escola.xml"));
	}

	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorID(75001));
	}

	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorID(75000));
	}
	
	@Test
	public void testPesquisarPorNome() throws SQLException, Exception {
		assertTrue(this.dao.pesquisarPorNome("mds", 0, 100).size() == 1);
	}
	
	@Test
	public void testPesquisarPorNomeInexistente() throws SQLException, Exception {
		assertTrue(this.dao.pesquisarPorNome("XPTO", 0, 100).size() == 0);
	}
	
	@Test
	public void testPesquisarpesquisarPorNomeComPalavrasChaves() throws SQLException, Exception {
		List<String> listaPalavras = new ArrayList<String>();
		listaPalavras.add("mds");
		listaPalavras.add("java");
		
		assertTrue(this.dao.pesquisarPorNomeComPalavrasChaves(listaPalavras, 0, 100).size() == 1);
	}
	
	@Test
	public void testPesquisarpesquisarPorNomeComPalavrasChavesCombina��oInexistente() throws SQLException, Exception {
		List<String> listaPalavras = new ArrayList<String>();
		listaPalavras.add("mds");
		listaPalavras.add("ruby");
		
		assertTrue(this.dao.pesquisarPorNomeComPalavrasChaves(listaPalavras, 0, 100).size() == 0);
	}
	

}