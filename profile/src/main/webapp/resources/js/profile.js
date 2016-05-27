$(document).on("ready",function(){
	getProfile();
});

function getProfile(){
	url= ctx+"/zemoga_portfolio_api/user_info";
    $.ajax({
        url: url,
        type: 'GET',
        dataType: 'json',
        success:function(objResponse){
        	console.log(objResponse);
        }
     });
}