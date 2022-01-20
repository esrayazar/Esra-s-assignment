<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<div class="container">
	<h1>Create New Project</h1>
	
	<form:form action="/ninjas/new" method="post" modelAttribute="newNinja">
	<div class="form-group">
	       <form:label path="dojo">Dojo</form:label>
		        <form:errors path="dojo"/>
		        <form:select class="form-control" path="dojo">
		        <c:forEach items="${ allDojos }" var="dojo">
		        	<option value="${ dojo.id }">${ dojo.name }</option>
		        </c:forEach>
		        </form:select>
		  </div>
	    <div class="form-group">
	        <form:label path="firstName">First Name:</form:label>
	        <form:errors class="text-danger" path="firstName"/>
	        <form:input class="form-control" path="firstName"/>
	    </div>
	    <div class="form-group">
	        <form:label path="lastName">Last Name:</form:label>
	        <form:errors class="text-danger" path="lastName"/>
	        <form:input class="form-control"  path="lastName"/>
	    </div>
	     <div class="form-group">
	       <form:label path="age">Age</form:label>
		   <form:errors path="age"/>
		   <form:input class="form-control"  path="age"/>
		  
		    
		  </div>
	    <p><button>Create</button>
	</form:form>    
</div>


</body>
</html>