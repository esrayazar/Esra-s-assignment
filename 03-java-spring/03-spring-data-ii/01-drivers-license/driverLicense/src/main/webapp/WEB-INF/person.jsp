<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div>
<h1>New Person</h1>
<form action="/person/new" method = "POST">

 <div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">First Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="firstName" name="firstName">
    </div>
  </div>
<div class="mb-3 row">
    <label for="name" class="col-sm-2 col-form-label">Last Name</label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="lastName" name="lastName">
    </div>
  </div>
  <div class = "mb-3 row">
  <div class="col-sm-5">
  <button type="submit" class="btn btn-outline-primary float-end">Create</button>
  </div>
  </div>

</form>
</div>

</body>
</html>