package br.com.mdsgpp.guiaescolaideal.dao.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import com.mysql.jdbc.PreparedStatement;

import br.com.mdsgpp.guiaescolaideal.dao.CampoTexto;
import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;

public class TesteCampoTexto {
    private CampoTexto campoTexto;
    private PreparedStatement stmt;
    
    @Before
    public void setUp() throws Exception {
	this.stmt = mock(PreparedStatement.class);
	this.campoTexto = new CampoTexto("campo", "valor", "tabelaX");
    }

    @Test
    public void testGetNome() {
	assertEquals(campoTexto.getNome(), "campo");
    }

    @Test
    public void testGetValor() {
	assertEquals(campoTexto.getValor(), "valor");
    }

    @Test
    public void testGetTabela() {
	assertEquals(campoTexto.getTabela(), "tabelaX");
    }

    @Test
    public void testGerarCondicao() {
	String query = "AND tabelaX.campo like ? ";
	
	assertTrue(campoTexto.gerarCondicao().equals(query));
    }

    @Test
    public void testAddValorACondicao() throws PesquisaException, SQLException {
	campoTexto.addValorACondicao(stmt, 1);
	
	verify(stmt).setString(1, "%valor%");
    }
    
    @Test(expected = PesquisaException.class)
    public void testAddValorACondicaoException() throws PesquisaException, SQLException {
	doThrow(new SQLException())
		.when(stmt).setString(-1, "%valor%");
	campoTexto.addValorACondicao(stmt, -1);
    }
}
