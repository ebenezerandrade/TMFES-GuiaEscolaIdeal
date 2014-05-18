package br.com.mdsgpp.guiaescolaideal.control.teste;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.mdsgpp.guiaescolaideal.control.EscolaControl;
import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;
import br.com.mdsgpp.guiaescolaideal.exceptions.ConsultaBancoRetornoVazioException;
import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;
import br.com.mdsgpp.guiaescolaideal.model.Escola;

public class TesteEscolaControl {

    private EscolaDAO escolaDAO;
    private EscolaControl control;
    private ArrayList<String> munNome = null;
    private ArrayList<String> escolaNome = null;

    @Before
    public void inic() throws SQLException, ParseException,
	    ConsultaBancoRetornoVazioException {

	escolaNome = new ArrayList<String>();
	escolaNome.add("teste");
	munNome = new ArrayList<String>();
	munNome.add("testeMun");
	escolaDAO = Mockito.mock(EscolaDAO.class);
	configDaoPesquisaMock(getListaEscola(), escolaNome, munNome);
	configDaoIdMock();

	control = new EscolaControl(escolaDAO);
    }

    private void configDaoPesquisaMock(List<Escola> listaEscola,
	    ArrayList<String> escolaNome, ArrayList<String> munNome)
	    throws SQLException, ParseException,
	    ConsultaBancoRetornoVazioException {
	Mockito.when(
		escolaDAO.pesquisarPorNomeMaisLocalizacao(escolaNome, "df",
			munNome)).thenReturn(listaEscola);
    }

    private void configDaoIdMock() throws SQLException, ParseException,
	    ConsultaBancoRetornoVazioException {
	Escola escola = new Escola();
	escola.setCodEscola(171);
	Mockito.when(escolaDAO.pesquisarPorID(171)).thenReturn(escola);
    }

    private List<Escola> getListaEscola() {
	List<Escola> listaEscola = new ArrayList<Escola>();

	for (int i = 0; i < 10; i++) {
	    Escola escola = new Escola();
	    escola.setNomeEscola("item " + i);
	    listaEscola.add(escola);
	}

	return listaEscola;
    }

    @Test
    public void testGetEscolaEspecifica() throws SQLException, ParseException,
	    PesquisaException {
	assertTrue(control.getEscolaEspecifica("teste", "df", "testeMun")
		.size() == 10);
    }

    @Test
    public void testGetEscolaEspecificaValor() throws SQLException,
	    ParseException, PesquisaException {
	assertTrue("item 0".equalsIgnoreCase(control
		.getEscolaEspecifica("teste", "df", "testeMun").get(0)
		.getNomeEscola()));
    }

    @Test
    public void testGetEscolaPorId() throws SQLException, ParseException,
	    ConsultaBancoRetornoVazioException {
	String id = "171";
	assertTrue(control.getEscolaPorId(id).getCodEscola() == 171);
    }

    @Test
    public void testGetEscolaEspecificaMunicipioNull() throws SQLException,
	    ParseException, PesquisaException {
	configDaoPesquisaMock(getListaEscola(), escolaNome,
		new ArrayList<String>());
	assertTrue(control.getEscolaEspecifica("teste", "df", null).size() == 10);
    }
}
