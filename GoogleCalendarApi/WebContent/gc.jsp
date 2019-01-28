<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script>
	var CLIENT_ID = '235010381629-n6kurn9q531ajls1od8sbe8a0lo587p6.apps.googleusercontent.com';
	var API_KEY = 'AIzaSyBLa8fJsioMxpNIWyL6VWcjipgdoepUMio';

	var redirect_uri = 'http://' + window.location.host
			+ window.location.pathname;



	var params = {};
	var queryString = window.location.hash.substring(1);
	var regex = /([^&=]+)=([^&]*)/g;
	var m;

	while (m = regex.exec(queryString)) {
		params[decodeURIComponent(m[1])] = decodeURIComponent(m[2]);
	}

	access_token = params.access_token;
	
	if(access_token == null){
		window.location = "https://accounts.google.com/o/oauth2/auth"
			+ "?response_type=token" + "&client_id=" + CLIENT_ID
			+ "&redirect_uri=" + redirect_uri
			+ "&scope=https://www.googleapis.com/auth/calendar"
			+ "&state=profile";
	}
	
	alert(access_token);
	window.location.hash = "";

	var url = 'https://www.googleapis.com/oauth2/v1/tokeninfo?access_token='
			+ access_token;

	$.get(url, function(data) {
		
		 turl = 'https://www.googleapis.com/calendar/v3/users/me/calendarList?maxResults=1&minAccessRole=writer';
		  $.ajax(turl,
		    {
		      datatype: 'json',
		      headers: {
		        Authorization: 'Bearer ' + access_token
		      },
		      success: function(data) {
		        if (typeof data === 'string') {
		          data = JSON.parse(data);
		        }
		        //alert("이것  : " + data.items[0].id);
		        $.ajax({
		        	url : 'https://www.googleapis.com/calendar/v3/users/me/calendarList/' + data.items[0].id,
		        	success : function(data){
		        		alert(data);
		        	},
		        	error: function(jqXHR, textStatus, error) {
				        alert('Failed to get a calendar: ' + error + 'from ' + 'https://www.googleapis.com/calendar/v3/users/me/calendarList/' + data.items[0].id );
				      }
		        });
		      },
		      error: function(jqXHR, textStatus, error) {
		        notifyError('Failed to get a calendar: ' + error + 'from ' + url);
		      }
		    }
		  );
		
		
		
	}).error(function() {
		notifyError('access token is invalid');
	});
	
	
	
	
	
	
</script>
</head>
<body>

</body>
</html>