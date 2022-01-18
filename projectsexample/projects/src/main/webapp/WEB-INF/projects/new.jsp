<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<title>Add Project</title>
</head>
<body>
<div class="container">
<h1>New Project</h1>
<form:form action="/projects/create" method="post" modelAttribute="project">
<p>
<form:label path="projectName"> Project Name</form:label>
<form:errors path="projectName" class="text-danger" />
<form:input path="projectName" class="form-control"/>
</p>
<p>
<form:label path="description"> Description</form:label>
<form:errors path="description" class="text-danger" />
<form:input path="description" class="form-control"/>
</p>
<p>
<form:select path="student"> 
<c:forEach items="${students}" var="student">
<option value="${student.id}"> ${student.firstName}</option>
</c:forEach>

</form:select>

</p>
<button>Submit</button>


</form:form>

</div>

</body>
</html>