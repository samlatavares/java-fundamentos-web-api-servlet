
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.samla.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Lista de Empresas</title>
	</head>
	<body>
		Lista de empresas: <br/>
		<ul>
			<c:forEach items="${empresas}" var="novaEmpresa">
				<li>${novaEmpresa.nome}</li>
			</c:forEach>		
		</ul>
	</body>
</html>