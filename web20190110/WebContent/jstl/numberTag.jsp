<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="now" value="<%= new java.util.Date() %>"/>

<fmt:formatDate value="${now}" type="date" dateStyle="full"/>
<br>
<fmt:formatDate value="${now}" type="date" dateStyle="short"/>
<br>
<fmt:formatDate value="${now}" type="time" />
<br>
<fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short" />
<br>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd h:mm:ss" />
<br>
<fmt:formatDate value="${now}" pattern="yyyy.MM.dd. HH:ss " />

<hr>

<c:set value="100000000" var="price"/>



<fmt:formatNumber value="${price}" type="number" var="num"/>
${num}
<br>

<fmt:formatNumber value="${price}" type="currency" currencySymbol="\\" />

<br>
<fmt:formatNumber value="${price}" type="percent" groupingUsed="false" />

<br>

<fmt:formatNumber value="${price}" pattern="0,0000,0000.0" />

















</body>
</html>