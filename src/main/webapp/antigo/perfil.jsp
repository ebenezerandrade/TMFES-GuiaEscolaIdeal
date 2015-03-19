<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script language="JavaScript">
	function jumpScroll(){
		window.scroll(1600,0);
	}
</script>

<meta charset="UTF-8">
<title>Guia da Escola Ideal</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<link type="text/css" rel="stylesheet" href="css/paginacao.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript">
		$(function() {
			$('ul li a').bind('click',function(event){
				var $anchor = $(this);
				/*
				if you want to use one of the easing effects:
				$('html, body').stop().animate({
					scrollLeft: $($anchor.attr('href')).offset().left
				}, 1500,'easeInOutExpo');
				 */
				$('html, body').stop().animate({
					scrollLeft: $($anchor.attr('href')).offset().left
				}, 1000);
				event.preventDefault();
			});
		})
    </script>
<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery.pajinate.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.1.1/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#busca').pajinate({
			items_per_page : 2,
			num_page_links_to_display : 10,
			abort_on_small_lists : true,
		});
	});
</script>

<script type="text/javascript">
$(window).load(function() {
	$(".loader").fadeOut("slow");
})

</script>

<script type="text/javascript">

$(document).ready(function(){
    $('#table_id td.y_n').each(function(){
        if ($(this).text() == 'false') {
            $(this).css('background-color','red');
        }
    });
});

$(document).ready(function(){
    $('#table_id td.y_n').each(function(){
        if ($(this).text() == 'true') {
            $(this).css('background-color','green');
        }
    });
});

</script>



</head>

<div class="loader"></div>
 
<%@ include file="click.jsp" %> 


</body>
</html>