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

import br.com.mdsgpp.guiaescolaideal.control.EscolaControl;
import br.com.mdsgpp.guiaescolaideal.dao.ConnectionFactory;
import br.com.mdsgpp.guiaescolaideal.dao.EscolaDAO;
import br.com.mdsgpp.guiaescolaideal.model.Escola;
import br.com.mdsgpp.guiaescolaideal.util.ConnectionUtil;

@WebServlet(value = "/pegarEscola.jsp")
public class EscolaPorIdServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private EscolaDAO escolaDAO = null;
    private Connection connection = null;

    @Override
    public void service(ServletRequest request, ServletResponse response)
	    throws ServletException, IOException {

	String id = request.getParameter("id");
	RequestDispatcher dispatcher = null;

	try {
	    configuraDAO();
	    EscolaControl control = new EscolaControl(escolaDAO);
	    Escola escola = control.getEscolaPorId(id);

	    request.setAttribute("escola", escola);
	    dispatcher = request.getRequestDispatcher("/perfil.jsp");
	} catch (Exception e) {
	    dispatcher = setDispatcherErro(request, e);
	}

	ConnectionUtil.closeConnection(connection);
	dispatcher.forward(request, response);
    }

    private void configuraDAO() throws SQLException {
	this.connection = new ConnectionFactory().getConnection();
	this.escolaDAO = new EscolaDAO(connection);
    }

    private RequestDispatcher setDispatcherErro(ServletRequest request,
	    Exception e) {
	RequestDispatcher dispatcher;
	request.setAttribute("erroMsg", e.getMessage());
	dispatcher = request.getRequestDispatcher("/erro.jsp");
	return dispatcher;
    }
}
