<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel= "stylesheet" href="/css/style.css">
<script type="text/javascript" src= "/js/library.js"></script>
</head>
<body>
<script>alertTime();</script>

<p class = "time"><c:out value ="${time}"/> </p>
</body>
</html>