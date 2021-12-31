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
<h2>What is the code ?</h2>
<form action="/" method="post">
<c:if test = "${error=='error'}">
         <p style ="color:red;">You must train harder<p>
      </c:if>
<input type ="text" name="userInput">
<button>Try Code</button>

</form>

</body>
</html>