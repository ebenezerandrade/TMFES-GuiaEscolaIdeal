package br.com.mdsgpp.guiaescolaideal.servlets.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
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
import br.com.mdsgpp.guiaescolaideal.servlets.AddPerfilServlet;
import br.com.mdsgpp.guiaescolaideal.servlets.teste.dao.TesteDAO;
import br.com.mdsgpp.guiaescolaideal.util.Compara;

public class TesteComparaPerfisServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private RequestDispatcher dispatcherCompara;
    private RequestDispatcher dispatcherErro;
    private HttpSession session;
    private Compara compara;
    
    private TesteDAO testeDAO;
    private AddPerfilServlet comparaPerfisServlet;
    
    @Before
    public void inicializaComponentesBasicos() throws Exception {
	request = mock(HttpServletRequest.class);
	response = mock(HttpServletResponse.class);
	
	dispatcherCompara= mock(RequestDispatcher.class);
	dispatcherErro = mock(RequestDispatcher.class);
	
	session = mock(HttpSession.class);
	
	compara = new Compara();
	
	when(session.getAttribute("compara")).thenReturn(compara);
	when(request.getSession()).thenReturn(session);
	
	comparaPerfisServlet = new AddPerfilServlet();
	
	addEscolasNoBanco();
    }

    @Test
    public void cenarioAddUmaEscola() throws ServletException, IOException {
	addParameterId("75015");
	configuraDispatcherParaPaginaComparaPerfis();
	
	assertNull(compara.getEscolaA());
	
	comparaPerfisServlet.service(request, response);
	
	verify(dispatcherCompara).forward(request, response);
	assertNotNull(compara.getEscolaA());
    }
    
    @Test
    public void cenarioComUmaEscolaExistente() throws ServletException, IOException, QuantidadeDeEscolasExcedenteException, EscolaRepetidaException{
	addEscola();
	addParameterId("75015");
	configuraDispatcherParaPaginaComparaPerfis();
	
	assertNotNull(compara.getEscolaA());
	assertNull(compara.getEscolaB());
	
	comparaPerfisServlet.service(request, response);
	
	verify(dispatcherCompara).forward(request, response);
	
	assertNotNull(compara.getEscolaA());
	assertNotNull(compara.getEscolaB());
    }
    
    @Test
    public void cenarioAdicionandoUmaEscolaJaExistente() throws ServletException, IOException, QuantidadeDeEscolasExcedenteException, EscolaRepetidaException{
	addEscola(75015);
	addParameterId("75015");
	configuraDispatcherParaPaginaDeErro();
	
	assertNotNull(compara.getEscolaA());
	assertNull(compara.getEscolaB());
	
	comparaPerfisServlet.service(request, response);
	
	verify(dispatcherErro).forward(request, response);
	
	assertNotNull(compara.getEscolaA());
	assertNull(compara.getEscolaB());
    }
    
    @Test
    public void cenarioComDuasEscolas() throws ServletException, IOException, QuantidadeDeEscolasExcedenteException, EscolaRepetidaException{
	addEscola(1234);
	addEscola(4321);
	
	addParameterId("75015");
	configuraDispatcherParaPaginaDeErro();
	
	assertNotNull(compara.getEscolaA());
	assertNotNull(compara.getEscolaB());
	
	comparaPerfisServlet.service(request, response);
	
	verify(dispatcherErro).forward(request, response);
	
	assertNotNull(compara.getEscolaA());
	assertNotNull(compara.getEscolaB());
    }
    
    private void addEscola() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	compara.add(mock(Escola.class));
    }
    
    private void addEscola(int id) throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	Escola escola = mock(Escola.class);
	when(escola.getCodEscola()).thenReturn(id);
	compara.add(escola);
    }

    private void addParameterId(String id) {
	when(request.getParameter("id")).thenReturn(id);
    }
    
    private void addEscolasNoBanco() {
	testeDAO = new TesteDAO("Teste Servlet");
	testeDAO.run();
    }
    
    private void configuraDispatcherParaPaginaDeErro() {
	when(request.getRequestDispatcher("/erro.jsp")).thenReturn(dispatcherErro);
    }

    private void configuraDispatcherParaPaginaComparaPerfis() {
	when(request.getRequestDispatcher("/comparaPerfis.jsp")).thenReturn(dispatcherCompara);
    }

}
