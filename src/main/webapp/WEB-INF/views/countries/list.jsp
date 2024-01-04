<%@page import="com.summer.app.countries.CountryDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
    List<CountryDTO> ar = (List<CountryDTO>)request.getAttribute("list");
   
   %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Countries List</h1>
	
	
	
		<table>
			<thead>
				<tr>
					<th>Country_ID</th>
					<th>Region_ID</th>
					<th>Country_Name</th>
				</tr>
			</thead>
			<tbody>
				<% for(CountryDTO countryDTO:ar){ %>
				<tr>
					<td><%=countryDTO.getCountry_id() %></td>
					<td><%=countryDTO.getRegion_id() %></td>
					<td><%=countryDTO.getCountry_name() %></td>
					
				</tr>
				<%} %>
			</tbody>
		</table>
</body>
</html>