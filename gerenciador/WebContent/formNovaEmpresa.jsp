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
		<form name="form" action="${linkServletNovaEmpresa}" method="post" onSubmit="return validateForm()">
			Nome: <input type="text" name="nome"/>
			Data Abertura: <input type="text" name="data" id="data"/>
			<br/>
			<input type="submit"/>
		</form>
	</body>
</html>

<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script type="text/javascript">
	function validateForm() {
	  var nome = document.forms["form"]["nome"].value;
	  var data = document.forms["form"]["nome"].value;
	  if (nome == "" || data == "") {
	    alert("É obrigatório informar Nome e Data Abertura!");
	    return false;
	  }
	}
	
	$( function() {
	    $("#data").datepicker();
	  } );
</script>