<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel= "stylesheet" href="/css/language.css">
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