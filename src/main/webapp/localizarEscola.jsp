<div class="categoria col-xs-12">
	<!-- Para que o mapa seja exibido em uma página da Web, devemos reservar um espaço para ele fazemos isso criando um
	elemento div nomeado e obtendo uma referência para esse elemento no modelo de objeto de documento (DOM) do navegador.-->
	<div class="categoria-title col-xs-12">
		<a href="#">Mapa</a>
	</div>
	<div class="categoria-body">
		<div id="map_canvas" class="col-xs-12 col-md-6 mapa"></div>
		<div class="col-xs-12 col-md-6">
			<button id="botao-caminho" class="btn btn-primary caminho-botao" style="margin-top:15px;"
				data-toggle="modal" data-target="#caminho">trajeto</button>

			<div class="modal fade" id="caminho">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title">Trajeto</h4>
						</div>
						<div class="modal-body" id="info-mapa"></div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
			<!-- /.modal -->
		</div>
	</div>
</div>