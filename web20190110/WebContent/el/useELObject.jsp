<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "scott");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
	request name 속성 : ${requestScope.name} / ${name}

	<hr>
	
	현재 요청 URL : ${pageContext.request.requestURL} <br>
	현재 요청 URI : ${pageContext.request.requestURI} <br>
	현재 요청 ContextPath : ${pageContext.request.contextPath}  
	
	<hr>
	
	파라미터 code 의 값 : <%= request.getParameter("code") %> / 
						
						${param.code}
	
	</h1> 


















</body>
</html>