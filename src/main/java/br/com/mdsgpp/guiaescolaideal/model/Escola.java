package br.com.mdsgpp.guiaescolaideal.model;

import java.sql.Date;
import java.util.List;

public class Escola {
	
	private int codEscola;
	
	private CategoriaEscola categoriaEscola;
	private Endereco endereco;
	private Telefone telefone;
	private LocalFuncionamento localFuncionamento;
	
	private List<Equipamento> listaEquipamentos;
	private List<ModalidadeEnsino> listaModalidadeEnsino;
	private List<TipoAbastecimentoAgua> listaAbastecimentoAgua;
	private List<TipoSistemaDeEsgoto> listaSistemaEsgoto;
	private List<TipoAbastecimentoEnergia> listaAbastecimentoEnergia;
	private List<TipoDestinacaoLixo> listaDestinacaoLixo;
	
	private String nomeEscola;
	private int codigoRede;
	private String tipoLocalizacao;
	private int codigoendereco;
	private String codicaoFuncionamento;
	private String email;
	private boolean sistemaSenai;
	private boolean ong;
	private Date dataInicioLetivo;
	private Date dataTerminoLetivo;
	private boolean seFinsLucrativos;
	private String atividadeComplementar;
	private int codLocalFuncionamento;
	private boolean acessibilidade;
	private boolean dependViasAcesso;
	private boolean santiAcess;
	private String atendEducacionalEspecializado;
	private boolean salaDiretoria;
	private boolean salaProfessor;
	private boolean secretaria;
	private boolean refeitorio;
	private boolean despensa;
	private boolean almoxarifado;
	private boolean auditorio;
	private boolean labInformatica;
	private boolean labCiencias;
	private boolean salaAtendimentoEspecializado;
	private boolean quadraEsporteCoberta;
	private boolean quadraEsporteDescoberta;
	private boolean patioCoberto;
	private boolean patioDescoberto;
	private boolean parqueInfantil;
	private boolean cozinha;
	private boolean biblioteca;
	private boolean bercario;
	private boolean sanitarioNoPredio;
	private boolean sanitarioForaPredio;
	private boolean sanitarioAdequadoInfantil;
	private boolean banheiroChuveiro;
	private boolean lavanderia;
	private boolean outrasDependencias;
	private int numSalaExistentes;
	private int numSalaUtilizadas;
	private boolean salaLeitura;
	private boolean alojamentoAluno;
	private boolean alojamentoProfessor;
	private boolean areaVerde;
	private int numFuncionarios;
	private boolean alimentacaoEscAlunos;
	private boolean aguaFiltrada;
	private boolean internet;
	private int numComputadoresAlunos;
	private int numComputadoresAdministracao;
	private int numComputadoresTotal;
	private boolean educacaoIndigena;
	private boolean linguaIndigena;
	private boolean brasilAlfabetizacao;
	private boolean aberturaFdsComun;
	private int numMatriculas;
	private int quantidadeVotos;

	public CategoriaEscola getCategoriaEscola() {
		return categoriaEscola;
	}

