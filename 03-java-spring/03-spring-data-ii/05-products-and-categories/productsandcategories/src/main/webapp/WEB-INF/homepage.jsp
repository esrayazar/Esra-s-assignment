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
<title>Home Page</title>
</head>
<body>
<div class="container">
<h1>All Users</h1>
    <a href="/products/new">New Product</a>
    <a href=c>New Category</a>
<table class="table table-striped">
    <thead>
        <tr>
            <th>Product</th>
            <th>Category</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${Products}" var="Product">
        <tr>
            <td><c:out value="${Product.name}"/></td>
             <td>
             <c:forEach items="${Product.categories}" var="category">
				<p>- ${category.name}</p>
			</c:forEach>
             <c:out value="${Category.name}"/>
             
             </td>
            <td>
               <form action="/delete/${User.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete">
				</form>
				</td>
		</tr>
        </c:forEach>
    </tbody>
</table>
</div>

</body>
</html>