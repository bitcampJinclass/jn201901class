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
http://localhost/mvc/member/regForm <br>
http://localhost/mvc/order/order <br>
http://localhost/mvc/cookie/makeCookie <br>
http://localhost/mvc/header/view <br>
http://localhost/mvc/search/searchForm <br>
http://localhost/mvc/fileupload/form <br>
http://localhost/mvc/guest/10 <br>
http://localhost/mvc/mypage/mypage1 <br>
http://localhost/mvc/mypage/mypage2 <br>
http://localhost/mvc/member/login <br>

<ul>
	<li><a href="<%= request.getContextPath() %>/hello">/hello</a></li>
	<li><a href="member/regForm">/member/regForm</a></li>
	<li><a href="member/memberReg">회원가입</a></li>
	<li><a href="order/order">상품주문</a></li>
	<li><a href="cookie/makeCookie">쿠키 생성 및 확인</a></li>
	<li><a href="header/view">해더 정보 확인</a></li>
	<li><a href="search/searchForm">검색 페이지</a></li>
	<li><a href="fileupload/form">파일업로드</a></li>
	<li><a href="guest/10">10번 게시물보기</a></li>
	<li><a href="guest/100">100번 게시물보기</a></li>
	<li><a href="guest/1000">1000번 게시물보기</a></li>
	<li><a href="guest/807">807번 게시물보기</a></li>
	<li><a href="mypage/mypage1">mypage1</a></li>
	<li><a href="mypage/mypage2">mypage2</a></li>
	<li><a href="member/login">로그인</a></li>
	
</ul>








</body>
</html>
