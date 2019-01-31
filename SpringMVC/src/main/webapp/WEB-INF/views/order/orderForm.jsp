<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>주문</h1>

<form method="post">

상품1 - ID <input type="text" name="orderItems[0].itemId">
상품1 - 개수  <input type="text" name="orderItems[0].number">
상품1 - 안내  <input type="text" name="orderItems[0].remark">
<hr>

상품2 - ID <input type="text" name="orderItems[1].itemId">
상품2 - 개수  <input type="text" name="orderItems[1].number">
상품2 - 안내  <input type="text" name="orderItems[1].remark">
<hr>

상품3 - ID <input type="text" name="orderItems[2].itemId">
상품3 - 개수  <input type="text" name="orderItems[2].number">
상품3 - 안내  <input type="text" name="orderItems[2].remark">
<hr>

주소 : 우편번호 <input type="text" name="address.zipcode">
주소 :  <input type="text" name="address.address1">
상세주소 :  <input type="text" name="address.address2">

<input type="submit" value="주문">








</form>

</body>
</html>