	public void setCategoriaEscola(CategoriaEscola categoriaEscola) {
		this.categoriaEscola = categoriaEscola;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getCodigoRede() {
		return codigoRede;
	}

	public void setCodigoRede(int codigoRede) {
		this.codigoRede = codigoRede;
	}

	public String getTipoLocalizacao() {
		return tipoLocalizacao;
	}

	public void setTipoLocalizacao(String tipoLocalizacao) {
		this.tipoLocalizacao = tipoLocalizacao;
	}

	public int getCodigoendereco() {
		return codigoendereco;
	}

	public void setCodigoendereco(int codigoendereco) {
		this.codigoendereco = codigoendereco;
	}

	public String getCodicaoFuncionamento() {
		return codicaoFuncionamento;
	}

	public void setCodicaoFuncionamento(String codicaoFuncionamento) {
		this.codicaoFuncionamento = codicaoFuncionamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isSistemaSenai() {
		return sistemaSenai;
	}

	public void setSistemaSenai(boolean sistemaSenai) {
		this.sistemaSenai = sistemaSenai;
	}

	public boolean isOng() {
		return ong;
	}

	public void setOng(boolean ong) {
		this.ong = ong;
	}

	public Date getDataInicioLetivo() {
		return dataInicioLetivo;
	}

	public void setDataInicioLetivo(Date dataInicioLetivo) {
		this.dataInicioLetivo = dataInicioLetivo;
	}

	public Date getDataTerminoLetivo() {
		return dataTerminoLetivo;
	}

	public void setDataTerminoLetivo(Date dataTerminoLetivo) {
		this.dataTerminoLetivo = dataTerminoLetivo;
	}

	public boolean isSeFinsLucrativos() {
		return seFinsLucrativos;
	}

	public void setSeFinsLucrativos(boolean seFinsLucrativos) {
		this.seFinsLucrativos = seFinsLucrativos;
	}

	public String getAtividadeComplementar() {
		return atividadeComplementar;
	}

	public void setAtividadeComplementar(String atividadeComplementar) {
		this.atividadeComplementar = atividadeComplementar;
	}

	public int getCodLocalFuncionamento() {
		return codLocalFuncionamento;
	}

	public void setCodLocalFuncionamento(int codLocalFuncionamento) {
		this.codLocalFuncionamento = codLocalFuncionamento;
	}

	public boolean isAcessibilidade() {
		return acessibilidade;
	}

	public void setAcessibilidade(boolean acessibilidade) {
		this.acessibilidade = acessibilidade;
	}

	public boolean isDependViasAcesso() {
		return dependViasAcesso;
	}

	public void setDependViasAcesso(boolean dependViasAcesso) {
		this.dependViasAcesso = dependViasAcesso;
	}

	public boolean isSantiAcess() {
		return santiAcess;
	}

	public void setSantiAcess(boolean santiAcess) {
		this.santiAcess = santiAcess;
	}

	public String getAtendEducacionalEspecializado() {
		return atendEducacionalEspecializado;
	}

	public void setAtendEducacionalEspecializado(
			String atendEducacionalEspecializado) {
		this.atendEducacionalEspecializado = atendEducacionalEspecializado;
	}

	public boolean isSalaDiretoria() {
		return salaDiretoria;
	}

	public void setSalaDiretoria(boolean salaDiretoria) {
		this.salaDiretoria = salaDiretoria;
	}

	public boolean isSalaProfessor() {
		return salaProfessor;
	}

	public void setSalaProfessor(boolean salaProfessor) {
		this.salaProfessor = salaProfessor;
	}

	public boolean isRefeitorio() {
		return refeitorio;
	}

	public void setRefeitorio(boolean refeitorio) {
		this.refeitorio = refeitorio;
	}

	public boolean isDespensa() {
		return despensa;
	}

	public void setDespensa(boolean despensa) {
		this.despensa = despensa;
	}

	public boolean isAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(boolean almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public boolean isAuditorio() {
		return auditorio;
	}

	public void setAuditorio(boolean auditorio) {
		this.auditorio = auditorio;
	}

	public boolean isLabInformatica() {
		return labInformatica;
	}

	public void setLabInformatica(boolean labInformatica) {
		this.labInformatica = labInformatica;
	}

	public boolean isLabCiencias() {
		return labCiencias;
	}

	public void setLabCiencias(boolean labCiencias) {
		this.labCiencias = labCiencias;
	}

	public boolean isSalaAtendimentoEspecializado() {
		return salaAtendimentoEspecializado;
	}

	public void setSalaAtendimentoEspecializado(
			boolean salaAtendimentoEspecializado) {
		this.salaAtendimentoEspecializado = salaAtendimentoEspecializado;
	}

	public boolean isQuadraEsporteCoberta() {
		return quadraEsporteCoberta;
	}

	public void setQuadraEsporteCoberta(boolean quadraEsporteCoberta) {
		this.quadraEsporteCoberta = quadraEsporteCoberta;
	}

	public boolean isQuadraEsporteDescoberta() {
		return quadraEsporteDescoberta;
	}

	public void setQuadraEsporteDescoberta(boolean quadraEsporteDescoberta) {
		this.quadraEsporteDescoberta = quadraEsporteDescoberta;
	}

	public boolean isPatioCoberto() {
		return patioCoberto;
	}

	public void setPatioCoberto(boolean patioCoberto) {
		this.patioCoberto = patioCoberto;
	}

	public boolean isPatioDescoberto() {
		return patioDescoberto;
	}

	public void setPatioDescoberto(boolean patioDescoberto) {
		this.patioDescoberto = patioDescoberto;
	}

	public boolean isParqueInfantil() {
		return parqueInfantil;
	}

	public void setParqueInfantil(boolean parqueInfantil) {
		this.parqueInfantil = parqueInfantil;
	}

	public boolean isCozinha() {
		return cozinha;
	}

	public void setCozinha(boolean cozinha) {
		this.cozinha = cozinha;
	}

	public boolean isBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(boolean biblioteca) {
		this.biblioteca = biblioteca;
	}

	public boolean isBercario() {
		return bercario;
	}

	public void setBercario(boolean bercario) {
		this.bercario = bercario;
	}

	public boolean isSanitarioNoPredio() {
		return sanitarioNoPredio;
	}

	public void setSanitarioNoPredio(boolean sanitarioNoPredio) {
		this.sanitarioNoPredio = sanitarioNoPredio;
	}

	public boolean isSanitarioForaPredio() {
		return sanitarioForaPredio;
	}

	public void setSanitarioForaPredio(boolean sanitarioForaPredio) {
		this.sanitarioForaPredio = sanitarioForaPredio;
	}

	public boolean isSanitarioAdequadoInfantil() {
		return sanitarioAdequadoInfantil;
	}

	public void setSanitarioAdequadoInfantil(boolean sanitarioAdequadoInfantil) {
		this.sanitarioAdequadoInfantil = sanitarioAdequadoInfantil;
	}

	public boolean isBanheiroChuveiro() {
		return banheiroChuveiro;
	}

	public void setBanheiroChuveiro(boolean banheiroChuveiro) {
		this.banheiroChuveiro = banheiroChuveiro;
	}

	public boolean isLavanderia() {
		return lavanderia;
	}

	public void setLavanderia(boolean lavanderia) {
		this.lavanderia = lavanderia;
	}

	public boolean isOutrasDependencias() {
		return outrasDependencias;
	}

	public void setOutrasDependencias(boolean outrasDependencias) {
		this.outrasDependencias = outrasDependencias;
	}

	public int getNumSalaExistentes() {
		return numSalaExistentes;
	}

	public void setNumSalaExistentes(int numSalaExistentes) {
		this.numSalaExistentes = numSalaExistentes;
	}

	public int getNumSalaUtilizadas() {
		return numSalaUtilizadas;
	}

	public void setNumSalaUtilizadas(int numSalaUtilizadas) {
		this.numSalaUtilizadas = numSalaUtilizadas;
	}

	public boolean isSalaLeitura() {
		return salaLeitura;
	}

	public void setSalaLeitura(boolean salaLeitura) {
		this.salaLeitura = salaLeitura;
	}

	public boolean isAlojamentoAluno() {
		return alojamentoAluno;
	}

	public void setAlojamentoAluno(boolean alojamentoAluno) {
		this.alojamentoAluno = alojamentoAluno;
	}

	public boolean isAlojamentoProfessor() {
		return alojamentoProfessor;
	}

	public void setAlojamentoProfessor(boolean alojamentoProfessor) {
		this.alojamentoProfessor = alojamentoProfessor;
	}

	public boolean isAreaVerde() {
		return areaVerde;
	}

	public void setAreaVerde(boolean areaVerde) {
		this.areaVerde = areaVerde;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	public boolean isAlimentacaoEscAlunos() {
		return alimentacaoEscAlunos;
	}

	public void setAlimentacaoEscAlunos(boolean alimentacaoEscAlunos) {
		this.alimentacaoEscAlunos = alimentacaoEscAlunos;
	}

	public boolean isAguaFiltrada() {
		return aguaFiltrada;
	}

	public void setAguaFiltrada(boolean aguaFiltrada) {
		this.aguaFiltrada = aguaFiltrada;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public int getNumComputadoresAlunos() {
		return numComputadoresAlunos;
	}

	public void setNumComputadoresAlunos(int numComputadoresAlunos) {
		this.numComputadoresAlunos = numComputadoresAlunos;
	}

	public int getNumComputadoresAdministracao() {
		return numComputadoresAdministracao;
	}

	public void setNumComputadoresAdministracao(int numComputadoresAdministracao) {
		this.numComputadoresAdministracao = numComputadoresAdministracao;
	}

	public int getNumComputadoresTotal() {
		return numComputadoresTotal;
	}

	public void setNumComputadoresTotal(int numComputadoresTotal) {
		this.numComputadoresTotal = numComputadoresTotal;
	}

	public boolean isEducacaoIndigena() {
		return educacaoIndigena;
	}

	public void setEducacaoIndigena(boolean educacaoIndigena) {
		this.educacaoIndigena = educacaoIndigena;
	}

	public boolean isLinguaIndigena() {
		return linguaIndigena;
	}

	public void setLinguaIndigena(boolean linguaIndigena) {
		this.linguaIndigena = linguaIndigena;
	}

	public boolean isBrasilAlfabetizacao() {
		return brasilAlfabetizacao;
	}

	public void setBrasilAlfabetizacao(boolean brasilAlfabetizacao) {
		this.brasilAlfabetizacao = brasilAlfabetizacao;
	}

	public boolean isAberturaFdsComun() {
		return aberturaFdsComun;
	}

	public void setAberturaFdsComun(boolean aberturaFdsComun) {
		this.aberturaFdsComun = aberturaFdsComun;
	}

	public int getNumMatriculas() {
		return numMatriculas;
	}

	public void setNumMatriculas(int numMatriculas) {
		this.numMatriculas = numMatriculas;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public LocalFuncionamento getLocalFuncionamento() {
		return localFuncionamento;
	}

	public void setLocalFuncionamento(LocalFuncionamento localFuncionamento) {
		this.localFuncionamento = localFuncionamento;
	}

	public List<Equipamento> getListaEquipamentos() {
		return listaEquipamentos;
	}

	public void setListaEquipamentos(List<Equipamento> listaEquipamentos) {
		this.listaEquipamentos = listaEquipamentos;
	}

	public List<ModalidadeEnsino> getListaModalidadeEnsino() {
		return listaModalidadeEnsino;
	}

	public void setListaModalidadeEnsino(
			List<ModalidadeEnsino> listaModalidadeEnsino) {
		this.listaModalidadeEnsino = listaModalidadeEnsino;
	}

	public List<TipoAbastecimentoAgua> getListaAbastecimentoAgua() {
		return listaAbastecimentoAgua;
	}

	public void setListaAbastecimentoAgua(
			List<TipoAbastecimentoAgua> listaAbastecimentoAgua) {
		this.listaAbastecimentoAgua = listaAbastecimentoAgua;
	}

	public List<TipoSistemaDeEsgoto> getListaSistemaEsgoto() {
		return listaSistemaEsgoto;
	}

	public void setListaSistemaEsgoto(
			List<TipoSistemaDeEsgoto> listaSistemaEsgoto) {
		this.listaSistemaEsgoto = listaSistemaEsgoto;
	}

	public List<TipoAbastecimentoEnergia> getListaAbastecimentoEnergia() {
		return listaAbastecimentoEnergia;
	}

	public void setListaAbastecimentoEnergia(
			List<TipoAbastecimentoEnergia> listaAbastecimentoEnergia) {
		this.listaAbastecimentoEnergia = listaAbastecimentoEnergia;
	}

	public List<TipoDestinacaoLixo> getListaDestinacaoLixo() {
		return listaDestinacaoLixo;
	}

	public void setListaDestinacaoLixo(
			List<TipoDestinacaoLixo> listaDestinacaoLixo) {
		this.listaDestinacaoLixo = listaDestinacaoLixo;
	}

	public int getCodEscola() {
		return codEscola;
	}

	public void setCodEscola(int codEscola) {
		this.codEscola = codEscola;
	}

	public boolean isSecretaria() {
		return secretaria;
	}

	public void setSecretaria(boolean secretaria) {
		this.secretaria = secretaria;
	}
	
	public int getQuantidadeVotos() {
		return quantidadeVotos;
	}

	public void setQuantidadeVotos(int quantidadeVotos) {
		this.quantidadeVotos = quantidadeVotos;
	}
	

}
