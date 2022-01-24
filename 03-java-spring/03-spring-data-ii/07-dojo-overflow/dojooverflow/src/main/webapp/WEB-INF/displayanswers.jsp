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
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1><c:out value ="${question.question}"/></h1>
<div class="row">
<h3 class="my-3">Tags:</h3>

<span><c:forEach items="${question.tags}" var="tag">
				${tag.subject}
				</c:forEach></span>
</div>
<div class="row mt-3">
			<div class="col mx-3">
<table class="table table-striped border border-dark">
<thead>
<tr>
	<th>Answer</th>
</tr>
</thead>
<tbody>
<c:forEach items="${question.answers}" var="answer">
				${answer.answer}
				</c:forEach>
</tbody>
</table>
</div>
<div class="col mx-3">
<h3>Add your answer:</h3>
<form:form action="/questions/save" method="post" modelAttribute="newAnswer">
		<div class="form-group row">
		<form:label path="answer">Answer</form:label>
		<form:errors path="answer"/>
		<form:textarea class="form-control" path="answer"/>
		<form:hidden path="question" value="${question.id}"/>
	</div>
	<button class="btn btn-warning  my-2">Answer it!</button>
	</form:form>
	</div>
	
</div>
</body>
</html>