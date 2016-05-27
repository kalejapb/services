<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../resources/css/jquery-ui.css" rel="stylesheet">
<link href="../resources/css/skeleton.css" rel="stylesheet">

<style>
body {
	margin: 50px;
	background: url("../resources/css/images/Fondo.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	width: 100%;
	height: 100%;
	background-size: cover;
	width: 100%;
}
</style>


<script type="text/javascript" src="../resources/js/jquery.js"></script>
<script type="text/javascript" src="../resources/js/jquery-ui.js"></script>
<script type="text/javascript" src="../resources/js/profile.js"></script>
<script>
	!function(d, s, id) {
		var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/
				.test(d.location) ? 'http' : 'https';
		if (!d.getElementById(id)) {
			js = d.createElement(s);
			js.id = id;
			js.src = p + "://platform.twitter.com/widgets.js";
			fjs.parentNode.insertBefore(js, fjs);
		}
	}(document, "script", "twitter-wjs");
</script>

<title>.: ZEMOGA WEB PROFILE - Alejandra Prieto :.</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="four columns">
				<div class="row">
					<div class="twelve columns" align="center">
						<img id="profilePhoto" alt="Profile photo" src="" style="">
						<br>
					</div>
				</div>
				<div class="row">
					<div class="twelve columns" id="tweets"></div>
				</div>
			</div>
			<div class="eight columns">
				<h2 id="userName"></h2>
				<br>
				<div id="description"></div>
			</div>
		</div>
	</div>



</body>
</html>