<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel= "stylesheet" href="/css/language.css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="float-end">
<a href="/delete/${language.id}">Delete</a>
<a href="/languages">Dashboard</a>
</div>
<div class="row">
<form action="/languages" method = "POST">
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="name" name="name" value="<c:out value ="${language.name}"/>">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="creator" class="col-sm-2 col-form-label">Creator</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="creator" name= "creator" value="<c:out value ="${language.creator}"/>">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="version" class="col-sm-2 col-form-label">Version</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="version" name="version" value="<c:out value ="${language.version}"/>">
    </div>
  </div>
  <div class = "mb-3 row">
  <div class="col-sm-5">
  <button type="submit" class="btn btn-outline-primary float-end">Submit</button>
  </div>
  </div>
  <input type ="hidden" name="id" value="<c:out value ="${language.id}"/>" >

</form>
</div>
</div>

</body>
</html>