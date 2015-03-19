package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.Regiao;

public class RegiaoDAO {

	private Connection connection;

	public RegiaoDAO(Connection connection) {
		this.connection = connection;
	}

	public Regiao pesquisarPorId(int id) throws SQLException {

		String sql = "select * from regiao where COD_REGIAO = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		Regiao regiao = null;

		if (rs.next()) {
			regiao = new Regiao();
			regiao.setNome(rs.getString("DESCRICAO"));
		}

		stmt.close();
		return regiao;
	}

}