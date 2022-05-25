package br.com.samla.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listaEmpresasServlet
 */
@WebServlet(name = "ListaEmpresasServlet", urlPatterns = { "/listaEmpresas" })
public class listaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> listaEmpresas = banco.getListaEmpresas();
		
		//Chamando JSP
		RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");
		request.setAttribute("empresas", listaEmpresas);
		rd.forward(request, response);
	}

}
