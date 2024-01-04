<%@page import="com.summer.app.regions.RegionDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
	<c:import url="../temps/bootStrap_css.jsp"></c:import>
	<c:import url="../temps/bootStrap_js.jsp"></c:import>
	<c:import url="../temps/header.jsp"></c:import>

    <table  class="table table-hover">
    
    		<tr>
    			<td>ID</td><td>NAME</td>
    		</tr>
	<c:forEach items="${requestScope.list}" var="dto">
		
		<tr>
			<td>${pageScope.dto.region_id}</td>
			<td><a href="./detail?region_id=${dto.region_id}">${pageScope.dto.region_name}</a></td>
		</tr>
	</c:forEach>
	</table>
	<a href="add" class="btn btn-primary" class="btn btn-outline-success">add</a>



</body>
</html>