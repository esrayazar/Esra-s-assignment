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
<title>Project Details</title>
</head>
<body>
<div class="container">

<h3>Project Details:</h3>
<p>
Name: <c:out value="${project.projectName}"/>
</p>
<p>
Description: <c:out value="${project.description}"/>
</p>
<p>
Created BY: <c:out value="${project.student.firstName}"/>
</p>




</div>


</body>
</html>