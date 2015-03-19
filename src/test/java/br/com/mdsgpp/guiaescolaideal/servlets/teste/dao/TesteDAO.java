package br.com.mdsgpp.guiaescolaideal.servlets.teste.dao;

import java.io.FileInputStream;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;

/**
 * Classe criada para popular o banco antes de cada teste,
 * por causa da dificuldade de mockar EscolaDAO no servlet. :(
 * 
 * @author Augusto
 */
public class TesteDAO extends DBTestCase{
    
    private String user = "root";
    private String password = "";
    private String database = "guia_escola_ideal";
    private String url = "jdbc:mysql://localhost/";

    public TesteDAO(String name) {
	super(name);
	configuraConexaoComOBanco();
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
	return new FlatXmlDataSetBuilder().build(new FileInputStream(
		"xml-dbunit/banco-escola-servlet.xml"));
    }
    
    /*
     * Método que será executado no começo de cada teste.
     */
    protected DatabaseOperation getSetUpOperation() throws Exception {
	return DatabaseOperation.REFRESH;
    }
    
    private void configuraConexaoComOBanco() {
	System.setProperty(
		PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS,
		"com.mysql.jdbc.Driver");
	System.setProperty(
		PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, url
			+ database);
	System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME,
		user);
	System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD,
		password);
    }
    
    @Test
    public void test(){
    }

}
