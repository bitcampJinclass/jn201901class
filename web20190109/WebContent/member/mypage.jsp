<%@page import="member.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberInfo memberInfo = (MemberInfo) session.getAttribute("loginInfo");

	boolean login = memberInfo == null ? false : true ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mypage</title>
</head>
<body>

	<%
		if(login){
			%>
			<h3><a href="logout.jsp">로그아웃</a></h3>
			<h2> <%= memberInfo.getName() %>(<%= memberInfo.getId() %>)님 안녕하세요.</h2>
			<h2> ${loginInfo.name} (${loginInfo.id})님 안녕하세요.</h2>
			
			
			<%
			
		} else {
			 %>
			 
			 <h2> 회원 전용 페이지 입니다. <a href="loginForm.jsp">로그인 하기</a></h2>
			 
			 
			 <%
		}
	%>







</body>
</html>