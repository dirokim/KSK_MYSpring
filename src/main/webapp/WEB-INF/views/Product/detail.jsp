<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<c:if test="${not empty dto}">
				<h3>${dto.productName}</h3>
				<div>${dto.productNum}</div>
				<div>${dto.productContents}</div>
				<div>${dto.productRate}</div>
				<div>${dto.productJumsu}</div>
		</c:if>
		<c:if test="${empty dto}">
			<h3>그런 정보는 없습니다.</h3>		
		</c:if>
	
	
	</div>


	
</body>
</html>