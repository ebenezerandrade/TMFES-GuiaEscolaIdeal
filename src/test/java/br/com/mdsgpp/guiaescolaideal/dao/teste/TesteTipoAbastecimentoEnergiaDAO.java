package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.TipoAbastecimentoEnergiaDAO;

public class TesteTipoAbastecimentoEnergiaDAO extends DAO{
    	private TipoAbastecimentoEnergiaDAO dao;
    	
    	public TesteTipoAbastecimentoEnergiaDAO(String name) throws SQLException, Exception{
    	    super(name);
    	    this.dao = new TipoAbastecimentoEnergiaDAO(getConnection().getConnection());
    	}
    	
    	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-tipo-abastecimento-energia.xml"));
	}
	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorID(2002));
	}
	
	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorID(2222));
	}
	
}
