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
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.exceptions.EscolaRepetidaException;
import br.com.mdsgpp.guiaescolaideal.exceptions.QuantidadeDeEscolasExcedenteException;
import br.com.mdsgpp.guiaescolaideal.model.Escola;
import br.com.mdsgpp.guiaescolaideal.servlets.RemovePerfilServlet;
import br.com.mdsgpp.guiaescolaideal.servlets.teste.dao.TesteDAO;
import br.com.mdsgpp.guiaescolaideal.util.Compara;

public class TesteRemovePerfilServlet {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private RequestDispatcher dispatcherCompara;
    private RequestDispatcher dispatcherErro;
    private HttpSession session;
    private Compara compara;

    private TesteDAO testeDAO;
    private RemovePerfilServlet perfilServlet;

    @Before
    public void inicializaComponentesBasicos() throws Exception {
	request = mock(HttpServletRequest.class);
	response = mock(HttpServletResponse.class);

	dispatcherCompara = mock(RequestDispatcher.class);
	dispatcherErro = mock(RequestDispatcher.class);

	session = mock(HttpSession.class);

	compara = new Compara();

	when(session.getAttribute("compara")).thenReturn(compara);
	when(request.getSession()).thenReturn(session);

	perfilServlet = new RemovePerfilServlet();

	addEscolasNoBanco();
    }

    @Test
    public void cenarioRemoveEscola() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException, ServletException, IOException {
	addEscola(17451);
	addParameterId("17451");
	configuraDispatcherParaPaginaComparaPerfis();
	
	perfilServlet.service(request, response);
	
	verify(dispatcherCompara).forward(request, response);
    }
    
    @Test
    public void cenarioRemoveEscolaInexistente() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException, ServletException, IOException {
	addEscola(17451);
	addParameterId("45687");
	configuraDispatcherParaPaginaDeErro();
	
	perfilServlet.service(request, response);
	
	verify(dispatcherCompara, never()).forward(request, response);
	verify(dispatcherErro).forward(request, response);
    }
    
    @Test
    public void cenarioSessionSemAtributo() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException, ServletException, IOException {
	when(session.getAttribute("compara")).thenReturn(null);
	configuraDispatcherParaPaginaDeErro();
	
	perfilServlet.service(request, response);
	
	verify(dispatcherCompara, never()).forward(request, response);
	verify(dispatcherErro).forward(request, response);
    }


    private void addEscolasNoBanco() {
	testeDAO = new TesteDAO("Teste Servlet");
	testeDAO.run();
    }
    
    private void addEscola(int id) throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	Escola escola = mock(Escola.class);
	when(escola.getCodEscola()).thenReturn(id);
	compara.add(escola);
    }
    
    private void addParameterId(String id) {
	when(request.getParameter("id")).thenReturn(id);
    }
    
    private void configuraDispatcherParaPaginaDeErro() {
	when(request.getRequestDispatcher("/erro.jsp")).thenReturn(dispatcherErro);
    }

    private void configuraDispatcherParaPaginaComparaPerfis() {
	when(request.getRequestDispatcher("/comparaPerfis.jsp")).thenReturn(dispatcherCompara);
    }
}
