$(document).ready(function(){
	$('#msg')
		.html('<h3>Hey! This awesome animation comes from the asset loaded by the "bundle-using-taglib" bundle, which has been included thanks to the JSP taglib</h3>')
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000);
});