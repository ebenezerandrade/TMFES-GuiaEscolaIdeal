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

import br.com.mdsgpp.guiaescolaideal.servlets.EscolaPorIdServlet;
import br.com.mdsgpp.guiaescolaideal.servlets.teste.dao.TesteDAO;

public class TesteEscolaPorIdServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private TesteDAO testeDAO;
    private EscolaPorIdServlet servletEscolaBuscaPorId;
    private RequestDispatcher dispatcherPerfil;
    private RequestDispatcher dispatcherErro;
    
    @Before
    public void inicializaComponentesBasicos() throws Exception {
	request = mock(HttpServletRequest.class);
	response = mock(HttpServletResponse.class);
	
	dispatcherPerfil= mock(RequestDispatcher.class);
	dispatcherErro = mock(RequestDispatcher.class);
	testeDAO = new TesteDAO("Teste Servlet");
	testeDAO.run();
	
	servletEscolaBuscaPorId = new EscolaPorIdServlet();
    }

    @Test
    public void cenarioComIdValido() throws ServletException, IOException {
	String id = "75015";
	when(request.getParameter("id")).thenReturn(id);
	
	configuraDispatcherParaPaginaPerfil();
	servletEscolaBuscaPorId.service(request, response);
	
	verify(dispatcherPerfil).forward(request, response);
	verify(dispatcherErro, never()).forward(request, response);
    }
    
    @Test
    public void cenarioComIdInvalido() throws ServletException, IOException {
	String id = "seteCincoDois";
	when(request.getParameter("id")).thenReturn(id);
	
	configuraDispatcherParaPaginaDeErro();
	servletEscolaBuscaPorId.service(request, response);
	
	verify(dispatcherPerfil, never()).forward(request, response);
	verify(dispatcherErro).forward(request, response);
    }
    
    private void configuraDispatcherParaPaginaDeErro() {
	when(request.getRequestDispatcher("/erro.jsp")).thenReturn(dispatcherErro);
    }

    private void configuraDispatcherParaPaginaPerfil() {
	when(request.getRequestDispatcher("/perfil.jsp")).thenReturn(dispatcherPerfil);
    }
}
