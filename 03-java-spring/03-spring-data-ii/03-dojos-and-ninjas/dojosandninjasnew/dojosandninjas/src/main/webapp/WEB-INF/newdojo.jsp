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
<h1>New Dojo</h1>
<form:form method = "post" action = "/dojos/new" modelAttribute="dojo">
<form:label path="name" >Name</form:label>
<form:errors path="name"/>
<form:input type="text" path="name"/>
<p><button>Create</button>
</form:form>
</div>














</body>
</html>