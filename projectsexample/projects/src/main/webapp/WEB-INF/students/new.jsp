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
<title>Add Student</title>
</head>
<body>
<div class="container">
<h1>New Student</h1>
<form:form action="/students/create" method="post" modelAttribute="student">
<p>
<form:label path="firstName"> First Name</form:label>
<form:errors path="firstName" class="text-danger" />
<form:input path="firstName" class="form-control"/>
</p>
<p>
<form:label path="lastName"> Last Name</form:label>
<form:errors path="lastName" class="text-danger" />
<form:input path="lastName" class="form-control"/>
</p>
<p>
<form:label path="email"> Email </form:label>
<form:errors path="email" class="text-danger" />
<form:input path="email" class="form-control"/>
</p>
<button>Submit</button>


</form:form>

</div>

</body>
</html>