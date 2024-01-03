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

	<c:import url="../temps/bootStrap_css.jsp"></c:import>
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
	<c:import url="../temps/header.jsp"></c:import>
	
	
  	<section class="container-fluid">
  		<div>
  			<c:if test="${not empty dto}">
  			<h3>${dto.region_id}</h3>
  			<div>${dto.region_name}</div>
  			</c:if>
  			<c:if test="${empty dto}">
  				<h3>없는 번호 입니다</h3>
  			</c:if>
  		</div>
  	</section>

</body>
</html>