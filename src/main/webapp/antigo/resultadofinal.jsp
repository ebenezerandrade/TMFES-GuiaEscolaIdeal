
	
	<section class="conteudo" id="busca">
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<table id="insured_list" class="tablesorter"> 
<thead> 
<tr> 
    <th>Nome</th> 
    <th>Bairro</th> 
    <th>Telefone</th> 
</tr> 
</thead> 
<tbody> 

<c:forEach var="escolar" items="${listaescola}">

	<tr>					
		<td>				<a href="#" onclick="window.open('pegarEscola.jsp?id=${escolar.codEscola}', 'Pagina', 'STATUS=NO, TOOLBAR=NO, LOCATION=NO, DIRECTORIES=NO, RESISABLE=NO, SCROLLBARS=YES, TOP=10, LEFT=10, WIDTH=660, HEIGHT=450');">${escolar.nomeEscola}</a> </td>
		<td>				 ${escolar.endereco.bairro}</td>
		<td>				(${escolar.endereco.municipio.codigoDDD})${escolar.telefone.telefone}</td>
						
	</tr>				
</c:forEach>

</tbody>
</table>

<div id="pager" class="pager">
	<form>
		<img src="img/first.png" class="first"/>
		<img src="img/prev.png" class="prev"/>
		<input type="text" class="pagedisplay"/>
		<img src="img/next.png" class="next"/>
		<img src="img/last.png" class="last"/>
		<select class="pagesize">
			<option value="10">10 por página</option>
			<option value="5">5 por página</option>
			
			
		</select>
	</form>
</div>
<script defer="defer">
	$(document).ready(function() 
    { 
        $("#insured_list")
		.tablesorter({widthFixed: true, widgets: ['zebra']})
		.tablesorterPager({container: $("#pager")}); 
    } 
	); 
</script>
		<a href="index.jsp"><div class="voltar"></div></a>
	</section>

