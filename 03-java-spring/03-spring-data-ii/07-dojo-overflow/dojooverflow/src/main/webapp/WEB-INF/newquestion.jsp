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
<h1>What is your question?</h1>
<form:form action="/questions/new" method="post" modelAttribute="newQuestion">
<div class="form-group row">
<form:label path="question"> Question</form:label>
<form:errors path="question" class="text-danger" />
<form:input path="question" class="form-control"/>
</div>
<div class="form-group row">
<form:label path="temptags"> Tags</form:label>
<form:errors path="temptags" class="text-danger" />
<form:input path="temptags" class="form-control"/>
</div> 
<input type="submit" value="Create"/>

</form:form>
</div>

</body>
</html>