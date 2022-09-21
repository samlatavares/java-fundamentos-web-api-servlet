<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html class="main">
	<link rel="stylesheet" href="<c:url value="style.css"/>">
	<body>
		<c:if test="${not empty nomeEmpresa}">		
			Empresa ${ nomeEmpresa } cadastrada com sucesso!
		</c:if>
		
		<c:if test="${empty nomeEmpresa}">		
			Nenhuma empresa cadastrada!
		</c:if>
	</body>
</html>
