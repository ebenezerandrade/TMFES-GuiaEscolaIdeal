package br.com.mdsgpp.guiaescolaideal.model;

public class CategoriaEscola {
	private boolean escolaPublica;
	private String dependenciaAdministrativa;
	private String categoriaEscolaPrivada;

	public CategoriaEscola() {
	    this(false);
	}

	public CategoriaEscola(boolean escolaPublica) {
		this.escolaPublica = escolaPublica;
	}

	public boolean isEscolaPublica() {
		return escolaPublica;
	}

	public void setEscolaPublica(boolean escolaPublica) {
		this.escolaPublica = escolaPublica;
	}

	public String getDependenciaAdministrativa() {
		return dependenciaAdministrativa;
	}

	public void setDependenciaAdministrativa(String dependenciaAdministrativa) {
		this.dependenciaAdministrativa = dependenciaAdministrativa;
	}

	public String getCategoriaEscolaPrivada() {
		return categoriaEscolaPrivada;
	}

	public void setCategoriaEscolaPrivada(String categoriaEscolaPrivada) {
		this.categoriaEscolaPrivada = categoriaEscolaPrivada;
	}

}
