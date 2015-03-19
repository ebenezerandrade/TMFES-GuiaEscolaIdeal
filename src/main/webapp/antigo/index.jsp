<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Guia da Escola Ideal</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/freelancer.css" rel="stylesheet" type="text/css">

    <!-- Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>

    <!-- IE8 support for HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
 	


</head>

<%@ include file="navbar.jsp" %> 
<%@ include file="guia.jsp" %> 
<%@ include file="newhome.jsp" %> 
<%@ include file="newbusca.jsp" %> 
<%@ include file="newfaq.jsp" %> 
<%@ include file="newquemsomos.jsp" %> 
<%@ include file="newcontato.jsp" %> 
<%@ include file="rodape.jsp" %> 
<%@ include file="newbuscaespecifica.jsp" %> 

<!-- Portfolio Modal 1 -->

 
    <!-- Portifolio modal2 -->

    <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Pesquisar Escola Ideal</h2>
                            <hr class="star-primary">
                                                    <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <form role="form" action="#portifolioModal3">
                                    <div class="row">
                                        <div class="form-group col-xs-12">
                                            <label for="Modalidade de Ensino">Modalidade de Ensino</label>
                                            <select id="modalidade" class="disable form-control" type="text" name="name">
                                            	<option value="x" disabled selected>Selecione a modaliade de Ensino</option>
                                            	<option value="0">Ensino Regular</option>
                                            	<option value="0">Educa��o Especial</option>
                                            	<option value="0">EJA - Educação de Jovens e Adultos</option>
                                            </select> 
                                        </div>
                                    </div>
                             		<div class="row">
                                        <div class="form-group col-xs-12 ">
                                            <label for="Estado">Estado</label>
                                            <select id="select_estado" class="disable form-control" type="text" name="name">
                                                <option value="x" disabled selected>Selecione o Estado</option>
                                                <option value="0">Distrito Federal</option>
                                                <option value="0">Goiás</option>
                                                <option value="0">Mato Grosso</option>
                                                <option value="0">Mato Grosso do Sul</option>
                                            </select>
                                        </div>
                                    </div>
                                	 <div class="row">
                                        <div class="form-group col-xs-12">
                                            <label for="municipio">Município</label>
                                            <input class="form-control" type="email" name="email" placeholder="Insira o Município">
                                        </div>
                                    </div>

                                    <div class="form-group col-xs-12 ">
	                                    <div class="row">
	                                    	<fieldset>
	                                        <label >Laboratório de Informática:</label>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp; &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label>   
	                                   
	                                        <label>Laboratório de Ciências:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp;  &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label>   
	                                    	
	                                    	<br>

	                                        <label >Vias de Acessibilidade:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp;  &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label>   
	                                 
	                                        <br>

	                                        <label >Acesso a Internet:</label>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp;  &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label>   
	                                    	
	                                    	<br>

	                                        <label >Quadra de Esportes Coberta:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp;  &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label>   
	                                    
	                                        <br>

	                                        <label >Quadra de Esportes Descoberta:</label>&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp; &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label>   
	                                   		
	                                        <br>

	             							<label >Alojamento:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" name="labinf" value="sim">Sim</label>  &nbsp;  &nbsp;  <label><input type="radio" name="labinf" value="não">Não</label> 
	             							</fieldset>  
	                                    </div>
	                                </div>
                                <br></br>
                                <br></br>
                                <br></br>
                                <br></br>

                                <div class="row">
                                    <div class="form-group col-xs-12 floating-label-form-group">
                                    <button type="button" class="btn btn-lg btn-success">Buscar Escola</button>
                                    </div>
                                </div> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Portifolio-modal3 -->

    <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                            <h2>Resultado</h2>
                            <hr class="star-primary">
                        </div>
                        <div class="row">
                            <div class="col-lg-8 col-lg-offset-2">
                                <div class="container">
                                    <div class="page_navigation"></div>
                                        <div class="content"> 
                                            <c:forEach var="escolar" items="${listaescola}">
                                                <div class="escola">
                                                    Nome:<a href="#" onclick="window.open(id=${escolar.codEscola}', 'Pagina', 'STATUS=NO, TOOLBAR=NO, LOCATION=NO, DIRECTORIES=NO, RESISABLE=NO, SCROLLBARS=YES, TOP=10, LEFT=10, WIDTH=660, HEIGHT=400');">${escolar.nomeEscola}</a><br> 
                                                
                                                    Bairro: ${escolar.endereco.bairro}<br> 
                                                    E-Mail:${escolar.email}<br>
                                                    Telefone:(${escolar.endereco.municipio.codigoDDD})${escolar.telefone.telefone}
                                                </div>
                                            </c:forEach>
                                        </div>
                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        

    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/cbpAnimatedHeader.js"></script>
    <script src="js/freelancer.js"></script>
    <script src="jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>


    <script type="text/javascript">
    	$(function(){
  		$("#select_estado").change(function(event){
  		$("option:selected", $(this)).each(function(){
  		var obj = document.getElementById('select_estado').value;
  			if(obj != "x"){
  				$("#select_estado").removeClass("disable").addClass("enable");
  			}else{
  				$("#select_estado").removeClass("enable").addClass("disable");
  			}
  			});
  		});
  		});
    </script>


    <script type="text/javascript">
    	$(function(){
  		$("#modalidade").change(function(event){
  		$("option:selected", $(this)).each(function(){
  		var obj = document.getElementById('modalidade').value;
  			if(obj != "x"){
  				$("#modalidade").removeClass("disable").addClass("enable");
  			}else{
  				$("#modalidade").removeClass("enable").addClass("disable");
  			}
  			});
  		});
  		});
    </script>

</body>

</html>
