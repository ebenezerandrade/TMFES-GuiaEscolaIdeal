package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.CategoriaEscola;

public class CategoriaEscolaDAO {
	private Connection connection;

	public CategoriaEscolaDAO(Connection connection) {
		this.connection = connection;
	}

	public CategoriaEscola pesquisarPorID(int id) throws SQLException {
		String sql = "select * from tipo_rede_escola where COD_REDE = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		CategoriaEscola categoriaEscola = null;

		if (rs.next()) {
			categoriaEscola = pegarCategoriaEscola(rs);
		}

		stmt.close();
		return categoriaEscola;

	}

	private CategoriaEscola pegarCategoriaEscola(ResultSet rs)
			throws SQLException {
		CategoriaEscola categoriaEscola = new CategoriaEscola();

		String tipo_escola = rs.getString("DESCRICAO");
		categoriaEscola.setEscolaPublica(!tipo_escola
				.equalsIgnoreCase("Privada"));

		categoriaEscola.setDependenciaAdministrativa(rs
				.getString("DEPENDENCIA_ADM"));
		categoriaEscola.setCategoriaEscolaPrivada(rs
				.getString("CATEGORIA_ESCOLA_PRIVADA"));
		return categoriaEscola;
	}
}
