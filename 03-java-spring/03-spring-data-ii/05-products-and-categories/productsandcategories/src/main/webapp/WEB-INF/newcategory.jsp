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

<title>New Category</title>
</head>
<body>
<div class="container">
	<h1>Create New Category</h1>
	<a href="/">All Products</a>
<a href="/products/new">New Product</a>
	<form:form action="/categories/new" method="post" modelAttribute="category">
	    <div class="form-group">
	        <form:label path="name">Name</form:label>
	        <form:errors class="text-danger" path="name"/>
	        <form:input class="form-control" path="name"/>
	    </div>
	    </form:form>
	     <input type="submit" class="btn btn-primary" value="Submit"/>
</div>
</body>
</html>