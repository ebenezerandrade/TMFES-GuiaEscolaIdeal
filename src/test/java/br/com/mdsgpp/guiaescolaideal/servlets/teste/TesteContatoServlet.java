package br.com.mdsgpp.guiaescolaideal.servlets.teste;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.mdsgpp.guiaescolaideal.servlets.ContatoServlet;
import br.com.mdsgpp.guiaescolaideal.servlets.teste.dao.TesteDAO;

public class TesteContatoServlet {
    
    private HttpServletRequest request;
    private HttpServletResponse response;
    private TesteDAO testeDAO;
    private ContatoServlet contatoServlet;
    private RequestDispatcher dispatcherResultado;
    
    @Before
    public void setUp() throws Exception {
	request = mock(HttpServletRequest.class);
	response = mock(HttpServletResponse.class);
	
	dispatcherResultado= mock(RequestDispatcher.class);
	mock(RequestDispatcher.class);
	
	testeDAO = new TesteDAO("Teste Servlet");
	testeDAO.run();
	
	contatoServlet = new ContatoServlet();
    }

    @Test
    public void testService() throws ServletException, IOException {
	String nome = "felipe";
	String email = "felipesampaio93@hotmail.com";
	String assunto = "Teste";
	String mensagem = "Teste de Servlet do contato com a equipe de desenvolvimento";
	
	when(request.getParameter("name")).thenReturn(nome);
	when(request.getParameter("email")).thenReturn(email);
	when(request.getParameter("assunto")).thenReturn(assunto);
	when(request.getParameter("mensagem")).thenReturn(mensagem);
	
	when(request.getRequestDispatcher("/enviado.jsp")).thenReturn(dispatcherResultado);
	
	contatoServlet.service(request, response);
	
	Mockito.verify(dispatcherResultado).forward(request, response);
    }

}
