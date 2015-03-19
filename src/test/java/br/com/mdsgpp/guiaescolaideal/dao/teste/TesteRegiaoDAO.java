package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.RegiaoDAO;

public class TesteRegiaoDAO extends DAO {
	
	private RegiaoDAO dao;
	
	public TesteRegiaoDAO(String name) throws SQLException, Exception {
		super(name);
		this.dao = new RegiaoDAO(getConnection().getConnection());
	}

	/*
	 * setando o arquivo xml utilizado no teste
	 */
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-regiao.xml"));
	}

	
	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorId(456));
	}

	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorId(666));
	}
	

}