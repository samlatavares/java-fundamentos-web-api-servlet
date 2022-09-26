
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.samla.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html class="main">
	<head>
		<title>Lista de Empresas</title>
	</head>
	
	<link rel="stylesheet" href="<c:url value="style.css"/>">
	
	<body>
	<h1>Lista de Empresas</h1>	
		<c:if test="${not empty nomeEmpresa}">		
			Empresa ${nomeEmpresa} cadastrada com sucesso!
		</c:if>
		
		<c:if test="${empty empresas}">		
			Nenhuma empresa cadastrada!
		</c:if>
			
		<ul>
			<c:forEach items="${empresas}" var="novaEmpresa">		
				<li>
					${novaEmpresa.nome} - <fmt:formatDate value="${novaEmpresa.dataAbertura}" pattern="dd/MM/yyyy"/>
					<a href="/gerenciador/mostraEmpresa?id=${novaEmpresa.id}">editar</a>
					<a href="/gerenciador/removeEmpresa?id=${novaEmpresa.id}">remover</a>
				</li>
			</c:forEach>		
		</ul>
		<input type="submit" value="Nova Empresa" onClick="openPage('formNovaEmpresa.jsp')"/>
	</body>
</html>

<script type="text/javascript">
 function openPage(pageURL)
 {
 	window.location.href = pageURL;
 }
</script>