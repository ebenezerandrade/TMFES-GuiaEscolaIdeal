package br.com.mdsgpp.guiaescolaideal.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.mdsgpp.guiaescolaideal.control.EscolaControl;
import br.com.mdsgpp.guiaescolaideal.dao.Campo;
import br.com.mdsgpp.guiaescolaideal.dao.ConnectionFactory;
import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;
import br.com.mdsgpp.guiaescolaideal.util.ConnectionUtil;
import br.com.mdsgpp.guiaescolaideal.util.ConversorDeEntrada;

@WebServlet(value = "/realizarConsultaEscolaIdeal.jsp")
public class PesquisarEscolaIdealServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response)
	    throws ServletException, IOException {

	RequestDispatcher dispatcher = null;

	String modalidade = null;
	String estado = null;
	String municipio = null;
	
	String fimlucrativo = null;
	String brasilalfabet = null;
	String edindigena = null;
	
	
	String salaleitura = null;
	String salaatendespecializado = null;
	String salaprofessor = null;
	String saladiretoria = null;
	
	String labinf = null;
	String labcien = null;
	
	String quadraCoberta = null;
	String quadraDescoberta = null;
	String parqueInfantil = null;
	String patioCoberto = null;
	String patioDescoberto = null;
	
	String sanitario_adeq_infantil = null;
	String sanitario_fora_predio = null;
	
	String acessibilidade = null;
	String cozinha = null;
	String refeitorio = null;
	String alojamentoAluno = null;
	String bercario = null;
	String auditorio = null;
	String secretaria = null;
	String lavanderia = null;
	String chuveiro = null;
	String internet = null;	
	
	
	modalidade = request.getParameter("modalidade");
	estado = request.getParameter("estado");
	municipio = request.getParameter("municipio");
	
	fimlucrativo = request.getParameter("fimlucrativo");
	brasilalfabet = request.getParameter("brasilalfabet");
	edindigena = request.getParameter("indigena");
	
	
	salaleitura = request.getParameter("salaleitura");
	salaatendespecializado = request.getParameter("salaatendimentoespecial");
	salaprofessor = request.getParameter("salaprofessor");
	saladiretoria = request.getParameter("saladiretoria");
	
	labinf = request.getParameter("labinf");
	labcien = request.getParameter("labcien");
	
	sanitario_adeq_infantil = request.getParameter("sanitarioinfantil");
	sanitario_fora_predio = request.getParameter("sanitarioforapredio");
	
	quadraCoberta = request.getParameter("quadra_coberta");
	quadraDescoberta = request.getParameter("quadra_descoberta");
	parqueInfantil = request.getParameter("parqueInfantil");
	patioCoberto = request.getParameter("patioCoberto");
	patioDescoberto = request.getParameter("patioDescoberto");
	
	acessibilidade = request.getParameter("acessibilidade");
	cozinha = request.getParameter("cozinha");
	refeitorio = request.getParameter("refeitorio");
	alojamentoAluno =request.getParameter("alojamentoAluno");
	bercario = request.getParameter("bercario");
	auditorio = request.getParameter("auditorio");
	secretaria = request.getParameter("secretaria");
	lavanderia = request.getParameter("lavanderia");
	chuveiro = request.getParameter("chuveiro");
	internet = request.getParameter("internet");	
	
	
	List<Campo> campos = new ArrayList<Campo>();

	Connection con = null;

	try {

	    campos.addAll(ConversorDeEntrada.gerarCampos("DESCRICAO", estado,
		    "uf"));
	    try {
		campos.addAll(ConversorDeEntrada.gerarCampos("DESCRICAO",
			municipio, "municipio"));

	    } catch (Exception e) {
	    }
	    
	    if(!modalidade.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("DESCRICAO",
		    modalidade, "modalidade_ensino"));
	    }
	    if(!fimlucrativo.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_FINS_LURATIVOS", fimlucrativo, "escola"));
	    }
	    
	    if(!brasilalfabet.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_BRASIL_ALFABETIZACAO", brasilalfabet, "escola"));
	    }
	    
	    if(!edindigena.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_EDUCACAO_INDIGNA", edindigena, "escola"));
	    }
	    
	    if(!salaleitura.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SALA_LEITURA", salaleitura, "escola"));
	    }
	    
	    if(!salaatendespecializado.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SALA_ATEND_ESP", salaatendespecializado, "escola"));
	    }
	    
	    if(!salaprofessor.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SALA_PROFESSOR", salaprofessor, "escola"));
	    }
	    if(!saladiretoria.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SALA_DIRETORIA", saladiretoria, "escola"));
	    }
	    if(!labinf.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_LAB_INFO", labinf,
		    "escola"));
	    }
	    if(!labcien.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_LAB_CIENCIAS",
		    labcien, "escola"));
	    }
	    if(!sanitario_adeq_infantil.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SANITARIO_EDUC_ADEQ_INFAN",
		    sanitario_adeq_infantil, "escola"));
	    }
	    if(!sanitario_adeq_infantil.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SANITARIO_EDUC_ADEQ_INFAN",
		    sanitario_adeq_infantil, "escola"));
	    }
	    if(!sanitario_fora_predio.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SANITARIO_FORA_PREDIO",
		    sanitario_fora_predio, "escola"));
	    }
	    if(!sanitario_fora_predio.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SANITARIO_FORA_PREDIO",
		    sanitario_fora_predio, "escola"));
	    }
	    if(!quadraCoberta.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos(
		    "SE_QUADRA_ESPO_COBERTA", quadraCoberta, "escola"));
	    }
	    if(!quadraDescoberta.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos(
		    "SE_QUADRA_ESPO_DESCOBERTA", quadraDescoberta, "escola"));
	    }
	    if(!parqueInfantil.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos(
		    "SE_PARQUE_INFANTIL", parqueInfantil, "escola"));
	    }
	    if(!patioCoberto.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos(
		    "SE_PATIO_COBERTO", patioCoberto, "escola"));
	    }
	    if(!patioDescoberto.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos(
		    "SE_PATIO_DESCOBERTO", patioDescoberto, "escola"));
	    }
	    if(!acessibilidade.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_ACESSIBILIDADE",
		    acessibilidade, "escola"));
	    }
	    if(!cozinha.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_COZINHA",
		    cozinha, "escola"));
	    }
	    if(!refeitorio.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_REFEITORIO",
		    refeitorio, "escola"));
	    }
	    if(!alojamentoAluno.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_ALOJAMENTO_ALUNO",
		    alojamentoAluno, "escola"));
	    }
	    if(!bercario.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_BERCARIO",
		    bercario, "escola"));
	    }
	    if(!auditorio.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_AUDITORIO",
		    auditorio, "escola"));
	    }
	    if(!secretaria.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_SECRETARIA",
		    secretaria, "escola"));
	    }
	    if(!lavanderia.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_LAVANDERIA",
		    lavanderia, "escola"));
	    }
	    if(!chuveiro.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_BANHEIRO_CHUVEIRO",
		    chuveiro, "escola"));
	    }
	    if(!internet.isEmpty())
	    {
		campos.addAll(ConversorDeEntrada.gerarCampos("SE_INTERNET",
			    internet, "escola"));
	    }
	    
	    con = new ConnectionFactory().getConnection();
	    EscolaDAO escolaDAO = new EscolaDAO(con);
	    EscolaControl escolaControl = new EscolaControl(escolaDAO);

	    request.setAttribute("listaescola",
		    escolaControl.getEscolaIdeal(campos));

	    dispatcher = request.getRequestDispatcher("/resultadoPesquisa.jsp");
	} catch (Exception e) {
	    dispatcher = setDispatcherErro(request, e);
	} 
	    
	ConnectionUtil.closeConnection(con);
	dispatcher.forward(request, response);
    }

    private RequestDispatcher setDispatcherErro(ServletRequest request,
	    Exception e) {
	RequestDispatcher dispatcher;
	request.setAttribute("erroMsg", e.getMessage());
	dispatcher = request.getRequestDispatcher("/erro.jsp");
	return dispatcher;
    }

}
