<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
</head>
<body>
	<h1>${title}가입</h1>

	<form method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="upw"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>사진</td>
				<td><input type="file" name="uphoto"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			<tr>
		</table>
	</form>
















</body>
</html>