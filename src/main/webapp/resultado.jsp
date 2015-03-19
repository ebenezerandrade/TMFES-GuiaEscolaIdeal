<!-- pesquisa especifica -->

<div class="portfolio-modal modal fade" id="modal-resultado"
	tabindex="-1" role="dialog" aria-hidden="true">
	<div class="modal-content">
		<div class="close-modal" data-dismiss="modal">
			<div class="lr">
				<div class="rl"></div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<div class="modal-body">
						<h2>Resultado</h2>
						<hr class="star-primary">
					</div>					
						<table id="resultado" class="table table-striped table-bordered" cellspacing="0">
								<thead>
            						<tr>
                						<th>Nome</th>
                						<th>Bairro</th>
             	   						<th>Telefone</th>
            						</tr>
        						</thead>
 
        						<tfoot>
            						<tr>
                						<th>Nome</th>
                						<th>Bairro</th>
                						<th>Telefone</th>
            						</tr>
        						</tfoot>
        						 <tbody>	
									<c:forEach var="escolar" items="${listaescola}">
										<tr>
											<td><a href="pegarEscola.jsp?id=${escolar.codEscola}">${escolar.nomeEscola}</a></td> 
											<td>${escolar.endereco.bairro}</td> 
											<td>(${escolar.endereco.municipio.codigoDDD})${escolar.telefone.telefone}</td>
										</tr>
								</c:forEach>
								 <tbody>
								</table>
					
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

