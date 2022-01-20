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
    crossorigin="anonymous"/>

<title>New Student</title>
</head>
<body>
<body>
<div class="container">
	<h2>New Student</h2>
	<a href="/students">All Students</a>
    
	<form:form action="/students/new" method="post" modelAttribute="newStudent">
	<div class="form-group">
		<form:label path="firstName">First Name: </form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
	</div>
	<div class="form-group">
		<form:label path="lastName">Last Name: </form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
	</div>
	<div class="form-group">
		<form:label path="age">Age: </form:label>
		<form:errors path="age"/>
		<form:input path="age"/>
	</div>
	<input type="submit" value="Create" class="btn btn-success"/>
	</form:form> 
</div>
</body>
</html>