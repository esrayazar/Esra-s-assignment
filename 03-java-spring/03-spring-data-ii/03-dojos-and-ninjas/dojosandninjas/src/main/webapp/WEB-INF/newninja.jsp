<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>New Ninja</h1>
<div class="row">
<form action="/ninjas/new" method = "POST">
  <div class="mb-3 row">
    <label for="firstName" class="col-sm-2 col-form-label">First Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="firstName" name="firstName">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="lastName" class="col-sm-2 col-form-label">Last Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="lastName" name="lastName">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="age" class="col-sm-2 col-form-label">Age</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="age" name="age">
    </div>
  </div>
  <div class = "mb-3 row">
  <div class="col-sm-5">
  <button type="submit" class="btn btn-outline-primary float-end">Create</button>
  </div>
  </div>
</form>
</div>
</div>
</body>
</html>