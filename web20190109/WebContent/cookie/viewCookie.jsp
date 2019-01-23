<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키 정보 보기</h1>

<%
	Cookie[] cookies = request.getCookies();

	if (cookies != null && cookies.length > 0){
		for ( int i=0; i < cookies.length ; i++){
			%>
			<%= cookies[i].getName() %> 
			: <%= URLDecoder.decode(cookies[i].getValue(), "UTF-8")  %> 
			<br>
			check : 
			${cookie.name.value}
			
			<%
		}
	} else {
		
		%>
		저장된 쿠키 정보가 없습니다.
		<%
		
	}

%>



	<h3>
		<a href="editCookie.jsp">쿠키 수정하기</a> <br>
		<a href="deleteCookie.jsp">쿠키 삭제하기</a> 
	</h3>














</body>
</html>