<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 완료</title>
</head>
<body>
<h1>주문 내역</h1>

	<c:forEach items="${orders.orderItems}" var="item">
		<div>
			${item.itemId} : ${item.number} : ${item.remark}
		</div>	
	</c:forEach>

<h1>배송지</h1>
${orders.address.zipcode} / ${orders.address.address1} / ${orders.address.address2}  















</body>
</html>