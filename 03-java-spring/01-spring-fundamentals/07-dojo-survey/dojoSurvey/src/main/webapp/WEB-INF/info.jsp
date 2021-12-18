<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Submitted info</h2>
<p>Name:<c:out value="${fullName}"/></p> 
<p>Dojo Location:<c:out value="${location}"/></p> 
<p>Favorite Language:<c:out value="${language}"/></p> 
<p>Comment <c:out value="${comment}"/></p> 
<p><button action="/" method= "GET">Go Back</button></p>




</body>
</html>