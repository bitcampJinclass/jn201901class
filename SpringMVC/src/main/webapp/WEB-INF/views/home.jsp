<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello Spring world!  
</h1>


http://localhost/mvc/ <br>
http://localhost/mvc/hello <br>
http://localhost/mvc/member/regForm

<ul>
	<li><a href="<%= request.getContextPath() %>/hello">/hello</a></li>
	<li><a href="member/regForm">/member/regForm</a></li>
</ul>








</body>
</html>
