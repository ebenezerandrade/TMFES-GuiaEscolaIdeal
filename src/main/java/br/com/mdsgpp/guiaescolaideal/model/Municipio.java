package br.com.mdsgpp.guiaescolaideal.model;

public class Municipio {

	private String nome;
	private String codigoDDD;
	private Uf uf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoDDD() {
		return codigoDDD;
	}

	public void setCodigoDDD(String codigoDDD) {
		this.codigoDDD = codigoDDD;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

}
