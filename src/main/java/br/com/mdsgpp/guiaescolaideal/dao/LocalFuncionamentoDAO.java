package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.LocalFuncionamento;

public class LocalFuncionamentoDAO {
	private Connection connection;

	public LocalFuncionamentoDAO(Connection connection) {
		this.connection = connection;
	}

	public LocalFuncionamento pesquisarPorID(int id) throws SQLException {
		String sql = "select * from local_funcionamento where COD_LOCAL_FUNCIONAMENTO = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		LocalFuncionamento localfuncionamento = null;

		if (rs.next()) {
			localfuncionamento = new LocalFuncionamento();
			localfuncionamento.setTipoLocalFuncionamento(rs
					.getString("COD_LOCAL_FUNCIONAMENTO"));
		}

		stmt.close();
		return localfuncionamento;
	}

}
