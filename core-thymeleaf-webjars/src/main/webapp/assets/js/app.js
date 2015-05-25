$(document).ready(function(){
	$('#msg')
		.html('<h3 class="alert alert-success">Hey! <br/> This awesome animation comes from the asset loaded by the "app" bundle, which uses the jQuery Webjar as a dependency!</h3>')
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000);
});