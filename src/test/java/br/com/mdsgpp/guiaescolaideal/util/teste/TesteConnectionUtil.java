package br.com.mdsgpp.guiaescolaideal.util.teste;

import static org.mockito.Mockito.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.util.ConnectionUtil;

public class TesteConnectionUtil {
    
    @Test
    public void testCloseConnection() throws SQLException {
	Connection connection = cenarioComConexaoAberta();
	ConnectionUtil.closeConnection(connection);
	verify(connection).close();
    }
    
    @Test
    public void testCloseConnectionNull() throws SQLException {
	Connection connection = null;
	ConnectionUtil.closeConnection(connection);
    }

    @Test
    public void testCloseConnectionIsClosed() throws SQLException {
	Connection connection = cenarioComConexaoJaFechada();
	ConnectionUtil.closeConnection(connection);
	verify(connection, never()).close();
    }
    
    
    @Test
    public void testEsperandoErro() throws SQLException{
	Connection connection = cenarioComConexaoAberta();
	
	doThrow(new SQLException()).when(connection).close();
	ConnectionUtil.closeConnection(connection);
	verify(connection).close();
	
	//deve rodar esse comando sem dar o erro
	assert(true);
    }
    private Connection cenarioComConexaoAberta() throws SQLException {
	Connection connection = mock(Connection.class);
	when(connection.isClosed()).thenReturn(false);
	return connection;
    }
    
    private Connection cenarioComConexaoJaFechada() throws SQLException {
	Connection connection = mock(Connection.class);
	when(connection.isClosed()).thenReturn(true);
	return connection;
    }
}
