package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.TipoAbastecimentoAguaDAO;

public class TesteTipoAbastecimentoAguaDAO extends DAO {
	
	private TipoAbastecimentoAguaDAO dao;
	
	public TesteTipoAbastecimentoAguaDAO(String name) throws SQLException, Exception {
		super(name);
		this.dao = new TipoAbastecimentoAguaDAO(getConnection().getConnection());
	}

	/*
	 * setando o arquivo xml utilizado no teste
	 */
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-tipo-abastecimento-agua.xml"));
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