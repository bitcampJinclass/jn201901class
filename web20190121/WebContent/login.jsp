<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String memberId = request.getParameter("memberId");
session.setAttribute("MEMBER", memberId);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 처리</h1>
<h2>memberId : <%= memberId %></h2>
<h3>
	<a href="loginForm.jsp">로그인 폼</a> <br>
	<a href="member/mypage.jsp">마이페이지</a> <br>
	<a href="admin/admin.jsp">관리자페이지</a> <br>
	<a href="logout.jsp">로그아웃</a> <br>
</h3>
</body>
</html>