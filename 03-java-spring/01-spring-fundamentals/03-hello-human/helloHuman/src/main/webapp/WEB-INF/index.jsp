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
<h1>Human</h1>
<c:if test="${times != ''}">
 <c:forEach var = "i" begin= "1" end = "${times}">
 <h3>Hello <c:out value ="${name} ${lname}"/></h3>
 </c:forEach>
</c:if>
<c:if test="${times == ''}">
 <h3>Hello <c:out value ="${name} ${lname}"/></h3>
</c:if>


</body>
</html>