<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label"><c:out value ="${language.name}"/></label>
  </div>
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label"><c:out value ="${language.creator}"/></label>
  </div>
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label"><c:out value ="${language.version}"/></label>
  </div>
<a href="/languages">Dashboard</a>
<a href="/languages/${language.id}/edit">Edit</a>
<a href="/delete/${language.id}">Delete</a>
</div>

</body>
</html>