package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.Uf;

public class UfDAO {

	private Connection connection;

	public UfDAO(Connection connection) {
		this.connection = connection;
	}

	public Uf pesquisarPorID(int id) throws SQLException {

		String sql = "select * from uf where COD_UF = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		Uf uf = null;
		if (rs.next()) {
			uf = new Uf();
			String tipoUf = rs.getString("DESCRICAO");

			uf.setEstado(tipoUf);
		}

		stmt.close();
		return uf;
	}
}