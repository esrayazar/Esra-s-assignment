<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link" href="/dojos/new">New Dojo</a>
      <a class="nav-item nav-link" href="/ninjas/new">New Ninja</a>
      <a class="nav-item nav-link active" href="/dojos/">List</a>
    </div>
  </div>
</nav>
<div class="container">
<table class="table">
<thead>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</thead>
<tbody>
<c:forEach items="${ninjas}" var="ninja">
<tr>
	<td>${ninja.firstName}</td>
	<td>${ninja.lastName}</td>
	<td>${ninja.age}</td>
</c:forEach>
</tbody>
</table>
</div>

<!--  [id=1, firstName=esra, lastName=yazar, age=34, dojos_id=3, createdAt=null, updatedAt=null]  -->

</body>
</html>