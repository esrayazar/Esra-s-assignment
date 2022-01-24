<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<div class="container">
		<h1>Question Dashboard</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Question</th>
					<th>Tag</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${allQuestions}" var="question">
			<tr>
				<td><a href="/questions/${question.id}">${question.question}</a></td>
				<td>
				<c:forEach items="${question.tags}" var="tag">
				${tag.subject}
				</c:forEach>
				</td>
				</tr>
				</c:forEach>
			</tbody>

		</table>
		<a href="/questions/new"><input type="submit" value="New Question"/></a>
	</div>

</body>
</html>