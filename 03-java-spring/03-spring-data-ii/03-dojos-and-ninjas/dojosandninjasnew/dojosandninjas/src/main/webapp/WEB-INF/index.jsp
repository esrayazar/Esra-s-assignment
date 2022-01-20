<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel= "stylesheet" href="/css/language.css">
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
<h1>All Dojos</h1>
    <table class="table table-dark">
    <thead>
        <tr>
            <th>Dojo</th>
            <th>Action</th>
            <th>List</th>
        </tr>
    </thead>
        <tbody>
        <c:forEach items="${newDojo}" var="dojo">
	        <tr>
	            <td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
	            <td>
	        <form action="/delete/${dojo.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <button type="submit" class="btn btn-outline-primary" value="Delete">Delete</button>
			    <a class="btn btn-outline-primary" href="/edit/${dojo.id}">Edit</a>
			</form>
			</td>
			<td><a class="btn btn-outline-primary" href="/dojos/${dojo.id}">Display</a></td>
	        </tr>
	        </c:forEach>
	        
    </tbody>
</table>
 
</body>
</html>