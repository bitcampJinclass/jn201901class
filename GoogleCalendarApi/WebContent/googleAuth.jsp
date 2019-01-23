<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Google Calendar API Quickstart</title>
<meta charset="utf-8" />
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</head>
<body>
	<p>Google Calendar API Quickstart</p>

	<!--Add buttons to initiate auth sequence and sign out-->
	<button id="authorize_button" style="display: none;">Authorize</button>
	<button id="signout_button" style="display: none;">Sign Out</button>

	<pre id="content" style="white-space: pre-wrap;"></pre>

	<!-- <script src="https://apis.google.com/js/api.js"></script> -->
	<script type="text/javascript">
	
		var atoken ;
		var GoogleAuth; // Google Auth object.

		// Client ID and API key from the Developer Console
		var CLIENT_ID = '235010381629-n6kurn9q531ajls1od8sbe8a0lo587p6.apps.googleusercontent.com';
		var API_KEY = 'AIzaSyBLa8fJsioMxpNIWyL6VWcjipgdoepUMio';

		// Array of API discovery doc URLs for APIs used by the quickstart
		var DISCOVERY_DOCS = [ "https://www.googleapis.com/discovery/v1/apis/calendar/v3/rest" ];

		// Authorization scopes required by the API; multiple scopes can be
		// included, separated by spaces.
		var SCOPES = "https://www.googleapis.com/auth/calendar";

		var authorizeButton = document.getElementById('authorize_button');
		var signoutButton = document.getElementById('signout_button');

		/**
		 *  On load, called to load the auth2 library and API client library.
		 */
		function handleClientLoad() {
			gapi.load('client:auth2', initClient);
		}

		/**
		 *  Initializes the API client library and sets up sign-in state
		 *  listeners.
		 */
		function initClient() {
			gapi.client
					.init({
						apiKey : API_KEY,
						clientId : CLIENT_ID,
						discoveryDocs : DISCOVERY_DOCS,
						scope : SCOPES
					})
					.then(
							function() {

								GoogleAuth = gapi.auth2.getAuthInstance();

								var GoogleUser = GoogleAuth.currentUser.get();

								atoken = GoogleUser.getAuthResponse().id_token;

								alert(atoken);
								
								var url ='https://www.googleapis.com/oauth2/v1/tokeninfo?access_token=' + atoken;
								
								
								$.get(url, function(data) {
									alert(1111);
							    	turl = 'https://www.googleapis.com/calendar/v3/users/me/calendarList?maxResults=1';
							    	

							    	$.ajax(url,
										    {
										      datatype: 'json',
										      headers: {
										        Authorization: 'Bearer ' + atoken
										      },
										      success: function(data) {
										        if (typeof data === 'string') {
										          data = JSON.parse(data);
										        }
										        alert(data.items[0].id);
										      },
										      error: function(jqXHR, textStatus, error) {
										        notifyError('Failed to get a calendar: ' + error + 'from ' + url);
										      }
										    }
										  );
							       
							    	
								  }).error(function() {
								    alert('access token is invalid');
								  });
								
							
								

								
								
								
								
								

								// Listen for sign-in state changes.
								gapi.auth2.getAuthInstance().isSignedIn
										.listen(updateSigninStatus);

								// Handle the initial sign-in state.
								updateSigninStatus(gapi.auth2.getAuthInstance().isSignedIn
										.get());
								authorizeButton.onclick = handleAuthClick;
								signoutButton.onclick = handleSignoutClick;
							}, function(error) {
								appendPre(JSON.stringify(error, null, 2));
							});
		}

		/**
		 *  Called when the signed in status changes, to update the UI
		 *  appropriately. After a sign-in, the API is called.
		 */
		function updateSigninStatus(isSignedIn) {
			if (isSignedIn) {
				authorizeButton.style.display = 'none';
				signoutButton.style.display = 'block';
				listUpcomingEvents();
			} else {
				authorizeButton.style.display = 'block';
				signoutButton.style.display = 'none';
			}
		}

		/**
		 *  Sign in the user upon button click.
		 */
		function handleAuthClick(event) {
			gapi.auth2.getAuthInstance().signIn();
		}

		/**
		 *  Sign out the user upon button click.
		 */
		function handleSignoutClick(event) {
			gapi.auth2.getAuthInstance().signOut();
		}

		/**
		 * Append a pre element to the body containing the given message
		 * as its text node. Used to display the results of the API call.
		 *
		 * @param {string} message Text to be placed in pre element.
		 */
		function appendPre(message) {
			var pre = document.getElementById('content');
			var textContent = document.createTextNode(message + '\n');
			pre.appendChild(textContent);
		}

		/**
		 * Print the summary and start datetime/date of the next ten events in
		 * the authorized user's calendar. If no events are found an
		 * appropriate message is printed.
		 */
		function listUpcomingEvents() {
			gapi.client.calendar.events.list({
				'calendarId' : 'primary',
				'timeMin' : (new Date()).toISOString(),
				'showDeleted' : false,
				'singleEvents' : true,
				'maxResults' : 10,
				'orderBy' : 'startTime'
			}).then(function(response) {
				var events = response.result.items;
				appendPre('Upcoming events:');

				if (events.length > 0) {
					for (i = 0; i < events.length; i++) {
						var event = events[i];
						var when = event.start.dateTime;
						if (!when) {
							when = event.start.date;
						}
						appendPre(event.summary + ' (' + when + ')')
					}
				} else {
					appendPre('No upcoming events found.');
				}
			});
		}
	</script>

	<script async defer src="https://apis.google.com/js/api.js"
		onload="this.onload=function(){};handleClientLoad()"
		onreadystatechange="if (this.readyState === 'complete') this.onload()">
		
	</script>
	
	<script>
		
		$(document).ready(function(){
			
			$('#list').click(function(){
				
				url = 'https://www.googleapis.com/calendar/v3/users/me/calendarList?maxResults=1';
				
				$.ajax(url,
					    {
					      datatype: 'json',
					      headers: {
					        Authorization: 'Bearer ' + atoken
					      },
					      success: function(data) {
					        if (typeof data === 'string') {
					          data = JSON.parse(data);
					        }
					        alert(data.items[0].id);
					      },
					      error: function(jqXHR, textStatus, error) {
					        //notifyError('Failed to get a calendar: ' + error + 'from ' + url);
					        alert('error');
					      }
					    }
					  );
				
				
				$('#idSpace').html();
				
			});
			
			
			
			
			
		});
	
	</script>
	<button id="list">List</button>
	<div id="idSpace"></div>
