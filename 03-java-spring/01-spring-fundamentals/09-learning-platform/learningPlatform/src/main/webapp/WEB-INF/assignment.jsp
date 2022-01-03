<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel= "stylesheet" href="/css/style.css">
</head>
<body>
<div class="navbar">
<h1>Fortran!</h1>
<div class="navinfo">
<a href= "/m/38/0553/0733">Set up</a> |
<a href= "/m/38/0483/0345">Forms</a>  |
<a href= "/m/38/0553/0342">Cords</a>  |
<a href= "/m/26/0553/0348">Advanced</a> |
<a href= "/m/26/0483/2342">Binary</a>
</div>
</div>
<div class="assignment">
<input type="checkbox"> Assignment Completed.
</div>
<div class="textarea">

<textarea rows="15" cols="70"><c:out value ="${content}"/></textarea>
</div>
</body>
</html>