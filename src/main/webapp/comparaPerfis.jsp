<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Guia da Escola Ideal</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/freelancer.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">

<!-- Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>

	<!-- IE8 support for HTML5 elements and media queries -->
	<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

</head>
<body>

	<%@ include file="navbar.jsp"%>
	<%@ include file="guia.jsp"%>
	<%@ include file="home.jsp"%>
	<%@ include file="selecionabusca.jsp"%>
	<%@ include file="faq.jsp"%>
	<%@ include file="quemsomos.jsp"%>
	<%@ include file="contato.jsp"%>
	<%@ include file="footer.jsp"%>
	<%@ include file="pesquisaespecifica.jsp"%>
	<%@ include file="pesquisaideal.jsp"%>
	<%@ include file="compara.jsp"%>
	
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	<script src="js/classie.js"></script>
	<script src="js/cbpAnimatedHeader.js"></script>
	<script src="js/freelancer.js"></script>
	<script src="jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="http://maps.googleapis.com/maps/api/js?libraries=places&sensor=false"></script>
	
		<script>
	  	   function selectMode(id, value){
		    $("#"+id).change(function(event){
		      $("option:selected", $(this)).each(function(){
		         var obj = document.getElementById(id).value;
		    
		      if(obj != value){
		        $("#"+id).removeClass("disable").addClass("enable");
		      }else{
		        $("#"+id).removeClass("enable").addClass("disable");
		      }
		      });
		    });
		  }
	  	 	   
	  	 $(window).load(function() {
				$('#modal-compara').modal('show');
		 });
	  	 
	  	 $(function(){
	  		selectMode('select_estado', 'x');
	  		selectMode('select_estado-ideal', 'x');
	  		selectMode('modalidade', 'x');
	  		addLink();
	  	 });
	  	 
	  	 function addEvento(link){
	  		if($("."+link+"-body").css('display') == 'none'){
  				$("."+link).append("<span class=\"glyphicon glyphicon-chevron-down "+link+"-span\"></span>");
  			}
	
	  		$("."+link).click(function(event){
	  			if($("."+link+"-body").css('display') == 'none'){
	  				$("."+link).append("<span class=\"glyphicon glyphicon-chevron-down "+link+"-span\"></span>");
	  			}else{
	  				$("."+link+"-span").remove();
	  			}
  			});
	  	 }
	  	 
	  	 function addLink(){
	  		 var array = ["c-modalidade", "c-acesso", "c-infra", "c-sala", "c-lab", "c-recreacao", "c-sanitarios", "c-servicos"];
	  		 
	  		 for(var i=0; i < array.length; i++){
	  			addEvento(array[i]);
	  		 }
	  	 }
	</script>
	 <script>
	 
	 	$(".modal-busca-especifica").click(function(event){
	 		$("#modal-compara").modal('hide');
	 		$("#modal-busca-especifica").modal("show");
	 	});
	 	
	 	$(".modal-busca-ideal").click(function(event){
	 		$("#modal-compara").modal('hide');
	 		$("#modal-busca-ideal").modal("show");
	 	});
	 	
   		 function exibir(conteudo){
			if($("."+conteudo).css('display') == 'none'){
				$("."+conteudo).css('display', 'block');
			}else{
				$("."+conteudo).css('display', 'none');
			}
		}
		$(".y").append("<span class=\"glyphicon glyphicon-ok\"></span>");
		$(".n").append("<span class=\"glyphicon glyphicon-remove\"></span>");
	</script>
</body>
</html>
