package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.EnderecoDAO;


public class TesteEnderecoDAO {

	private EnderecoDAO dao;
	
	public TesteEnderecoDAO(String name) throws SQLException, Exception {
		super(name);
		this.dao = new EnderecoDAO(getConnection().getConnection());
	}
	
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-equipamento.xml"));
	}
	
	@Test
	public void testPesquisarPorId(){
		
	}
	
	
}
