<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<script language="javascript" type="text/javascript">
	function validarEspecifica() {
		var nome = form1.nome.value;
		var estado = form1.estado.value;
		var municipio = form1.municipio.value;
		
		if(nome == ""){
			alert('Digite o nome da escola');
			form1.nome.focus();
			return false;
		}
		
		if (nome.length < 3) {
			alert('Nome escola deve ter pelo menos 3 caracteres');
			form1.nome.focus();
			return false;
		}
		
		if (estado == "") {
			alert('Selecione um estado');
			form1.estado.focus();
			return false;
		}
		
		return true;
	}
</script>
<script language="JavaScript">
	function jumpScroll(){
		window.scroll(250,0);
	}
</script>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript">
		$(function() {
			$('ul li a').bind('click',function(event){
				var $anchor = $(this);
				/*
				if you want to use one of the easing effects:
				$('html, body').stop().animate({
					scrollLeft: $($anchor.attr('href')).offset().left
				}, 1500,'easeInOutExpo');
				 */
				$('html, body').stop().animate({
					scrollLeft: $($anchor.attr('href')).offset().left
				}, 1000);
				event.preventDefault();
			});
		})
    </script>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guia da Escola Ideal</title>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
$(window).load(function() {
	$(".loader").fadeOut("slow");
})

</script>

<script language="javascript" type="text/javascript">
	function validar() {
		var nome = form1.nome.value;
		var estado = form1.estado.value;
		
		if(nome == ""){
			alert('Digite o nome da escola');
			form1.nome.focus();
			return false;
		}
		
		if (nome.length < 3) {
			alert('Nome escola deve ter pelo menos 3 caracteres');
			form1.nome.focus();
			return false;
		}
		
		if (estado == "") {
			alert('Selecione um estado');
			form1.estado.focus();
			return false;
		}
		
		return true;
	}
</script>
<script src="http://code.jquery.com/jquery-1.6.3.min.js" type="text/javascript"></script>

<script src="scripts/jquery.cycle.all.js" type="text/javascript"></script>
</head>
<body onLoad="jumpScroll()">

<div class="loader"></div>



<%@ include file="header.jsp" %> 
<%@ include file="nav.jsp" %> 
<%@ include file="home.jsp" %> 
<%@ include file="selecaobusca.jsp" %> 
<%@ include file="noticias.jsp" %> 
<%@ include file="faq.jsp" %> 
<%@ include file="quem.jsp" %> 
<%@ include file="contato.jsp" %> 

<div class="footer"></div>


</body>
</html>