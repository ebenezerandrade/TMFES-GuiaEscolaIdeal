package br.com.mdsgpp.guiaescolaideal.servlets.teste;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.servlets.PesquisarEscolaEspecificaServlet;
import br.com.mdsgpp.guiaescolaideal.servlets.teste.dao.TesteDAO;

public class TestePesquisarEscolaEspecificaServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private TesteDAO testeDAO;
    private PesquisarEscolaEspecificaServlet escolaEspecificaServlet;
    private RequestDispatcher dispatcherResultado;
    private RequestDispatcher dispatcherErro;
    
    @Before
    public void inicializaComponentesBasicos() throws Exception {
	request = mock(HttpServletRequest.class);
	response = mock(HttpServletResponse.class);
	
	dispatcherResultado= mock(RequestDispatcher.class);
	dispatcherErro = mock(RequestDispatcher.class);
	
	testeDAO = new TesteDAO("Teste Servlet");
	testeDAO.run();
	
	escolaEspecificaServlet = new PesquisarEscolaEspecificaServlet();
    }

    @Test
    public void cenarioComCamposValidos() throws ServletException, IOException {
	String escola = "fga unb";
	String estado = "javavah";
	String municipio = "Rua dos loucos";
	
	when(request.getParameter("nome")).thenReturn(escola);
	when(request.getParameter("estado")).thenReturn(estado);
	when(request.getParameter("municipio")).thenReturn(municipio);
	
	configuraDispatcherParaPaginaResultados();
	
	escolaEspecificaServlet.service(request, response);
	
	verify(dispatcherResultado).forward(request, response);
	verify(dispatcherErro, never()).forward(request, response);
    }

    @Test
    public void cenarioComCamposValidosSemMunicipio() throws ServletException, IOException {
	String escola = "fga unb";
	String estado = "javavah";
	String municipio = "";
	
	when(request.getParameter("nome")).thenReturn(escola);
	when(request.getParameter("estado")).thenReturn(estado);
	when(request.getParameter("municipio")).thenReturn(municipio);
	
	configuraDispatcherParaPaginaResultados();
	
	escolaEspecificaServlet.service(request, response);
	
	verify(dispatcherResultado).forward(request, response);
	verify(dispatcherErro, never()).forward(request, response);
    }

    @Test
    public void cenarioComCampoNomeVazio() throws ServletException, IOException {
	String escola = "";
	String estado = "javavah";
	String municipio = "Rua dos loucos";
	
	when(request.getParameter("nome")).thenReturn(escola);
	when(request.getParameter("estado")).thenReturn(estado);
	when(request.getParameter("municipio")).thenReturn(municipio);
	
	configuraDispatcherParaPaginaDeErro();
	
	escolaEspecificaServlet.service(request, response);
	
	verify(dispatcherResultado, never()).forward(request, response);
	verify(dispatcherErro).forward(request, response);
    }
    
    @Test
    public void cenarioComCampoNomeInvalido() throws ServletException, IOException {
	String escola = "%%%";
	String estado = "javavah";
	String municipio = "Rua dos loucos";
	
	when(request.getParameter("nome")).thenReturn(escola);
	when(request.getParameter("estado")).thenReturn(estado);
	when(request.getParameter("municipio")).thenReturn(municipio);
	
	configuraDispatcherParaPaginaDeErro();
	
	escolaEspecificaServlet.service(request, response);
	
	verify(dispatcherResultado, never()).forward(request, response);
	verify(dispatcherErro).forward(request, response);
    }

    @Test
    public void cenarioComCampoEstadoVazio() throws ServletException, IOException {
	String escola = "fga";
	String estado = "";
	String municipio = "Rua dos loucos";
	
	when(request.getParameter("nome")).thenReturn(escola);
	when(request.getParameter("estado")).thenReturn(estado);
	when(request.getParameter("municipio")).thenReturn(municipio);
	
	configuraDispatcherParaPaginaDeErro();
	
	escolaEspecificaServlet.service(request, response);
	
	verify(dispatcherResultado, never()).forward(request, response);
	verify(dispatcherErro).forward(request, response);
    }
    
    private void configuraDispatcherParaPaginaDeErro() {
	when(request.getRequestDispatcher("/erro.jsp")).thenReturn(dispatcherErro);
    }

    private void configuraDispatcherParaPaginaResultados() {
	when(request.getRequestDispatcher("/resultadoPesquisa.jsp")).thenReturn(dispatcherResultado);
    }
}
