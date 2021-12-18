<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/result" method= "POST">
<p>Your Name <input type="text" name="fullName" /> </p>
<p>Dojo Location:
<select name="location">
<option value="San-Jose">San-Jose</option>
<option value="Bellevue">Bellevue</option>
<option value="Boise">Boise</option>
<option value="Chicago">Chicago</option>
<option value="Los Angeles">Los-Angeles</option>
</select>
</p>
<p>Favorite Language:
<select name="language">
<option value="JAVA">JAVA</option>
<option value="MERN">MERN</option>
<option value="Python">Python</option>
</select>
</p>
<p>Comment(optional) <textarea name="comment"></textarea></p>

<p><button>Submit</button></p>
</form>

</body>
</html>