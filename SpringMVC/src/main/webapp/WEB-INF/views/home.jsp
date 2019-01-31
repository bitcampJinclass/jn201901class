<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
http://localhost/mvc/order/order
http://localhost/mvc/cookie/makeCookie
http://localhost/mvc/header/view

<ul>
	<li><a href="<%= request.getContextPath() %>/hello">/hello</a></li>
	<li><a href="member/regForm">/member/regForm</a></li>
	<li><a href="member/memberReg">회원가입</a></li>
	<li><a href="order/order">상품주문</a></li>
	<li><a href="cookie/makeCookie">쿠키 생성 및 확인</a></li>
	<li><a href="header/view">해더 정보 확인</a></li>
</ul>








</body>
</html>
