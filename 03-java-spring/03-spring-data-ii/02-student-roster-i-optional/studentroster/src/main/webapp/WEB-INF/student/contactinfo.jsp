<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
    crossorigin="anonymous"/>

</head>
<body>
<div class="container">
	<h2>Contact Info</h2>
	<a href="/students">All Students</a>
    
	<form:form action="/contact/new" method="post" modelAttribute="contact">
	<div class="form-group">
		<form:label path="student" >Student: </form:label>
			<form:errors path="student"/>
			<form:select path="student" >
			<c:forEach items="${students}" var="student">
				<option value="${student.id}">${student.firstName} ${student.lastName}</option>
			</c:forEach>
			</form:select>
	</div>
	<div class="form-group">
		<form:label path="address">Address: </form:label>
		<form:errors path="address"/>
		<form:input path="address"/>
	</div>
	<div class="form-group">
		<form:label path="city">City </form:label>
		<form:errors path="city"/>
		<form:input path="city"/>
	</div>
	<div class="form-group">
		<form:label path="state">State </form:label>
		<form:errors path="state"/>
		<form:input path="state"/>
	</div>
	<input type="submit" value="Create" class="btn btn-success"/>
	</form:form> 
</div>

</body>
</html>