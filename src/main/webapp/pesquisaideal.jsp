
<!-- pesquisa especifica -->

<div class="portfolio-modal modal fade" id="modal-busca-ideal"
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
						<h2>Pesquisar Escola Ideal</h2>
						<hr class="star-primary">
						<div class="row">
							<div class="col-lg-8 col-lg-offset-2">
								<form role="form" action="realizarConsultaEscolaIdeal.jsp" method="post" name="form1" id="ideal">
									<div class="row">
										<div class="form-group col-xs-12">
											<label for="Modalidade de Ensino">Modalidade de
												Ensino</label> <select id="modalidade" class="disable form-control"
												type="text" name="modalidade">
												<option value="x" disabled selected>Selecione a
													modalidade de Ensino</option>
												<option value="Ensino Regular">Ensino Regular</option>
												<option value="Educacao Especial">Educação Especial</option>
												<option value="Educacao de Jovens E">EJA - Educação
													de Jovens e Adultos</option>
											</select>
										</div>
									</div>
									<div class="row">
										<div class="form-group col-xs-12 ">
											<label for="Estado">Estado</label>
											<select
												id="select_estado-ideal" class="disable form-control"
												type="text" name="estado">
												<option value="x" disabled selected>Selecione o
													Estado</option>
												<option value="Distrito Federal">Distrito Federal</option>
												<option value="Goias">Goiás</option>
												<option value="Mato Grosso">Mato Grosso</option>
												<option value="Mato Grosso do Sul">Mato Grosso do
													Sul</option>
											</select>
										</div>
									</div>
									<div class="row">
										<div class="form-group col-xs-12">
											<label for="municipio">Município</label> <input
												class="form-control" type="text" name="municipio" id="municipio"
												placeholder="Insira o Município">
										</div>
									</div>

									<div class="form-group col-xs-12 ">
										<div class="row">
											<fieldset>
												<table width="878" border="0">
													<tr>
														<th colspan="2" scope="col">Modalidade</th>
													</tr>
													<tr>
														<td width="286">Instituicao sem fim lucrativo</td>
														<td width="582"><input type="radio"
															name="fimlucrativo" id="labinf13" value="sim" /> Sim <input type="radio"
																name="fimlucrativo" id="labinf14" value="n&atilde;o" />
																N&atilde;o <input name="fimlucrativo" type="radio"
																id="radio7" checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Brasil Alfabetiza&ccedil;&atilde;o</td>
														<td><input type="radio" name="brasilalfabet"
															id="labinf15" value="sim" /> Sim
																<input type="radio" name="brasilalfabet" id="labinf16"
																value="n&atilde;o" /> N&atilde;o <input name="brasilalfabet"
																type="radio" id="radio8" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Educa&ccedil;&atilde;o Ind&iacute;gena</td>
														<td><input type="radio" name="indigena" id="labinf17"
															value="sim" /> Sim <input
																type="radio" name="indigena" id="labinf18" value="n&atilde;o" />
																N&atilde;o <input name="indigena" type="radio"
																id="radio9" checked="checked" value="" /> 
																Tanto Faz</td>
													</tr>
												</table>
											  <p>&nbsp;</p>
												<table width="878" border="0">
													<tr>
														<th colspan="2" scope="col">Salas</th>
													</tr>
													<tr>
														<td width="286">Sala de leitura</td>
														<td width="582"><input type="radio"
															name="salaleitura" id="labinf21" value="sim" /> Sim <input type="radio"
																name="salaleitura" id="labinf22" value="n&atilde;o" />
																N&atilde;o <input name="salaleitura" type="radio"
																id="radio11" checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Sala de Atendimento Especializado</td>
														<td><input type="radio"
															name="salaatendimentoespecial" id="labinf23" value="sim" />
															Sim <input type="radio"
																name="salaatendimentoespecial" id="labinf24" value="n&atilde;o" />
															  N&atilde;o <input name="salaatendimentoespecial"
																type="radio" id="radio12" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Sala Professor</td>
														<td><input type="radio" name="salaprofessor"
															id="labinf25" value="sim" /> Sim
														  <input type="radio" name="salaprofessor" id="labinf26"
																value="n&atilde;o" /> N&atilde;o <input name="salaprofessor"
																type="radio" id="radio13" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Sala Diretoria</td>
														<td><input type="radio" name="saladiretoria"
															id="labinf27" value="sim" /> Sim
														  <input type="radio" name="saladiretoria" id="labinf28"
																value="n&atilde;o" /> N&atilde;o <input name="saladiretoria"
																type="radio" id="radio14" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
												</table>
												<p>&nbsp;</p>
												<table width="878" border="0">
													<tr>
														<th colspan="2" scope="col">Laborat&oacute;rios</th>
													</tr>
													<tr>
														<td width="286">Laborat&oacute;rio de
															Inform&aacute;tica</td>
														<td width="582"><input type="radio" name="labinf"
															id="labinf5" value="sim" /> Sim
														  <input type="radio" name="labinf" id="labinf6"
																value="n&atilde;o" /> N&atilde;o <input name="labinf"
																type="radio" id="radio3" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Laborat&oacute;rio de Ci&ecirc;ncias</td>
														<td><input type="radio" name="labcien" id="labinf"
															value="sim" /> Sim <input
																type="radio" name="labcien" id="labinf2" value="n&atilde;o" />
																N&atilde;o <input name="labcien" type="radio" id="radio"
																checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
												</table>
												<p>&nbsp;</p>
												<table width="878" border="0">
													<tr>
														<th colspan="2" scope="col">Sanit&aacute;rios</th>
													</tr>
													<tr>
														<td width="286">Sanit&aacute;rio Adequado Infantil</td>
														<td width="582"><input type="radio"
															name="sanitarioinfantil" id="labinf3" value="sim" /> Sim <input type="radio"
																name="sanitarioinfantil" id="labinf4" value="n&atilde;o" />
																N&atilde;o <input name="sanitarioinfantil" type="radio"
																id="radio2" checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Sanit&aacute;rio fora do pr&eacute;dio</td>
														<td><input type="radio" name="sanitarioforapredio"
															id="labinf7" value="sim" /> Sim
																<input type="radio" name="sanitarioforapredio"
																id="labinf8" value="n&atilde;o" /> N&atilde;o <input
																name="sanitarioforapredio" type="radio" id="radio4"
																checked="checked" value="" /> 
																Tanto Faz</td>
													</tr>
												</table>
												<p>&nbsp;</p>
												<table width="878" border="0">
												  <tr>
												    <th colspan="2" scope="col">Recrea&ccedil;&atilde;o</th>
											      </tr>
												  <tr>
												    <td>Quadra Coberta</td>
												    <td><input type="radio" name="quadra_coberta" id="labinf53"
															value="sim" />
												      Sim
												        <input
																type="radio" name="quadra_coberta" id="labinf54" value="n&atilde;o" />
												        N&atilde;o
												        <input name="quadra_coberta" type="radio"
																id="radio27" checked="checked" value="" />
												        Tanto Faz </td>
											      </tr>
												  <tr>
												    <td>Quadra Descoberta</td>
												    <td><input type="radio" name="quadra_descoberta" id="labinf37"
															value="sim" />
												      Sim
												        <input
																type="radio" name="quadra_descoberta" id="labinf38" value="n&atilde;o" />
												        N&atilde;o
												        <input name="quadra_descoberta" type="radio"
																id="radio19" checked="checked" value="" />
												        Tanto Faz </td>
											      </tr>
												  <tr>
												    <td width="286">Parque Infantil</td>
												    <td width="582"><input type="radio"
															name="parqueInfantil" id="labinf11" value="sim" />
												      Sim
												        <input type="radio"
																name="parqueInfantil" id="labinf12" value="n&atilde;o" />
												        N&atilde;o
												        <input name="parqueInfantil" type="radio"
																id="radio6" checked="checked" value="" />
												        Tanto Faz</td>
											      </tr>
												  <tr>
												    <td>Patio Descoberto</td>
												    <td><input type="radio" name="patioDescoberto"
															id="labinf55" value="sim" />
												      Sim
												        <input type="radio" name="patioDescoberto"
																id="labinf56" value="n&atilde;o" />
												        N&atilde;o
												        <input
																name="patioDescoberto" type="radio" id="radio28"
																checked="checked" value="" />
										            Tanto Faz </td>
											      </tr>
												  <tr>
												    <td>Patio Coberto</td>
												    <td><input type="radio" name="patioCoberto"
															id="labinf19" value="sim" />
												      Sim
												        <input type="radio" name="patioCoberto"
																id="labinf20" value="n&atilde;o" />
												        N&atilde;o
												        <input
																name="patioCoberto" type="radio" id="radio10"
																checked="checked" value="" />
												        Tanto Faz </td>
											      </tr>
											  </table>
                                                <p></p>
                                                <p>&nbsp;</p>
												<table width="878" border="0">
													<tr>
														<th colspan="2" scope="col">Infra-Estrutura</th>
													</tr>
													<tr>
													  <td>Acessibilidade</td>
													  <td><input type="radio" name="acessibilidade"
															id="labinf51" value="sim" />
													    Sim
													      <input type="radio" name="acessibilidade" id="labinf52"
																value="n&atilde;o" />
													      N&atilde;o
													      <input name="acessibilidade"
																type="radio" id="radio26" checked="checked" value="" />
													      Tanto Faz</td>
												  </tr>
													<tr>
														<td width="286">Cozinha</td>
														<td width="582"><input type="radio" name="cozinha"
															id="labinf9" value="sim" /> Sim
																<input type="radio" name="cozinha" id="labinf10"
																value="n&atilde;o" /> N&atilde;o <input name="cozinha"
																type="radio" id="radio5" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Refeit&oacute;rio</td>
														<td><input type="radio" name="refeitorio"
															id="labinf29" value="sim" /> Sim
																<input type="radio" name="refeitorio" id="labinf30"
																value="n&atilde;o" /> N&atilde;o <input name="refeitorio"
																type="radio" id="radio15" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Alojamento Aluno</td>
														<td><input type="radio" name="alojamentoAluno"
															id="labinf31" value="sim" /> Sim
																<input type="radio" name="alojamentoAluno" id="labinf32"
																value="n&atilde;o" /> N&atilde;o <input name="alojamentoAluno"
																type="radio" id="radio16" checked="checked" value="" />
																Tanto Faz</td>
													</tr>
													<tr>
														<td>Ber&ccedil;&aacute;rio</td>
														<td><input type="radio" name="bercario" id="labinf33"
															value="sim" /> Sim <input
																type="radio" name="bercario" id="labinf34" value="n&atilde;o" />
																N&atilde;o <input name="bercario" type="radio"
																id="radio17" checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Audit&oacute;rio</td>
														<td><input type="radio" name="auditorio"
															id="labinf35" value="sim" /> Sim
																<input type="radio" name="auditorio" id="labinf36"
																value="n&atilde;o" /> N&atilde;o <input name="auditorio"
																type="radio" id="radio18" checked="checked" value="" />
																Tanto Faz</td>
													</tr>
													<tr>
														<td>Secretaria</td>
														<td><input type="radio" name="secretaria"
															id="labinf39" value="sim" /> Sim
																<input type="radio" name="secretaria" id="labinf40"
																value="n&atilde;o" /> N&atilde;o <input name="secretaria"
																type="radio" id="radio20" checked="checked" value="" />
																Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Lavanderia</td>
														<td><input type="radio" name="lavanderia"
															id="labinf41" value="sim" /> Sim
																<input type="radio" name="lavanderia" id="labinf42"
																value="n&atilde;o" /> N&atilde;o <input name="lavanderia"
																type="radio" id="radio21" checked="checked" value="" />
																Tanto Faz</td>
													</tr>
													<tr>
														<td>Chuveiro</td>
														<td><input type="radio" name="chuveiro" id="labinf43"
															value="sim" /> Sim <input
																type="radio" name="chuveiro" id="labinf44" value="n&atilde;o" />
																N&atilde;o <input name="chuveiro" type="radio"
																id="radio22" checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
													<tr>
														<td>Internet</td>
														<td><input type="radio" name="internet" id="labinf45"
															value="sim" /> Sim <input
																type="radio" name="internet" id="labinf46" value="n&atilde;o" />
																N&atilde;o <input name="internet" type="radio"
																id="radio23" checked="checked" value="" /> Tanto Faz
														</td>
													</tr>
												</table>
	                      <p></p>
												<p></p>
												<p></p>
												<p>&nbsp;</p>
											</fieldset>
										</div>
									</div>
									<br></br> <br></br> <br></br> <br></br>

									<div class="form-group col-xs-12 floating-label-form-group">
										<div class="controls">
											<button id="button1id" name="button1id"
												class="btn btn-success" onclick="return validaIdeal()">Buscar Escola</button>

											<a href="#ajudaideal" class="portfolio-link"
												data-toggle="modal">
												<button id="button2id" name="button2id"
													class="btn btn-danger">Ajuda</button>
											</a>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="portfolio-modal modal fade" id="ajudaideal" tabindex="-1"
			role="dialog" aria-hidden="true">
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
								<h2>Ajuda para pesquisa ideal</h2>
								<hr class="star-primary">
							</div>
							<div class="row">
								<div class="col-lg-8 col-lg-offset-2">
									Esta pagina lhe explicará como deverá ser o preenchimento dos
									campos, se você está aqui é que sentiu alguma dificuldade ao
									preencher os campos de busca. Abaixo explicamos como deverá ser
									o preenchimento <br></br> <b>Campo Escola</b> <br></br> Este
									campo não aceita menos que três caracteres, não aceita
									caracteres especiais e não aceita somente números, ele deverá
									ser preenchido com o nome da escola desejada. <br></br> <b>Campo
										Estado</b> <br></br> Este campo já apresenta as opções para você
									realizar sua busca, ao clicar no campo apresentamos a você os
									estados do Centro-Oeste mais o Distrito Federal. <br></br> <b>Campo
										município</b> <br></br> Este campo não necessita ser preenchido
									caso a opção do campo estado seja Distrito Federal, se a opção
									for Goiás, Mato Grosso ou Mato Grosso do Sul o campo Município
									deverá ser preenchido, com intuito de refinar ainda mais sua
									busca. <br></br> <b>Características físicas</b> <br><br>
									Apresentamos a você várias característivas físicas para que
									você possa escolher de acordo com sua necessidade, cada
									característica possui uma opção de Sim ou Não ou Tanto Faz,
									basta escolher uma das tr&ecirc;s opções para cada
									característica e ao final clicar em buscar escola.
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>