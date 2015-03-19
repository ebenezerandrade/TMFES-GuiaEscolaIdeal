package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.TipoSistemaDeEsgotoDAO;

public class TesteTipoSistemaDeEsgotoDAO extends DAO{
    	private TipoSistemaDeEsgotoDAO dao;
    	
    	public TesteTipoSistemaDeEsgotoDAO(String name) throws SQLException, Exception{
    	    super(name);
    	    this.dao = new TipoSistemaDeEsgotoDAO(getConnection().getConnection());
    	}
    	
    	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-tipo-esgoto.xml"));
	}
	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorID(1000));
	}
	
	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorID(3322));
	}
	
}
