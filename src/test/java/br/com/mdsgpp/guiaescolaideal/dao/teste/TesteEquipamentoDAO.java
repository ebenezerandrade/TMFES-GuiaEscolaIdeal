package br.com.mdsgpp.guiaescolaideal.dao.teste;

import java.io.FileInputStream;
import java.sql.SQLException;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.EquipamentoDAO;
import br.com.mdsgpp.guiaescolaideal.model.Escola;

public class TesteEquipamentoDAO extends DAO {
	private EquipamentoDAO dao;

	public TesteEquipamentoDAO(String name) throws SQLException, Exception {
		super(name);
		this.dao = new EquipamentoDAO(getConnection().getConnection());
	}

	/*
	 * setando o arquivo xml utilizado no teste
	 */
	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new FileInputStream(
				"xml-dbunit/banco-equipamento.xml"));
	}

	@Test
	public void testPesquisarPorId() throws SQLException, Exception {
		assertNotNull(this.dao.pesquisarPorID(555));
	}

	@Test
	public void testPesquisarPorIdInexistente() throws SQLException, Exception {
		assertNull(this.dao.pesquisarPorID(666));
	}

	@Test
	public void testPesquisarPorEscola() throws SQLException, Exception {
		Escola escola = new Escola();
		escola.setCodEscola(21000);

		assertTrue(this.dao.pesquisarPorEscola(escola).size() == 3);
	}

	@Test
	public void testPesquisarPorEscolaSemEquipamentos() throws SQLException,
			Exception {

		Escola escola = new Escola();
		escola.setCodEscola(21001);

		assertTrue(this.dao.pesquisarPorEscola(escola).size() == 0);

	}

	@Test
	public void testPesquisarPorEscolaInexistente() throws SQLException,
			Exception {

		Escola escola = new Escola();
		escola.setCodEscola(21003);
		assertTrue(this.dao.pesquisarPorEscola(escola).size() == 0);

	}
}
