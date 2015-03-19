package br.com.mdsgpp.guiaescolaideal.model;

public class LocalFuncionamento {
	private int codLocalFuncionamento;
	private String tipoLocalFuncionamento;
	private boolean funcionaEmSalaEmpresa;
	private boolean funcionaEmUnidadeInternacao;
	private boolean funcionaEmTemplosIgrejas;
	private boolean funcionaEmCasaProfessor;
	private boolean funcionaEmRancho;
	private boolean funcionaEmOutros;
	private boolean funcionaEmOutraEscola;

	public int getCodLocalFuncionamento() {
		return codLocalFuncionamento;
	}

	public void setCodLocalFuncionamento(int codLocalFuncionamento) {
		this.codLocalFuncionamento = codLocalFuncionamento;
	}

	public String getTipoLocalFuncionamento() {
		return tipoLocalFuncionamento;
	}

	public void setTipoLocalFuncionamento(String tipoLocalFuncionamento) {
		this.tipoLocalFuncionamento = tipoLocalFuncionamento;
	}

	public boolean isFuncionaEmSalaEmpresa() {
		return funcionaEmSalaEmpresa;
	}

	public void setFuncionaEmSalaEmpresa(boolean funcionaEmSalaEmpresa) {
		this.funcionaEmSalaEmpresa = funcionaEmSalaEmpresa;
	}

	public boolean isFuncionaEmUnidadeInternacao() {
		return funcionaEmUnidadeInternacao;
	}

	public void setFuncionaEmUnidadeInternacao(
			boolean funcionaEmUnidadeInternacao) {
		this.funcionaEmUnidadeInternacao = funcionaEmUnidadeInternacao;
	}

	public boolean isFuncionaEmTemplosIgrejas() {
		return funcionaEmTemplosIgrejas;
	}

	public void setFuncionaEmTemplosIgrejas(boolean funcionaEmTemplosIgrejas) {
		this.funcionaEmTemplosIgrejas = funcionaEmTemplosIgrejas;
	}

	public boolean isFuncionaEmCasaProfessor() {
		return funcionaEmCasaProfessor;
	}

	public void setFuncionaEmCasaProfessor(boolean funcionaEmCasaProfessor) {
		this.funcionaEmCasaProfessor = funcionaEmCasaProfessor;
	}

	public boolean isFuncionaEmRancho() {
		return funcionaEmRancho;
	}

	public void setFuncionaEmRancho(boolean funcionaEmRancho) {
		this.funcionaEmRancho = funcionaEmRancho;
	}

	public boolean isFuncionaEmOutros() {
		return funcionaEmOutros;
	}

	public void setFuncionaEmOutros(boolean funcionaEmOutros) {
		this.funcionaEmOutros = funcionaEmOutros;
	}

	public boolean isFuncionaEmOutraEscola() {
		return funcionaEmOutraEscola;
	}

	public void setFuncionaEmOutraEscola(boolean funcionaEmOutraEscola) {
		this.funcionaEmOutraEscola = funcionaEmOutraEscola;
	}

}
