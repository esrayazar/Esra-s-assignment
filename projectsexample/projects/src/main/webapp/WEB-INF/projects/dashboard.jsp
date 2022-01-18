<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<title>Project Dashboard</title>
</head>
<body>
	<div class="container">
		<h3>Projects</h3>
		<a href="/students/new">New Student</a> <a href="/projects/new">New
			Project</a>
		<table class="table table-dark">
			<thead>
				<tr>
					
					<th>Project Name</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${projects}" var= "project">
			<tr>
			<td>
				<a href="/projects/${project.id}/details">
				<c:out value="${project.projectName}"/>
				</a>
			</td>
			<td>
			
			<c:out value="${project.student.firstName}"/>
			</td>
			<td>
			<a href="/projects/${project.id}/edit">Edit</a>
			<a href="/projects/${project.id}/delete">Delete</a>
			</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>