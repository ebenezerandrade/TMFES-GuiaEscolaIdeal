package br.com.mdsgpp.guiaescolaideal.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.mdsgpp.guiaescolaideal.control.EscolaControl;
import br.com.mdsgpp.guiaescolaideal.dao.ConnectionFactory;
import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;
import br.com.mdsgpp.guiaescolaideal.model.Escola;
import br.com.mdsgpp.guiaescolaideal.util.Compara;
import br.com.mdsgpp.guiaescolaideal.util.ConnectionUtil;

@WebServlet(value = "/addPerfilServlet.jsp")
public class AddPerfilServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void service(ServletRequest request, ServletResponse response)
	    throws ServletException, IOException {

	RequestDispatcher dispatcher = null;
	Connection connection = null;

	try {

	    HttpSession session = ((HttpServletRequest) request).getSession();

	    if (!verificaSeExisteAtributoCompara(session)) {
		criaAtributoCompara(session);
	    }

	    String id = request.getParameter("id");

	    connection = new ConnectionFactory().getConnection();
	    EscolaControl control = configuraControlEscola(connection);
	    Escola escola = control.getEscolaPorId(id);

	    Compara compara = (Compara) session.getAttribute("compara");
	    compara.add(escola);

	    dispatcher = request.getRequestDispatcher("/comparaPerfis.jsp");
	} catch (Exception e) {
	    dispatcher = setDispatcherErro(request, e);
	}

	ConnectionUtil.closeConnection(connection);
	dispatcher.forward(request, response);
    }

    private EscolaControl configuraControlEscola(Connection connection)
	    throws SQLException {
	EscolaDAO escolaDAO = new EscolaDAO(connection);
	return new EscolaControl(escolaDAO);
    }

    private void criaAtributoCompara(HttpSession session) {
	Compara compara = new Compara();
	session.setAttribute("compara", compara);
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