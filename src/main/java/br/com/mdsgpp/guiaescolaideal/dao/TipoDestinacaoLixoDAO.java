package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.TipoDestinacaoLixo;

public class TipoDestinacaoLixoDAO {

	private Connection connection;

	public TipoDestinacaoLixoDAO(Connection connection) {
		this.connection = connection;
	}

	public TipoDestinacaoLixo pesquisarPorID(int id) throws SQLException {

		String sql = "select * from tipo_destinacao_lixo where COD_TIPO_DESTINACAO_LIXO = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		TipoDestinacaoLixo tipoDestinacaoLixo = null;

		if (rs.next()) {
			tipoDestinacaoLixo = new TipoDestinacaoLixo();
			String tipo = rs.getString("DESCRICAO");

			tipoDestinacaoLixo.setTipo(tipo);
		}

		stmt.close();
		return tipoDestinacaoLixo;
	}
}
