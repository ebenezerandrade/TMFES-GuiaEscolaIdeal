<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pesquisar Escola por CEP</title>
<script src="js/jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>
 <script src="js/jquery.maskedinput.min.js" type="text/javascript"></script>

 <script type="text/javascript">
  $(function() {
  $("#cep").mask("99999-999");
  });
</script>
<script type="text/javascript">
  
 function validar(){
 	var regexCep = /[0-9]{5}-[0-9]{3}/;

 	if(!regexCep.test(form1.cep.value)){
 	 alert("cep invalido");
 	 return false;
 	}
 	return true;
 }

</script>
</head>
<body>
	<table>
		<form name="form1" action="realizarConsultaPorCep.jsp" method="post">
 
   		<label>CEP:<input pattern="[0-9]{5}-[0-9]{3}" type="text" id="cep" name="cep"></label>

		<td><input type="submit" onclick="return validar()"/></td>
		</form>
	</table>
</body>
</html>