package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.CategoriaEscolaDAO;

public class TesteCategoriaEscolaDAO extends DAO {
	
	private CategoriaEscolaDAO dao;
	
	public TesteCategoriaEscolaDAO(String name) throws SQLException, Exception {
		super(name);
		this.dao = new CategoriaEscolaDAO(getConnection().getConnection());
	}

	/*
	 * setando o arquivo xml utilizado no teste
	 */
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-categoria-escola.xml"));
	}

	
	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorID(456));
	}

	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorID(666));
	}
	
	@Test
	public void testIsEscolaPublica() throws SQLException{
		assertTrue(this.dao.pesquisarPorID(457).isEscolaPublica());
	}
	
	@Test
	public void testIsEscolaPrivada() throws SQLException{
		assertFalse(this.dao.pesquisarPorID(456).isEscolaPublica());
	}

}
