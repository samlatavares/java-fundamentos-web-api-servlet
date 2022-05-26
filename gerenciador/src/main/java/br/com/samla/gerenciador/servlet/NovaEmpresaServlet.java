package br.com.samla.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome");
		String dataAberturaParam = request.getParameter("data");		
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataAberturaParam);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adicionar(empresa);
		
		response.sendRedirect("listaEmpresas");
		
		//Chamando JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas"); //Chamando o sevlet de listaEmpresas que preencher� a lista
//		request.setAttribute("nomeEmpresa", empresa.getNome());
//		request.setAttribute("dataAbertura", empresa.getDataAbertura());
//		rd.forward(request, response);
	}

}
