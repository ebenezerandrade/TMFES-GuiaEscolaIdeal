package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.TelefoneDAO;
import br.com.mdsgpp.guiaescolaideal.model.Telefone;

public class TesteTelefoneDAO extends DAO
{

    private TelefoneDAO dao;
    
    public TesteTelefoneDAO(String name) throws SQLException, Exception {
	super(name);
	this.dao= new TelefoneDAO(getConnection().getConnection());
    }

    @Override
    protected IDataSet getDataSet() throws Exception 
    {
	return new FlatXmlDataSetBuilder().build(new FileInputStream(
		"xml-dbunit/banco-telefone.xml"));
    }
    
    @Test
    public void testPesquisarPorId() throws Exception, SQLException
    {
	assertNotNull(this.dao.pesquisarPorID(11111));
    }
    
    @Test
    public void testPesquisarPorIDInexistente() throws SQLException
    {
	assertNull(this.dao.pesquisarPorID(34567));
    }
    
    @Test
    public void testPesquisarPorIDEscola() throws SQLException{
    	Telefone telefone = this.dao.pesquisarPorIDEscola(51235);
    	assertNotNull(telefone);
    	assertTrue(telefone.getTelefone().equalsIgnoreCase("2346"));
    }
    
    @Test
    public void testPesquisarPorIDEscolaCodInexistente() throws SQLException{
    	Telefone telefone = this.dao.pesquisarPorIDEscola(78956);
    	assertNull(telefone);
    }

    
}
