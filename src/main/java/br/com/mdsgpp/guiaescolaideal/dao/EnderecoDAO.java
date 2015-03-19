package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import br.com.mdsgpp.guiaescolaideal.model.Endereco;
import br.com.mdsgpp.guiaescolaideal.model.Municipio;
import br.com.mdsgpp.guiaescolaideal.model.Posicao;
import br.com.mdsgpp.guiaescolaideal.util.ConversorDeEntrada;

public class EnderecoDAO {

    private Connection connection;

    public EnderecoDAO(Connection connection) {
	this.connection = connection;
    }

    public Endereco pesquisarPorID(int id) throws SQLException {
	String sql = "select * from endereco where COD_ENDERECO = ?";

	PreparedStatement stmt = this.connection.prepareStatement(sql);
	stmt.setInt(1, id);

	ResultSet rs = stmt.executeQuery();
	Endereco endereco = null;
	
	if (rs.next()) {
	    endereco = getEndereco(rs);
	}

	stmt.close();
	return endereco;
    }

    private Endereco getEndereco(ResultSet rs) throws SQLException {
	Endereco endereco = new Endereco();

	endereco.setBairro(rs.getString("BAIRRO"));
	endereco.setRua(rs.getString("RUA"));
	endereco.setCep(Integer.parseInt(rs.getString("CEP")));
	endereco.setNumero(rs.getString("NUMERO"));
	endereco.setComplemento(rs.getString("COMPLEMENTO"));

	Posicao posicao = new Posicao();

	String latitude = rs.getString("LATITUDE");
	String longitude = rs.getString("LONGITUDE");

	posicao.validaPosicao(latitude, longitude);
	endereco.setPosicao(posicao);

	Municipio municipio = null;
	MunicipioDAO municipioDAO = new MunicipioDAO(connection);
	municipio = municipioDAO.pesquisarPorId(ConversorDeEntrada
		.getNumeroInteiroSemPonto(rs.getString("COD_MUNICIPIO")));
	endereco.setMunicipio(municipio);

	return endereco;
    }

}
