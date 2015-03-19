package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.CampoTexto;
import br.com.mdsgpp.guiaescolaideal.dao.Campo;
import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;
import br.com.mdsgpp.guiaescolaideal.exceptions.ConsultaBancoRetornoVazioException;
import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;
import br.com.mdsgpp.guiaescolaideal.model.Escola;

public class TesteEscolaDAO extends DAO {

    private EscolaDAO dao;

    public TesteEscolaDAO(String name) throws SQLException, Exception {
	super(name);
	this.dao = new EscolaDAO(getConnection().getConnection());
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
	return new FlatXmlDataSetBuilder().build(new FileInputStream(
		"xml-dbunit/banco-escola.xml"));
    }

    @Test
    public void testPesquisarPorId() throws SQLException, Exception {
	assertNotNull(this.dao.pesquisarPorID(75001));
    }

    @Test
    public void testPesquisarPorIdInexistente() throws SQLException, Exception {
	/*
	 * DBUnit não reconhece a anotação @Test(expected = *.class) do JUnit
	 * 4.0
	 */
	try {
	    assertNull(this.dao.pesquisarPorID(75000));
	    fail("Esperava-se ConsultaBancoRetornoVazioException");
	} catch (ConsultaBancoRetornoVazioException success) {
	    assertNotNull(success.getMessage());
	}
    }

    @Test
    public void testPesquisarPorNomeMaisLocalizacao() throws SQLException,
	    ParseException, ConsultaBancoRetornoVazioException {
	List<String> listaPalavras = new ArrayList<String>();
	listaPalavras.add("XP5PK");
	listaPalavras.add("OVER");

	List<String> listaPalavrasMunicipio = new ArrayList<String>();
	listaPalavrasMunicipio.add("Rua");
	listaPalavrasMunicipio.add("loucos");

	String estado = "Javavah";

	assertTrue(this.dao.pesquisarPorNomeMaisLocalizacao(listaPalavras,
		estado, listaPalavrasMunicipio).size() == 1);
    }

    @Test
    public void testPesquisarPorNomeMaisLocalizacaoNomeInexistente()
	    throws SQLException, ParseException {
	List<String> listaPalavras = new ArrayList<String>();
	listaPalavras.add("XPTO");
	listaPalavras.add("OVER");

	List<String> listaPalavrasMunicipio = new ArrayList<String>();
	listaPalavrasMunicipio.add("Rua");
	listaPalavrasMunicipio.add("loucos");

	String estado = "Javavah";

	/*
	 * DBUnit não reconhece a anotação @Test(expected = *.class) do JUnit
	 * 4.0
	 */
	try {
	    assertTrue(this.dao.pesquisarPorNomeMaisLocalizacao(listaPalavras,
		    estado, listaPalavrasMunicipio).isEmpty());
	    fail("Esperava-se ConsultaBancoRetornoVazioException");
	} catch (ConsultaBancoRetornoVazioException success) {
	    assertNotNull(success.getMessage());
	}
    }

    @Test
    public void testPesquisarPorNomeMaisLocalizacaoComEstadoInexistente()
	    throws SQLException, ParseException {
	List<String> listaPalavras = new ArrayList<String>();
	listaPalavras.add("XP5PK");
	listaPalavras.add("OVER");

	List<String> listaPalavrasMunicipio = new ArrayList<String>();
	listaPalavrasMunicipio.add("Rua");
	listaPalavrasMunicipio.add("loucos");

	String estado = "Javavah do sul";

	/*
	 * DBUnit não reconhece a anotação @Test(expected = *.class) do JUnit
	 * 4.0
	 */
	try {
	    assertTrue(this.dao.pesquisarPorNomeMaisLocalizacao(listaPalavras,
		    estado, listaPalavrasMunicipio).isEmpty());
	    fail("Esperava-se ConsultaBancoRetornoVazioException");
	} catch (ConsultaBancoRetornoVazioException success) {
	    assertNotNull(success.getMessage());
	}
    }

    @Test
    public void testPesquisarPorNomeMaisLocalizacaoComMunicipioInexistente()
	    throws SQLException, ParseException {
	List<String> listaPalavras = new ArrayList<String>();
	listaPalavras.add("XP5PK");
	listaPalavras.add("OVER");

	List<String> listaPalavrasMunicipio = new ArrayList<String>();
	listaPalavrasMunicipio.add("Cidade");
	listaPalavrasMunicipio.add("loucos");

	String estado = "Javavah do sul";

	/*
	 * DBUnit não reconhece a anotação @Test(expected = *.class) do JUnit
	 * 4.0
	 */
	try {
	    assertTrue(this.dao.pesquisarPorNomeMaisLocalizacao(listaPalavras,
		    estado, listaPalavrasMunicipio).isEmpty());
	    fail("Esperava-se ConsultaBancoRetornoVazioException");
	} catch (ConsultaBancoRetornoVazioException success) {
	    assertNotNull(success.getMessage());
	}
    }

    @Test
    public void testPesquisarEscolaPorCep() throws SQLException,
	    ParseException, ConsultaBancoRetornoVazioException {
	String cep = "11111111";

	List<Escola> listaEscola = new ArrayList<Escola>();
	listaEscola = dao.pesquisarEscolaPorCep(cep);

	assertTrue(listaEscola.size() == 1);

    }

    @Test
    public void testPesquisarEscolaPorCepInvalido() throws SQLException,
	    ParseException {
	String cep = "11115555";

	/*
	 * DBUnit não reconhece a anotação @Test(expected = *.class) do JUnit
	 * 4.0
	 */
	try {
	    dao.pesquisarEscolaPorCep(cep);
	    fail("Esperava-se ConsultaBancoRetornoVazioException");
	} catch (ConsultaBancoRetornoVazioException success) {
	    assertNotNull(success.getMessage());
	}

    }

    @Test
    public void testPesquisarPorCampo()
	    throws SQLException, PesquisaException {
	Campo campo = new CampoTexto("NOME_ESCOLA", "xp5pk", "escola");
	Campo campoLAB = new CampoTexto("SE_LAB_INFO", "sim", "escola");
	assertTrue(dao.pesquisaPorCampos(Arrays.asList(campo, campoLAB)).size() == 1);

    }

    @Test
    public void testPesquisarPorCampoModalidade()
	    throws SQLException, PesquisaException {
	Campo campo = new CampoTexto("DESCRICAO", "java", "modalidade_ensino");
	assertTrue(dao.pesquisaPorCampos(Arrays.asList(campo)).size() == 2);
    }

    @Test
    public void testPesquisarEscolaPorCampoInvalido() throws SQLException,
	    ParseException, PesquisaException {

	Campo campo = new CampoTexto("NOME_ESCOLA", "xp8d423", "escola");
	/*
	 * DBUnit não reconhece a anotação @Test(expected = *.class) do JUnit
	 * 4.0
	 */
	try {
	    dao.pesquisaPorCampos(Arrays.asList(campo));
	    fail("Esperava-se ConsultaBancoRetornoVazioException");
	} catch (ConsultaBancoRetornoVazioException success) {
	    assertNotNull(success.getMessage());
	}

    }

}
