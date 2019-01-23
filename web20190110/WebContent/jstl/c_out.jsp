<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="member.Member"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%
	ArrayList<Member> members = new ArrayList<Member>();

	members.add(new Member("홍길동11", "hong11@naver.com"));
	members.add(new Member("홍길동12", "hong12@naver.com"));
	members.add(new Member("홍길동13", "hong13@naver.com"));
	members.add(new Member("홍길동14", null));
	members.add(new Member("홍길동15", "hong15@naver.com"));
	members.add(new Member("홍길동16", "hong16@naver.com"));
	members.add(new Member("홍길동17", "hong17@naver.com"));
	members.add(new Member("홍길동18", "hong18@naver.com"));
	members.add(new Member("홍길동19", null));
	members.add(new Member("홍길동20", null));
	
	application.setAttribute("members", members);



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<c:forEach items="${members}" var="member">	
	
	
	
	
	<h3> ${member.name} :  
	
	<c:out value="${member.email}" default="이메일정보 없음"/>
	
	/
	
	<c:out value="${member.email}" escapeXml="false">
		<span style="color:red">등록된 이메일이 없습니다.</span>
	</c:out>
	
	/
	
	<c:if test="${member.email eq null}">
		<span style="color:blue">이메일 정보가 없습니다.</span>
	</c:if>
	
	<c:if test="${member.email ne null}">
		${member.email}		
	</c:if>
	 
	
	
	</h3>
	
	
	
	</c:forEach>



















</body>
</html>