<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html class="main">
	<head>
		<meta charset="ISO-8859-1">
		<title>Nova Empresa</title>
	</head>
	
	<link rel="stylesheet" href="<c:url value="style.css"/>">
	<h1>Criação de Empresa</h1>
	<body>		
		<form action="${linkServletNovaEmpresa}" method="post">
			Nome: <input type="text" name="nome"/>
			Data Abertura: <input type="text" name="data"/>
			<br/>
			<input type="submit"/>
		</form>
	</body>
</html>