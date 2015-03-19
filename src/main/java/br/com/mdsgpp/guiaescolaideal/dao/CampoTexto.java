package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;

public class CampoTexto implements Campo {

    private final String nome;
    private final String valor;
    private final String tabela;

    public CampoTexto(String nome, String valor, String tabela) {
	this.nome = nome;
	this.valor = valor;
	this.tabela = tabela;
    }

    public String getNome() {
	return nome;
    }

    public String getValor() {
	return valor;
    }

    public String getTabela() {
	return tabela;
    }

    public String gerarCondicao() {
	return "AND " + this.tabela + "." + this.nome + " like ? ";
    }

    public void addValorACondicao(PreparedStatement stmt, int posicao)
	    throws PesquisaException {
	try {
	    stmt.setString(posicao, "%" + this.valor + "%");
	} catch (SQLException e) {
	    throw new PesquisaException(
		    "Erro na geração do script para realizar a pesquisa!");
	}
    }
}
