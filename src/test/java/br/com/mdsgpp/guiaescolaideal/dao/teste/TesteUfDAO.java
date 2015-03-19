package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.UfDAO;

public class TesteUfDAO extends DAO {

    private UfDAO dao;

    public TesteUfDAO(String name) throws SQLException, Exception{
	    super(name);
	    this.dao = new UfDAO(getConnection().getConnection());
	}

    @Override
    protected IDataSet getDataSet() throws Exception {
	return new FlatXmlDataSetBuilder().build(new FileInputStream(
		"xml-dbunit/banco-uf.xml"));
    }
    @Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorID(1000));
}
    @Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorID(8888));
	}
}