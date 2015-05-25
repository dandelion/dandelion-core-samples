$(document).ready(function(){
	$('#msg')
		.html('<h3>Hey! This awesome animation comes from the asset loaded by the "bundle-using-api" bundle, which has been programmatically included</h3>')
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000);
});