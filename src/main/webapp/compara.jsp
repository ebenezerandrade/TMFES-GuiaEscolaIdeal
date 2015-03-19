<div class="portfolio-modal modal fade" id="modal-compara" tabindex="-3"
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
						<h2>Comparação entre as escolas selecionadas</h2>
						<hr class="star-primary">
					</div>
					<div class="categorias col-xs-12 col-md-10 col-md-offset-1">
						<!-- Inicio cabecalho-->
						<div class="cabecalho col-xs-12">
							<form action="removePerfilServlet.jsp" method="post">
								<div class="col-xs-12 col-sm-6 col-md-6">
									<c:if test="${compara.escolaA == null}">
										<%@ include file="barra-pesquisa.jsp"%>
									</c:if>
									<c:if test="${compara.escolaA != null}">
										<div class="col-xs-10 dado-nome">
											${compara.escolaA.nomeEscola}</div>
										<div class="col-xs-2 dado-botao">
											<button class="btn btn-danger" type="submit" name="id"
												value="${compara.escolaA.codEscola}">
												<span class="glyphicon glyphicon-remove"
													style="color: white"> </span>
											</button>
										</div>
									</c:if>
								</div>
								<div class="col-xs-12 col-sm-6 col-md-6 col-2">
									<c:if test="${compara.escolaB == null}">
										<%@ include file="barra-pesquisa.jsp"%>
									</c:if>
									<c:if test="${compara.escolaB != null}">
										<div class="col-xs-10 dado-nome">
											${compara.escolaB.nomeEscola}</div>
										<div class="col-xs-2 dado-botao">
											<button class="btn btn-danger" type="submit" name="id"
												value="${compara.escolaB.codEscola}">
												<span class="glyphicon glyphicon-remove"
													style="color: white"></span>
											</button>
										</div>
									</c:if>
								</div>
							</form>
						</div>
						<hr>
						<!--  fim cabecalho-->
						<!-- inicio -->
						<div class="categoria col-xs-12">

							<div class="categoria-title col-xs-12">
								<a href="#">Endereço</a>
							</div>

							<div class="categoria-body">
								<div class="col-xs-6">
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Rua:</b> ${compara.escolaA.endereco.rua}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Número:</b> ${compara.escolaA.endereco.numero}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Complemento:</b> ${compara.escolaA.endereco.complemento}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Bairro:</b> ${compara.escolaA.endereco.bairro}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Município:</b> ${compara.escolaA.endereco.municipio.nome}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>CEP:</b> ${compara.escolaA.endereco.cep}
									</div>

								</div>
								<div class="col-xs-6 col-2">
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Rua:</b> ${compara.escolaB.endereco.rua}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Número:</b> ${compara.escolaB.endereco.numero}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Complemento:</b> ${compara.escolaB.endereco.complemento}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Bairro:</b> ${compara.escolaB.endereco.bairro}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>Município:</b> ${compara.escolaB.endereco.municipio.nome}
									</div>
									<div class="categoria-dado col-xs-12 col-md-6">
										<b>CEP:</b> ${compara.escolaB.endereco.cep}
									</div>
								</div>
							</div>
						</div>
						<!-- fim -->
						<!-- inicio -->
						<div class="categoria col-xs-12">
							<div class="categoria-title col-xs-12">
								<a class="c-infra" href="#" onclick="exibir('c-infra-body')">
									Infra-Estrutura </a>
							</div>
							<div class="categoria-body c-infra-body">
								<div class="col-xs-6">
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Cozinha</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.cozinha?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Berçário</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.bercario?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Secretaria</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.secretaria?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Dispensa</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.despensa?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Auditório</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.auditorio?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Lavanderia</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.lavanderia?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Refeitório</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.refeitorio?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Almoxarifado</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.almoxarifado?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Chuveiro</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.banheiroChuveiro?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Alojamento para Alunos</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.alojamentoAluno?'y':'n'}"></div>
									</div>
								</div>
								<div class="col-xs-6 col-2">
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Cozinha</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.cozinha?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Berçário</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.bercario?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Secretaria</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.secretaria?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Dispensa</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.despensa?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Auditório</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.auditorio?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Lavanderia</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.lavanderia?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Refeitório</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.refeitorio?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Almoxarifado</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.almoxarifado?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Chuveiro</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.banheiroChuveiro?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Alojamento para Alunos</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.alojamentoAluno?'y':'n'}"></div>
									</div>
								</div>
							</div>
						</div>
						<!--  -->
						<!-- A -->
						<div class="categoria col-xs-12">
							<div class="categoria-title col-xs-12">
								<a class="c-sala" href="#" onclick="exibir('c-sala-body')">
									Salas </a>
							</div>
							<div class="categoria-body c-sala-body">
								<div class="col-xs-6">
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Leitura</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.salaLeitura?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Atendimento
											Especializado</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.salaAtendimentoEspecializado?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Professor</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.salaProfessor?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Diretoria</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.salaDiretoria?'y':'n'}"></div>
									</div>
								</div>
								<div class="col-xs-6 col-2">
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Leitura</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.salaLeitura?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Atendimento
											Especializado</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.salaAtendimentoEspecializado?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Professor</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.salaProfessor?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-sm-6 col-md-6">
										<div class="dado col-xs-9">Sala de Diretoria</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.salaDiretoria?'y':'n'}"></div>
									</div>
								</div>
							</div>
						</div>
						<!--  -->
						<!-- B -->
						<div class="categoria col-xs-12">
							<div class="categoria-title col-xs-12">
								<a class="c-lab" href="#" onclick="exibir('c-lab-body')">
									Laboratórios </a>
							</div>
							<div class="categoria-body c-lab-body">
								<div class="col-xs-6">
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Laboratório de Informática</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.labInformatica?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Laboratório de Ciências</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.labCiencias?'y':'n'}"></div>
									</div>
								</div>
								<div class="col-xs-6 col-2">
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Laboratório de Informática</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.labInformatica?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Laboratório de Ciências</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.labCiencias?'y':'n'}"></div>
									</div>
								</div>
							</div>
						</div>

						<div class="categoria col-xs-12">
							<div class="categoria-title col-xs-12">
								<a class="c-recreacao" href="#"
									onclick="exibir('c-recreacao-body')"> Recreação </a>
							</div>
							<div class="categoria-body c-recreacao-body">
								<div class="col-xs-6">
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Quadra de Esportes Coberta</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.quadraEsporteCoberta?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Quadra de Esportes Descoberta</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.quadraEsporteDescoberta?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Pátio Coberto</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.patioCoberto?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Pátio Descoberto</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.patioDescoberto?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Parque Infantil</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaA.parqueInfantil?'y':'n'}"></div>
									</div>
								</div>
								<div class="col-xs-6 col-2">
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Quadra de Esportes Coberta</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.quadraEsporteCoberta?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Quadra de Esportes Descoberta</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.quadraEsporteDescoberta?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Pátio Coberto</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.patioCoberto?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Pátio Descoberto</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.patioDescoberto?'y':'n'}"></div>
									</div>
									<div class="categoria-dado col-xs-12 col-md-6 col-sm-6">
										<div class="dado col-xs-9">Parque Infantil</div>
										<div
											class="dado-valor col-xs-3 ${compara.escolaB.parqueInfantil?'y':'n'}"></div>
									</div>
								</div>
							</div>
						</div>
						<!--  -->
					</div>
				</div>
			</div>
		</div>
	</div>
</div>