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

import br.com.mdsgpp.guiaescolaideal.servlets.PesquisarEscolaIdealServlet;
import br.com.mdsgpp.guiaescolaideal.servlets.teste.dao.TesteDAO;

public class TestePesquisarEscolaIdealServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private TesteDAO testeDAO;
    private RequestDispatcher dispatcherResultado;
    private RequestDispatcher dispatcherErro;

    private PesquisarEscolaIdealServlet idealServlet;

    @Before
    public void inicializaComponentesBasicos() throws Exception {
	request = mock(HttpServletRequest.class);
	response = mock(HttpServletResponse.class);

	dispatcherResultado = mock(RequestDispatcher.class);
	dispatcherErro = mock(RequestDispatcher.class);

	testeDAO = new TesteDAO("Teste Servlet");
	testeDAO.run();

	idealServlet = new PesquisarEscolaIdealServlet();
    }

    @Test
    public void cenarioComTodosOsDados() throws ServletException, IOException {
	Mockito.when(request.getParameter(Mockito.anyString())).thenReturn("sim");
	Mockito.when(request.getParameter("estado")).thenReturn("Javavah");
	Mockito.when(request.getParameter("modalidade")).thenReturn("java");
	Mockito.when(request.getParameter("municipio")).thenReturn("");
	
	configuraDispatcherParaPaginaResultados();
	
	idealServlet.service(request, response);
	
	Mockito.verify(dispatcherResultado).forward(request, response);
    }
    
    @Test
    public void cenarioComApenasEstadoModalidade() throws ServletException, IOException {
	Mockito.when(request.getParameter(Mockito.anyString())).thenReturn("");
	Mockito.when(request.getParameter("estado")).thenReturn("Javavah");
	Mockito.when(request.getParameter("modalidade")).thenReturn("java");
	
	configuraDispatcherParaPaginaResultados();
	
	idealServlet.service(request, response);
	
	Mockito.verify(dispatcherResultado).forward(request, response);
    }
    
    @Test
    public void cenarioComEstadoInvalido() throws ServletException, IOException {
	Mockito.when(request.getParameter(Mockito.anyString())).thenReturn("");
	Mockito.when(request.getParameter("estado")).thenReturn("@#$%");
	Mockito.when(request.getParameter("modalidade")).thenReturn("java");
	
	configuraDispatcherParaPaginaDeErro();
	
	idealServlet.service(request, response);
	
	Mockito.verify(dispatcherErro).forward(request, response);
    }
    
    @Test
    public void cenarioComMunicipioInvalido() throws ServletException, IOException {
	Mockito.when(request.getParameter(Mockito.anyString())).thenReturn("");
	Mockito.when(request.getParameter("municipio")).thenReturn("@#$%");
	
	configuraDispatcherParaPaginaDeErro();
	
	idealServlet.service(request, response);
	
	Mockito.verify(dispatcherErro).forward(request, response);
    }
    
    private void configuraDispatcherParaPaginaDeErro() {
	when(request.getRequestDispatcher("/erro.jsp")).thenReturn(
		dispatcherErro);
    }

    private void configuraDispatcherParaPaginaResultados() {
	when(request.getRequestDispatcher("/resultadoPesquisa.jsp"))
		.thenReturn(dispatcherResultado);
    }

}
