<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h3>
		Welcome to Coding Dojo <c:out value="${user.firstName}"/>
	</h3>

	<a href="/logout">Logout</a>
	<table class="table table-dark">
		<thead>
			<tr>
				<th>Project name</th>
				<th>Created By</th>
				<th>Likes</th>
			</tr>
		</thead>
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tbody>
			
		</tbody>
	</table>
	</div>

</body>
</html>