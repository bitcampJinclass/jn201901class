<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>


<!-- 빈즈 객체 생성 -->
<jsp:useBean id="memberInfo" class="member.MemberInfo" />

<!-- 사용자 입력 데이터 받기 -->
<!-- 빈즈 클래스의 변수 이름과 폼 name 속성의 값이 같아야 한다!! -->
<jsp:setProperty property="*" name="memberInfo" />

<!-- 빈즈의 맴버에 값을 명시적 입력 -->
<jsp:setProperty name="memberInfo" property="password"
	value="<%=memberInfo.getId()%>" />
<%-- <jsp:setProperty name="memberInfo" property="password" value="${memberInfo.id}"/> --%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 안내</title>
<style>

	td { padding: 15px;}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td><label for="uid">아이디</label></td>
			<td>
			
			<jsp:getProperty property="id" name="memberInfo" /> <br>
			
			<input type="text" id="uid" name="id"
				value="<%=memberInfo.getId()%>">
			
			</td>
		</tr>
		<tr>
			<td><label for="uname">이름</label></td>
			<td>
			
			액션테그 사용 : <jsp:getProperty property="name" name="memberInfo" /> <br>
			표현식 사용 : <%= memberInfo.getName() %> <br>
			EL 사용 : ${memberInfo.name}
			
			</td>
		</tr>
		<tr>
			<td><label for="uemail">이메일</label></td>
			<td><jsp:getProperty property="email" name="memberInfo"/></td>
		<tr>
			<td><label for="uaddress">주소</label></td>
			<td><jsp:getProperty property="address" name="memberInfo"/></td>
		</tr>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="회원가입"></td>

		</tr>
	</table>
</body>
</html>