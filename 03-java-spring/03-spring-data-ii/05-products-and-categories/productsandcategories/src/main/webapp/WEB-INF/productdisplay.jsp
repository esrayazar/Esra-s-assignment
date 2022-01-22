<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
    crossorigin="anonymous"/>
<title>Insert title here</title>
</head>
<body>
<div class="container col-4">
		<h1 class="my-3">${product.name}</h1>
		<div>
			<h3 class="my-3">Categories:</h3>
			<c:forEach items="${product.categories}" var="category">
				<p>- ${category.name}</p>
			</c:forEach>
				
		</div>
		
			
		<form method="POST" action="/products/${product.id}">
			<label>Select a category:</label>
			<select name="category">
				<c:forEach items="${categories}" var="category">
					<option value="${category.id}">${category.name}</option>
				</c:forEach>
			</select>
			<button class="btn btn-warning">Add</button>
		</form>
		
		<p class="mt-5">
			<a href="/products/new">Create Product</a>
		</p> 
		<a href="/categories/new">Create Category</a>
	</div>




<%-- <h1>${category.name} </h1>
	<strong>Products</strong>
	<ul>
		<c:forEach items="${category.products}" var="product"> 
			<li>${product.name}</li>
		
		</c:forEach> 
	</ul> 
		<form method="post" action="/categories/${category.id}">
		<select name="pros">
			<c:forEach items="${products}" var="product">
				<option value="${product.id}">${product.name}</option>
			</c:forEach>
		</select>
		<button>Add</button>
	</form> 
	 --%>
</body>
</html>