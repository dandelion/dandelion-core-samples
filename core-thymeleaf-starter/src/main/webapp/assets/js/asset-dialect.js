$(document).ready(function(){
	$('#msg')
		.html('<h3>Hey! This awesome animation comes from the asset loaded by the "bundle-using-dialect" bundle, which has been included thanks to the Thymeleaf dialect</h3>')
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000);
});