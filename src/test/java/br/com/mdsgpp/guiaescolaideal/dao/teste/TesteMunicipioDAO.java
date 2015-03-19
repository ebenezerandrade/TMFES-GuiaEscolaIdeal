package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.MunicipioDAO;


public class TesteMunicipioDAO extends DAO{

	private MunicipioDAO dao;
			
	public TesteMunicipioDAO (String name)throws SQLException, Exception{
	    super(name);
	    this.dao = new MunicipioDAO(getConnection().getConnection());
  	}
	    	
    @Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-municipio.xml"));
	}
    
	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorId(5003207));
	}
	
	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorId(2222));
	}
	

}
