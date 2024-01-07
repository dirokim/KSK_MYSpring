<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<c:import url="../temps/bootStrap_css.jsp"></c:import>
<body>
	<c:import url="../temps/header.jsp"></c:import>
	
	
	<table border=1>
		<tr>
			<th>ProductNum</th>
			<th>ProductName</th>
			<th>ProductContents</th>
			<th>ProductRate</th>
			<th>ProductJumsu</th>
		</tr>
		
		<c:forEach items="${requestScope.list}" var="dto">
			<tr>
				<td>${pageScope.dto.productNum}</td>
				<td><a href="./detail?productNum=${dto.productNum}">>${pageScope.dto.productName}</a></td>
				<td>${pageScope.dto.productContents}</td>
				<td>${pageScope.dto.productRate}</td>
				<td>${pageScope.dto.productJumsu}</td>
			
			</tr>
		</c:forEach>
		
	</table>
	
	<c:import url="../temps/bpptStrap_js.jsp"></c:import>
</body>
</html>