<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:url value="c_out.jsp" var="url1" />
	<c:url value="/jstl/c_out.jsp" var="url2" />
	<c:url value="/jstl/c_out.jsp" var="url3" >
		<c:param name="sel">A</c:param>
	</c:url>

	<h2>
		<a href="${url1}">경로 1</a> : ${url1} <br>
		<a href="${url2}">경로 2</a> : ${url2} <br>
		<a href="<c:url value="/jstl/c_out.jsp" />">경로 3</a> : ${url3} <br>
	
	</h2>


<hr>


<h1>회원 리스트</h1>





<table border="1">
	<tr>
		<th>index</th>
		<th>count</th>
		<th>이름</th>
		<th>이메일</th>
	</tr>
	
	
	<c:forEach items="${members}" var="member" varStatus="status">
	
	<tr >
		<td><a href="detailVies.jsp?no=${status.index}">${status.index}</a></td>
		<td>${status.count}</td>
		<td>${member.name}</td>
		<td>${member.email}</td>
	</tr>
	
	</c:forEach>
	
	
	

</table>











</body>
</html>