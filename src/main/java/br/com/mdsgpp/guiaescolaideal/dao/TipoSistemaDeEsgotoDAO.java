package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.TipoSistemaDeEsgoto;

public class TipoSistemaDeEsgotoDAO {

	private Connection connection;

	public TipoSistemaDeEsgotoDAO(Connection connection) {
		this.connection = connection;
	}

	public TipoSistemaDeEsgoto pesquisarPorID(int id) throws SQLException {

		String sql = "select * from tipo_esgoto_sanitario where COD_tipo_esgoto = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		TipoSistemaDeEsgoto tipoSistemaDeEsgoto = null;

		if (rs.next()) {
			tipoSistemaDeEsgoto = new TipoSistemaDeEsgoto();
			String tipo = rs.getString("DESCRICAO");

			tipoSistemaDeEsgoto.setTipo(tipo);
		}

		stmt.close();
		return tipoSistemaDeEsgoto;
	}
}