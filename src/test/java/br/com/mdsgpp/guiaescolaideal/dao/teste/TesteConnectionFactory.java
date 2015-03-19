package br.com.mdsgpp.guiaescolaideal.dao.teste;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.ConnectionFactory;

public class TesteConnectionFactory {
	
	private Connection connection;
	
	@Before
	public void setUp() throws SQLException{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	@Test
	public void testGetConnection() {
		assertNotNull(this.connection);
	}
	
	@After
	public void close() throws SQLException{
		this.connection.close();
	}

}
