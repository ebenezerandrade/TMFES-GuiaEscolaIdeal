<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<script language="JavaScript">
	function jumpScroll(){
		window.scroll(1600,0);
	}
</script>

<meta charset="UTF-8">
<title>Guia da Escola Ideal</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<link type="text/css" rel="stylesheet" href="css/paginacao.css" />
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
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery.pajinate.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#busca').pajinate({
			items_per_page : 3,
			num_page_links_to_display : 10,
			abort_on_small_lists : true,
		});
	});
</script>

<script type="text/javascript">
$(window).load(function() {
	$(".loader").fadeOut("slow");
})

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

<script type="text/javascript" src="./js/jquery-1.3.1.min.js"></script>
	<script type="text/javascript" src="./js/jquery.tablesorter.js"></script>
	<script type="text/javascript" src="./js/jquery.tablesorter.pager.js"></script>


</head>
<body onLoad="jumpScroll()">
	<div class="loader"></div>
	<%@ include file="header.jsp"%>
	<%@ include file="nav.jsp"%>
	<%@ include file="home.jsp"%>
	<%@ include file="pesquisaescolaespecifica.jsp"%>
	
	<%@ include file="noticias.jsp"%>
	<%@ include file="faq.jsp"%>
	<%@ include file="quem.jsp"%>
	<%@ include file="contato.jsp"%>
	<div class="footer"></div>
	
	
</body>
</html>