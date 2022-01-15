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
<h1>New Dojo</h1>
<div class="row">
<form action="/dojos/new" method = "POST">
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="name" name="name">
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