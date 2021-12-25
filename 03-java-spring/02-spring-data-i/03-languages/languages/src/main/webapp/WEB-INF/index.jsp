
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Languages</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel= "stylesheet" href="/css/language.css">
</head>
<body>
<h1>Languages</h1>

<div class= "container">
<div class= "row">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Creator</th>
      <th scope="col">Version</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items= "${languages}" var= "language">
    <tr>
      <td><a href="/languages/${language.id}">${language.name}</a></td>
      <td>${language.creator}</td>
      <td>${language.version}</td>
      <td>
      <a href="/languages/${language.id}/edit">Edit</a>
      <a href="/delete/${language.id}">Delete</a>
      
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</div>
<form action="/languages" method = "POST">
  <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="name" name="name">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="creator" class="col-sm-2 col-form-label">Creator</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="creator" name= "creator">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="version" class="col-sm-2 col-form-label">Version</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="version" name="version">
    </div>
  </div>
  <div class = "mb-3 row">
  <div class="col-sm-5">
  <button type="submit" class="btn btn-outline-primary float-end">Submit</button>
  </div>
  </div>

</form>

</div>
</body>
</html>