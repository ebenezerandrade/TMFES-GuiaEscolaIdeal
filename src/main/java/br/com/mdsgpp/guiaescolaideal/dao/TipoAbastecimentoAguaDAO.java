package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.TipoAbastecimentoAgua;

public class TipoAbastecimentoAguaDAO {

	private Connection connection;

	public TipoAbastecimentoAguaDAO(Connection connection) {
		this.connection = connection;
	}

	public TipoAbastecimentoAgua pesquisarPorId(int id) throws SQLException {

		String sql = "select * from tipo_abastecimento_agua where COD_TIPO_ABASTECIMENTO_AGUA = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		TipoAbastecimentoAgua tipoabastecimentoagua = null;

		if (rs.next()) {
			tipoabastecimentoagua = new TipoAbastecimentoAgua();
			tipoabastecimentoagua.setTipo(rs.getString("DESCRICAO"));
		}

		stmt.close();
		return tipoabastecimentoagua;
	}

}
