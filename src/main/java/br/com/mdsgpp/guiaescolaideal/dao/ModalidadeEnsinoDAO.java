package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.ModalidadeEnsino;

public class ModalidadeEnsinoDAO {

	private Connection connection;

	public ModalidadeEnsinoDAO(Connection connection) {
		this.connection = connection;
	}

	public ModalidadeEnsino pesquisarPorID(int id) throws SQLException {

		String sql = "select * from modalidade_ensino where COD_MODALIDADE_ENSINO = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		ModalidadeEnsino modalidadeEnsino = null;

		if (rs.next()) {
			modalidadeEnsino = new ModalidadeEnsino();
			String tipoModalidadeEnsino = rs.getString("DESCRICAO");
			modalidadeEnsino.setTipoModalidadeEnsino(tipoModalidadeEnsino);
		}

		stmt.close();
		return modalidadeEnsino;
	}
}
