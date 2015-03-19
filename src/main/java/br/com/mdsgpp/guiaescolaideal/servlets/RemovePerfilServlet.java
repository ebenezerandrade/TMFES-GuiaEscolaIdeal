package br.com.mdsgpp.guiaescolaideal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.mdsgpp.guiaescolaideal.exceptions.SessionVaziaException;
import br.com.mdsgpp.guiaescolaideal.util.Compara;
import br.com.mdsgpp.guiaescolaideal.util.ConversorDeEntrada;

@WebServlet(value = "/removePerfilServlet.jsp")
public class RemovePerfilServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void service(ServletRequest request, ServletResponse response)
	    throws ServletException, IOException {

	RequestDispatcher dispatcher = null;

	try {

	    HttpSession session = ((HttpServletRequest) request).getSession();

	    if (!verificaSeExisteAtributoCompara(session)) {
		throw new SessionVaziaException("Nenhuma escola ainda foi adicionada.");
	    }

	    String id = request.getParameter("id");	    

	    Compara compara = (Compara) session.getAttribute("compara");
	    
	    int idNumerico = ConversorDeEntrada.getNumeroInteiro(id);
	    
	    compara.remove(idNumerico);

	    dispatcher = request.getRequestDispatcher("/comparaPerfis.jsp");
	} catch (Exception e) {
	    dispatcher = setDispatcherErro(request, e);
	}

	dispatcher.forward(request, response);
    }
    
    private boolean verificaSeExisteAtributoCompara(HttpSession session) {
	return (session.getAttribute("compara") != null ? true : false);
    }

    private RequestDispatcher setDispatcherErro(ServletRequest request,
	    Exception e) {
	System.out.println(e.getMessage());
	RequestDispatcher dispatcher;
	request.setAttribute("erroMsg", e.getMessage());
	request.setAttribute("redirecionaPara", "comparaPerfis.jsp");
	dispatcher = request.getRequestDispatcher("/erro.jsp");
	return dispatcher;
    }
}
