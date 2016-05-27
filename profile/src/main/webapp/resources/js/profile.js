/**
 * This function is executed after all components are ready.
 */
$(document).on("ready", function() {
	getProfile();
});

/**
 * This function gets the user profile information
 */
function getProfile() {
	url = "http://localhost:8080/zemogaProfile/zemoga_portfolio_api/user_info";
	$.ajax({
		url : url,
		type : 'GET',
		dataType : 'json',
		success : function(response) {
			$("#profilePhoto").prop("src", response.imageUrl);
			$("#userName").text(response.title);
			$("#description").text(response.description);
			
			var twitterUserDefault = response.twitterUserName !=""?response.twitterUserName:"twitter";
			var tweets = "<a class=\"twitter-timeline\" data-dnt=\"true\""
					+ "href=\"https://twitter.com/"+twitterUserDefault+"\""
					+ "data-widget-id=\"736058472769294336\" data-screen-name=\""+twitterUserDefault+"\">Tweets by @"+twitterUserDefault+".</a>"
					+ "<script> !function(d, s, id) {var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/ .test(d.location) ? "
					+ "'http' : 'https'; if (!d.getElementById(id)) {js = d.createElement(s); js.id = id; "
					+ "js.src = p + \"://platform.twitter.com/widgets.js\"; fjs.parentNode.insertBefore(js, fjs); } }(document, \"script\", \"twitter-wjs\"); </script>";
			
			$("#tweets").html(tweets);
			
			twttr.widgets.load();
			
		}
	});
}