<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guia da Escola Ideal | Erro</title>

<style>
body{
	background-color: #F8F8F8;
	margin 0 0;
	text-align: center;
}

.error {
	background-color: #900000;
	border: 1px solid black;
	padding: 20px;
	margin:10px;
	
	border-radius:5px;
	color: white;
	font-size: 18px;
	font-weight: bold;
	text-shadow: 2px 2px 2px black;
	
}

.redirecionar{
	color: black;
	font-size: 16px;
	font-weight: bold;
	text-shadow: 1px 1px 1px white;
}

.redirecionar a{
	color:black;
	text-decoration: blink;
}

</style>

</head>
<body>
	<div class="error">
		${erroMsg}
	</div>
	
	<div class="redirecionar">
		Você será direcionado automaticamente em 10 segundos, caso não deseje ser redirecionado <a href='${redirecionaPara != null ? redirecionaPara : "index.jsp"}'>clique aqui</a>.
	</div>
	<script type="text/javascript">
		setTimeout("location.href='${redirecionaPara != null? redirecionaPara : "index.jsp"}'",10000);
	</script>
</body>
</html>