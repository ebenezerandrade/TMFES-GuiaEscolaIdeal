package br.com.mdsgpp.guiaescolaideal.dao.teste;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.operation.DatabaseOperation;

public abstract class DAO extends DBTestCase {

    private String user = "root";
    private String password = "";
    private String database = "guia_escola_ideal";
    private String url = "jdbc:mysql://localhost/";

    public DAO(String name) {
	super(name);
	configuraConexaoComOBanco();
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
}
