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
	background-position: center; background-size : cover; width : 100%;
	height: 100%;
	background-size: cover;
	width: 100%;
}
</style>


<script type="text/javascript" src="../resources/js/jquery.js"></script>
<script type="text/javascript" src="../resources/js/jquery-ui.js"></script>
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

<title>.: ZEMOGA WEB PROFILE :.</title>
</head>
<body>

	<div class="container">

		<!-- columns should be the immediate child of a .row -->
		<div class="row">
			<div class="four columns">
				<div class="row">
					<div class="twelve columns" align="center">
						<img alt="Profile photo"
							src="../resources/css/images/profilephoto.jpg" style=""> <br>
					</div>
				</div>
				<div class="row">
					<div class="twelve columns">
						<a class="twitter-timeline" data-dnt="true"
							href="https://twitter.com/kalejapb"
							data-widget-id="736058472769294336">Tweets por el @kalejapb.</a>
						<script>
							!function(d, s, id) {
								var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/
										.test(d.location) ? 'http' : 'https';
								if (!d.getElementById(id)) {
									js = d.createElement(s);
									js.id = id;
									js.src = p
											+ "://platform.twitter.com/widgets.js";
									fjs.parentNode.insertBefore(js, fjs);
								}
							}(document, "script", "twitter-wjs");
						</script>

					</div>
				</div>
			</div>
			<div class="eight columns">
				<h2> Alejandra Prieto </h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
					enim ad minim veniam, quis nostrud exercitation ullamco laboris
					nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
				<br>
				<p>Sed ut perspiciatis unde omnis iste natus error sit
					voluptatem accusantium doloremque laudantium, totam rem aperiam,
					eaque ipsa quae ab illo inventore veritatis et quasi architecto
					beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia
					voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur
					magni dolores eos qui ratione voluptatem sequi nesciunt. Neque
					porro quisquam est, qui dolorem ipsum quia dolor sit amet,
					consectetur, adipisci velit, sed quia non numquam eius modi tempora
					incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut
					enim ad minima veniam, quis nostrum exercitationem ullam corporis
					suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur?
					Quis autem vel eum iure reprehenderit qui in ea voluptate velit
					esse quam nihil molestiae consequatur, vel illum qui dolorem eum
					fugiat quo voluptas nulla pariatur?</p>
			</div>
		</div>
	</div>



</body>
</html>