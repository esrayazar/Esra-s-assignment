<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link rel= "stylesheet" href="/css/style.css">
</head>
<c:out value ="${awesomePerson}"/>
<body>
<div class ="container">
<p>Your Gold:<c:out value ="${totalGold}"/> </p>

<div class="building">
<form method= "POST" action="/findGold">
<h3>Farm</h3>
<input type = "hidden" name= "building" value="farm">
<p>Earns 10-20 Gold </p>
<button>Find Gold</button>
</form>
</div>

<div class="building">
<form method= "POST" action="/findGold">
<h3>Cave</h3>
<input type = "hidden" name= "building" value="cave">
<p>Earns 5-10 Gold </p>
<button>Find Gold</button>
</form>
</div>

<div class="building">
<form method= "POST" action="/findGold">
<h3>House</h3>
<input type = "hidden" name= "building" value="house">
<p>Earns 2-5 Gold </p>
<button>Find Gold</button>
</form>
</div>

<div class="building">
<form method= "POST" action="/findGold">
<h3>Casino</h3>
<input type = "hidden" name= "building" value="casino">
<p>Earns / Loses 0-50 Gold </p>
<button>Find Gold</button>
</form>
</div>

<h2>Activities</h2>
<div class = "activities">
<c:forEach items= "${activities}" var ="act">
<c:choose>
<c:when test = "${act.contains('ouch')}">
<p class= "red">${act}</p>
</c:when>
<c:otherwise>
<p class ="green" > ${act} </p>
</c:otherwise>
</c:choose>
</c:forEach>


</div>
</div>


</body>
</html>