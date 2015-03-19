package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mdsgpp.guiaescolaideal.model.Equipamento;
import br.com.mdsgpp.guiaescolaideal.model.Escola;

public class EquipamentoDAO {

	private Connection connection;

	public EquipamentoDAO(Connection connection) {
		this.connection = connection;
	}

	public Equipamento pesquisarPorID(int id) throws SQLException {
		String sql = "select * from equipamento where COD_EQUIPAMENTO = ?";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, id);

		ResultSet rs = stmt.executeQuery();
		Equipamento equipamento = null;

		if (rs.next()) {
			equipamento = getEquipamento(rs);
		}

		stmt.close();
		return equipamento;

	}

	private Equipamento getEquipamento(ResultSet rs) throws SQLException {
		Equipamento equipamento = new Equipamento();
		String aparelho = rs.getString("DESCRICAO");
		equipamento.setAparelho(aparelho);
		equipamento.setCodEquipamento(rs.getInt("COD_EQUIPAMENTO"));
		return equipamento;
	}

	public List<Equipamento> pesquisarPorEscola(Escola escola)
			throws SQLException {
		String sql = "select * from equipamento e "
				+ "INNER JOIN equipamento_escola eq ON eq.COD_ESCOLA = ? "
				+ "and e.COD_EQUIPAMENTO = eq.COD_EQUIPAMENTO";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, escola.getCodEscola());

		ResultSet rs = stmt.executeQuery();

		List<Equipamento> listaEquipamentos = new ArrayList<Equipamento>();

		while (rs.next()) {
			Equipamento equipamento = getEquipamento(rs);
			listaEquipamentos.add(equipamento);
		}

		stmt.close();
		return listaEquipamentos;
	}

}
