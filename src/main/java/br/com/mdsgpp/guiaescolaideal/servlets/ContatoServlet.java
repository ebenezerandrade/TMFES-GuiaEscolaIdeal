package br.com.mdsgpp.guiaescolaideal.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mdsgpp.guiaescolaideal.control.ContatoControl;
import br.com.mdsgpp.guiaescolaideal.exceptions.ContatoException;

@WebServlet(value = "/enviarEmail.jsp")
public class ContatoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {

	ContatoControl control = new ContatoControl();
	RequestDispatcher dispatcher = null;

	String nome = null;
	String email = null;
	String assunto = null;
	String mensagem = null;

	nome = request.getParameter("name");
	email = request.getParameter("email");
	assunto = request.getParameter("assunto");
	mensagem = request.getParameter("mensagem");

	String mensagemCompleta = "Enviada por " + nome + " <" + email + " >"
		+ "\n" + mensagem;
	try {
	    control.sendMail("contato.guiaescolaideal@gmail.com",
		    "contato.guiaescolaideal@gmail.com", assunto,
		    mensagemCompleta);

	    dispatcher = request.getRequestDispatcher("/enviado.jsp");

	} catch (ContatoException e) {

	    request.setAttribute("erroMsg", e.getMessage());
	    dispatcher = request.getRequestDispatcher("/erro.jsp");
	}
	dispatcher.forward(request, response);
    }

}
