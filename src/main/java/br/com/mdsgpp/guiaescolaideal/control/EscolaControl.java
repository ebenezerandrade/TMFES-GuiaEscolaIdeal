package br.com.mdsgpp.guiaescolaideal.control;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.mdsgpp.guiaescolaideal.dao.Campo;
import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;
import br.com.mdsgpp.guiaescolaideal.exceptions.EntradaDadosException;
import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;
import br.com.mdsgpp.guiaescolaideal.model.Escola;
import br.com.mdsgpp.guiaescolaideal.util.ConversorDeEntrada;

public class EscolaControl {

    private EscolaDAO escolaDAO;

    public EscolaControl(EscolaDAO escolaDAO) throws SQLException {
	this.escolaDAO = escolaDAO;
    }

    public List<Escola> getEscolaEspecifica(String nomeEscola, String estado,
	    String nomeMunicipio) throws SQLException, PesquisaException {
	List<String> listaPalavrasChaves = ConversorDeEntrada
		.getPalavrasChaveDoTexto(nomeEscola);
	List<String> listaPalavrasMunicipio = null;

	listaPalavrasMunicipio = getMunicipioSeForValido(nomeMunicipio);

	return this.escolaDAO.pesquisarPorNomeMaisLocalizacao(
		listaPalavrasChaves, estado, listaPalavrasMunicipio);
    }

    public Escola getEscolaPorId(String id) throws SQLException, PesquisaException {
	int id_numerico = ConversorDeEntrada.getNumeroInteiro(id);
	return escolaDAO.pesquisarPorID(id_numerico);
    }

    public List<Escola> getEscolaPorCep(String cep) throws SQLException,
	    PesquisaException {
	ConversorDeEntrada.validarCep(cep);
	return this.escolaDAO.pesquisarEscolaPorCep(cep);
    }
    
    public void updateVotos(int id) throws SQLException {
	escolaDAO.atualizarVotos(id);
    }

    public List<Escola> getEscolaIdeal(List<Campo> campos) throws SQLException,
	    ParseException, PesquisaException {

	return this.escolaDAO.pesquisaPorCampos(campos);
    }

    private List<String> getMunicipioSeForValido(String nomeMunicipio) {
	List<String> listaPalavrasMunicipio;
	try {
	    listaPalavrasMunicipio = ConversorDeEntrada
		    .getPalavrasChaveDoTexto(nomeMunicipio);
	} catch (EntradaDadosException e) {
	    listaPalavrasMunicipio = new ArrayList<String>();
	}
	return listaPalavrasMunicipio;
    }

}
