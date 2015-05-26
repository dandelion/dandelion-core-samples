$(document).ready(function(){
	$('#msg')
		.html('<h3 class="alert alert-success">Hey! <br/> This awesome animation comes from the asset loaded by the "app" bundle.<br />The version of this asset is exactly the same as the one in the pom.xml file!<br />Take a look at the <code>src/main/resources/dandelion/dandelion.properties</code> file!</h3>')
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000)
		.fadeOut(1000)
		.fadeIn(1000);
});