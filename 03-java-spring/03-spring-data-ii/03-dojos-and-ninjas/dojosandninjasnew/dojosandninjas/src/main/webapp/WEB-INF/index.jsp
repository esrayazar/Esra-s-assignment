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
<div class="container">

<h1>All Dojos</h1>
  <a href="/dojos/new">New Dojo</a>
    <a href="/ninjas/new">New Ninja</a>
    <table class="table table-dark">
    <thead>
        <tr>
            <th>Dojo</th>
            <th>Action</th>
        </tr>
    </thead>
        <tbody>
        <c:forEach items="${newDojo}" var="dojo">
	        <tr>
	            <td><a href="/details/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
	            <td>
	        <form action="/delete/${dojo.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input type="submit" value="Delete">
			</form>
			</td>
			<td><a href="/dojo/edit/${dojo.id}"><button>Edit</button></a></td>
	        </tr>
	        </c:forEach>
	        
    </tbody>
</table>
 <%--    <h1>New Dojo</h1>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="newDojo">Dojo:</form:label>
	        <form:errors path="newDojo"/>
	        <form:input path="newDojo"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>  
	
</div>
<a href="/ninjas/"><button>Add Ninja</button></a> --%>
</body>
</html>