package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.model.TipoAbastecimentoEnergia;

public class TipoAbastecimentoEnergiaDAO {

	private Connection connection;

	public TipoAbastecimentoEnergiaDAO(Connection connection) {
		this.connection = connection;
	}

	public TipoAbastecimentoEnergia pesquisarPorID(int id) throws SQLException {

		String sql = "select * from tipo_abastecimento_energia_eletrica where COD_TIPO_ABAST_ENERGIA = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		TipoAbastecimentoEnergia tipoAbastecimentoEnergia = null;

		if (rs.next()) {
			tipoAbastecimentoEnergia = new TipoAbastecimentoEnergia();
			String tipo = rs.getString("DESCRICAO");

			tipoAbastecimentoEnergia.setTipo(tipo);
		}

		stmt.close();
		return tipoAbastecimentoEnergia;
	}
}
