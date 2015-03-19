<section class="conteudo" id="busca">
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<table>
		<form name="form1" action="realizarConsultaEscolaEspecifica.jsp" method="post">
			<tr>
				<td>Nome da Escola:</td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td><select name="estado">
						<option value=""  >Escolha o Estado</option>
						<option value="Distrito Federal"  >Distrito Federal</option>
						<option value="Goias">Goiás</option>
						<option value="Mato Grosso">Mato Grosso</option>
						<option value="Mato Grosso do Sul">Mato Grosso do Sul</option>
				</select></td>
			</tr>
			<tr>
				<td>Município</td>
				<td><input type="text" name="municipio" /></td>
			</tr>
			<td>
				<td><td>
				<td><input type="submit" onclick="return validar()"/></td>
			</td>
		</form>
	</table>
	
	<%@ include file="pesquisarEscolaPorCep.jsp" %> 
	
	
</section>