</body>
</html>

<!-- 
Scopes
https://www.googleapis.com/auth/calendar	See, edit, share, and permanently delete all the calendars you can access using Google Calendar
https://www.googleapis.com/auth/calendar.events	View and edit events on all your calendars
	
	 -->
<!-- <!DOCTYPE html>
	<head>
	<title>Google Calendar API Quickstart</title>
	<meta charset="utf-8" />
	<meta name="google-signin-scope" content="profile email"/>
	<meta name="google-signin-client_id"
		content="235010381629-n6kurn9q531ajls1od8sbe8a0lo587p6.apps.googleusercontent.com"/>
	</head>
	<body>
	<p>Google Calendar API Quickstart</p>

	Add buttons to initiate auth sequence and sign out
	<button id="authorize_button" style="display: none;">Authorize</button>
	<button id="signout_button" style="display: none;">Sign Out</button>

	<pre id="content" style="white-space: pre-wrap;"></pre>

	<script type="text/javascript">
		var GoogleAuth;

		// Client ID and API key from the Developer Console
		var CLIENT_ID = '235010381629-n6kurn9q531ajls1od8sbe8a0lo587p6.apps.googleusercontent.com';
		var API_KEY = 'AIzaSyBLa8fJsioMxpNIWyL6VWcjipgdoepUMio';

		// Array of API discovery doc URLs for APIs used by the quickstart
		var DISCOVERY_DOCS = [ "https://www.googleapis.com/discovery/v1/apis/calendar/v3/rest" ];

		// Authorization scopes required by the API; multiple scopes can be
		// included, separated by spaces.
		var SCOPES = "https://www.googleapis.com/auth/calendar.readonly";

		var authorizeButton = document.getElementById('authorize_button');
		var signoutButton = document.getElementById('signout_button');

		/**
		 *  On load, called to load the auth2 library and API client library.
		 */
		function handleClientLoad() {
			gapi.load('client:auth2', initClient);
		}

		/**
		 *  Initializes the API client library and sets up sign-in state
		 *  listeners.
		 */
		function initClient() {
			gapi.client
					.init({
						apiKey : API_KEY,
						clientId : CLIENT_ID,
						discoveryDocs : DISCOVERY_DOCS,
						scope : SCOPES
					})
					.then(
							function() {
								// Listen for sign-in state changes.
								gapi.auth2.getAuthInstance().isSignedIn
										.listen(updateSigninStatus);

								// Handle the initial sign-in state.
								updateSigninStatus(gapi.auth2.getAuthInstance().isSignedIn
										.get());
								authorizeButton.onclick = handleAuthClick;
								signoutButton.onclick = handleSignoutClick;
							}, function(error) {
								appendPre(JSON.stringify(error, null, 2));
							});
		}

		/**
		 *  Called when the signed in status changes, to update the UI
		 *  appropriately. After a sign-in, the API is called.
		 */
		function updateSigninStatus(isSignedIn) {
			if (isSignedIn) {
				authorizeButton.style.display = 'none';
				signoutButton.style.display = 'block';
				listUpcomingEvents();
			} else {
				authorizeButton.style.display = 'block';
				signoutButton.style.display = 'none';
			}
		}

		/**
		 *  Sign in the user upon button click.
		 */
		function handleAuthClick(event) {
			gapi.auth2.getAuthInstance().signIn();
		}

		/**
		 *  Sign out the user upon button click.
		 */
		function handleSignoutClick(event) {
			gapi.auth2.getAuthInstance().signOut();
		}

		/**
		 * Append a pre element to the body containing the given message
		 * as its text node. Used to display the results of the API call.
		 *
		 * @param {string} message Text to be placed in pre element.
		 */
		function appendPre(message) {
			var pre = document.getElementById('content');
			var textContent = document.createTextNode(message + '\n');
			pre.appendChild(textContent);
		}

		/**
		 * Print the summary and start datetime/date of the next ten events in
		 * the authorized user's calendar. If no events are found an
		 * appropriate message is printed.
		 */
		function listUpcomingEvents() {
			gapi.client.calendar.events.list({
				'calendarId' : 'primary',
				'timeMin' : (new Date()).toISOString(),
				'showDeleted' : false,
				'singleEvents' : true,
				'maxResults' : 10,
				'orderBy' : 'startTime'
			}).then(function(response) {
				var events = response.result.items;
				appendPre('Upcoming events:');

				if (events.length > 0) {
					for (i = 0; i < events.length; i++) {
						var event = events[i];
						var when = event.start.dateTime;
						if (!when) {
							when = event.start.date;
						}
						appendPre(event.summary + ' (' + when + ')')
					}
				} else {
					appendPre('No upcoming events found.');
				}
			});
		}
	</script>

	<script async defer src="https://apis.google.com/js/api.js"
		onload="this.onload=function(){};handleClientLoad()"
		onreadystatechange="if (this.readyState === 'complete') this.onload()">
		
	</script>



	// The ID token you need to pass to your backend: 
     var id_token = googleUser.getAuthResponse().id_token; 
     console.log("ID Token: " + id_token); 
     }; 

</body>
</html> -->