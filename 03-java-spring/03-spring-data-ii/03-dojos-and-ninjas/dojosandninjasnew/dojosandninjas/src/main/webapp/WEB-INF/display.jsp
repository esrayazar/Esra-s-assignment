<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
    crossorigin="anonymous"/>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    </div>
  </div>
</nav>
<div class="container">
<h1><c:out value="${dojo.name}"/> Location</h1>
<table class="table table-striped">
<thead>
<th scope="col">First Name</th>
<th scope="col">Last Name</th>
<th scope="col">Age</th>
</thead>
<tbody>
<c:forEach items="${dojo.ninjas}" var="ninja">
<tr>
	<td>${ninja.firstName}</td>
	<td>${ninja.lastName}</td>
	<td>${ninja.age}</td>
</c:forEach>
</tbody>
</table>
</div>

</body>
</html>