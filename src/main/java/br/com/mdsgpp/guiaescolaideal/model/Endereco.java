package br.com.mdsgpp.guiaescolaideal.model;

public class Endereco {

	private String bairro;
	private String rua;
	private int cep;
	private String numero;
	private String complemento;
	private Municipio municipio;
	private Posicao posicao;
	
	public Endereco(){
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Posicao getPosicao() {
	    return posicao;
	}

	public void setPosicao(Posicao posicao) {
	    this.posicao = posicao;
	}

}
