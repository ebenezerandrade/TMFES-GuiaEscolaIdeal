<!-- Código criado a partir da demo https://github.com/wesnolte/Pajinate-->
	
	<section class="conteudo" id="busca">
	
	 <br>
	 <br>
	 <br>
	 <br>
	 
	 
	  
	        <div class="container">
			<div class="page_navigation"></div>
			 <div class="content"> 
				<c:forEach var="escolar" items="${listaescola}">
					<div class="escola">
						Nome:<a href="#" onclick="window.open('pegarEscola.jsp?id=${escolar.codEscola}', 'Pagina', 'STATUS=NO, TOOLBAR=NO, LOCATION=NO, DIRECTORIES=NO, RESISABLE=NO, SCROLLBARS=YES, TOP=10, LEFT=10, WIDTH=660, HEIGHT=400');">${escolar.nomeEscola}</a><br> 
						Bairro: ${escolar.endereco.bairro}<br> 
						E-Mail:${escolar.email}<br>
						Telefone:(${escolar.endereco.municipio.codigoDDD})${escolar.telefone.telefone}
					</div>
				</c:forEach>
			</div>
		</div>
		<a href="index.jsp"><div class="voltar"></div></a>
		
		
		
	</section>

