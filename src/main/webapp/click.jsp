<!-- pesquisa especifica -->

<div class="portfolio-modal modal fade" id="modal-perfil" tabindex="-1"
	role="dialog" aria-hidden="true">
	<div class="modal-content">
		<div class="close-modal" data-dismiss="modal">
			<div class="lr">
				<div class="rl"></div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="modal-body">
						<h2>Pesquisar Escola Específica</h2>
						<hr class="star-primary">
					</div>
					<div class="row">
						<div class="col-xs-12">
							<p>Nome:${escola.nomeEscola}
							<a href="computaVotos.jsp?id=${escola.codEscola}" class="btn btn-default btn-primary"><span class="glyphicon glyphicon-thumbs-up"></span> ${escola.quantidadeVotos}</a> </p>
								<form action="addPerfilServlet.jsp" method="post">
									<button type="submit" name="id" value="${escola.codEscola}" class="btn btn-success">Comparação entre as escolas selecionadas</button>
								</form>
							
							<hr>
							<div class="categorias col-xs-12 col-md-10 col-md-offset-1">
								<div class="categoria col-xs-12">
									<!-- Para que o mapa seja exibido em uma página da Web, devemos reservar um espaço para ele fazemos isso criando um
	elemento div nomeado e obtendo uma referência para esse elemento no modelo de objeto de documento (DOM) do navegador.-->
									<div class="categoria-title col-xs-12">
										<a href="#">Endereço</a>
									</div>
									<div class="categoria-body">
										<div class="categoria-dado col-xs-12 col-md-6">
											<b>Rua:</b> ${escola.endereco.rua}
										</div>
										<div class="categoria-dado col-xs-12 col-md-6">
											<b>Número:</b> ${escola.endereco.numero}
										</div>
										<div class="categoria-dado col-xs-12 col-md-6">
											<b>Complemento:</b> ${escola.endereco.complemento}
										</div>
										<div class="categoria-dado col-xs-12 col-md-6">
											<b>Bairro:</b> ${escola.endereco.bairro}
										</div>
										<div class="categoria-dado col-xs-12 col-md-6">
											<b>Município:</b> ${escola.endereco.municipio.nome}
										</div>
										<div class="categoria-dado col-xs-12 col-md-6">
											<b>CEP:</b> ${escola.endereco.cep}
										</div>
									</div>
								</div>
								<div class="categoria col-xs-12">
									<a class="c-modalidade categoria-title col-xs-12" href="#"
										onclick="exibir('c-modalidade-body')"> Modalidade </a>
									<div class="categoria-body c-modalidade-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sem Fins Lucrativos</div>
											<div
												class="dado-valor col-xs-2 ${escola.seFinsLucrativos?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Brasil Alfabetização</div>
											<div
												class="dado-valor col-xs-2 ${escola.brasilAlfabetizacao?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Educação Indígena</div>
											<div
												class="dado-valor col-xs-2 ${escola.educacaoIndigena?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-acesso" href="#" onclick="exibir('c-acesso-body')">
											Acesso </a>
									</div>
									<div class="categoria-body c-acesso-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Depende de Vias de Acesso</div>
											<div
												class="dado-valor col-xs-2 ${escola.dependViasAcesso?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Acessibilidade</div>
											<div
												class="dado-valor col-xs-2 ${escola.acessibilidade?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-infra" href="#" onclick="exibir('c-infra-body')">
											Infra-Estrutura </a>
									</div>
									<div class="categoria-body c-infra-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Cozinha</div>
											<div class="dado-valor col-xs-2 ${escola.cozinha?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Berçário</div>
											<div class="dado-valor col-xs-2 ${escola.bercario?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Secretaria</div>
											<div class="dado-valor col-xs-2 ${escola.secretaria?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Dispensa</div>
											<div class="dado-valor col-xs-2 ${escola.despensa?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Auditório</div>
											<div class="dado-valor col-xs-2 ${escola.auditorio?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Lavanderia</div>
											<div class="dado-valor col-xs-2 ${escola.lavanderia?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Refeitório</div>
											<div class="dado-valor col-xs-2 ${escola.refeitorio?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Almoxarifado</div>
											<div
												class="dado-valor col-xs-2 ${escola.almoxarifado?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Chuveiro</div>
											<div
												class="dado-valor col-xs-2 ${escola.banheiroChuveiro?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Alojamento para alunos</div>
											<div
												class="dado-valor col-xs-2 ${escola.alojamentoAluno?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-sala" href="#" onclick="exibir('c-sala-body')">
											Salas </a>
									</div>
									<div class="categoria-body c-sala-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sala de Leitura</div>
											<div
												class="dado-valor col-xs-2 ${escola.salaLeitura?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sala de Atendimento
												Especializado</div>
											<div
												class="dado-valor col-xs-2 ${escola.salaAtendimentoEspecializado?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sala de Professor</div>
											<div
												class="dado-valor col-xs-2 ${escola.salaProfessor?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sala de Diretoria</div>
											<div
												class="dado-valor col-xs-2 ${escola.salaDiretoria?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-lab" href="#" onclick="exibir('c-lab-body')">
											Laboratórios </a>
									</div>
									<div class="categoria-body c-lab-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Laboratório de Informática</div>
											<div
												class="dado-valor col-xs-2 ${escola.labInformatica?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Laboratório de Ciências</div>
											<div
												class="dado-valor col-xs-2 ${escola.labCiencias?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-recreacao" href="#"
											onclick="exibir('c-recreacao-body')"> Recreação </a>
									</div>
									<div class="categoria-body c-recreacao-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Quadra de Esportes Coberta</div>
											<div
												class="dado-valor col-xs-2 ${escola.quadraEsporteCoberta?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Quadra de Esportes
												Descoberta</div>
											<div
												class="dado-valor col-xs-2 ${escola.quadraEsporteDescoberta?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Pátio Coberto</div>
											<div
												class="dado-valor col-xs-2 ${escola.patioCoberto?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Pátio Descoberto</div>
											<div
												class="dado-valor col-xs-2 ${escola.patioDescoberto?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Parque Infantil</div>
											<div
												class="dado-valor col-xs-2 ${escola.parqueInfantil?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-sanitarios" href="#"
											onclick="exibir('c-sanitarios-body')"> Sanitários </a>
									</div>
									<div class="categoria-body c-sanitarios-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sanitário Adequado Infantil</div>
											<div
												class="dado-valor col-xs-2 ${escola.sanitarioAdequadoInfantil?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Sanitário Fora do Prédio</div>
											<div
												class="dado-valor col-xs-2 ${escola.sanitarioForaPredio?'y':'n'}"></div>
										</div>
									</div>
								</div>

								<div class="categoria col-xs-12">
									<div class="categoria-title col-xs-12">
										<a class="c-servicos" href="#"
											onclick="exibir('c-servicos-body')"> Serviços </a>
									</div>
									<div class="categoria-body c-servicos-body">
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Agua Filtrada</div>
											<div
												class="dado-valor col-xs-2 ${escola.aguaFiltrada?'y':'n'}"></div>
										</div>
										<div class="categoria-dado col-xs-12 col-md-4 col-sm-6">
											<div class="dado col-xs-10">Internet</div>
											<div class="dado-valor col-xs-2 ${escola.internet?'y':'n'}"></div>
										</div>
									</div>
								</div>
								<%@ include file="localizarEscola.jsp"%>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>


