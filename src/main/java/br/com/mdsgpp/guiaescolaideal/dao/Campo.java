package br.com.mdsgpp.guiaescolaideal.dao;

import java.sql.PreparedStatement;

import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;

public interface Campo {
    public String gerarCondicao();
    public void addValorACondicao(PreparedStatement stmt, int posicao) throws PesquisaException;
}
