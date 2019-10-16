$(document).ready(function(){
	$('.data').mask('00/00/0000');
	$('.monetario').mask('000.000.000.000.000,00', {reverse: true});
	$('.datepicker').datepicker();
	$('h:selectOneMenu').formSelect();
});

