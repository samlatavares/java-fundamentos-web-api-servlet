package br.com.samla.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome");
		String dataAberturaParam = request.getParameter("data");
		String idParam = request.getParameter("id");
		Integer id = Integer.valueOf(idParam);
		
		if(nomeEmpresa != null && !nomeEmpresa.isEmpty() && dataAberturaParam != null && !dataAberturaParam.isEmpty()) {
			Date dataAbertura = null;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				dataAbertura = sdf.parse(dataAberturaParam);
			} catch (ParseException e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
			
			Banco banco = new Banco();
			Empresa empresa = banco.buscarEmpresa(id);
			empresa.setDataAbertura(dataAbertura);
			empresa.setNome(nomeEmpresa);
			
			response.sendRedirect("listaEmpresas");
		} else {
			ScriptEngine js = new ScriptEngineManager().getEngineByName("javascript");
			try {
				js.eval("alert(É obrigatório informar Nome e Data de Abertura!);");
			} catch (ScriptException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
