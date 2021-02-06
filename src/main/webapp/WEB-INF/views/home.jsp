<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

<form action="loginCheck">

	id : <input type="text" name="id"><br>
	password : <input type="password" name="password"><br>
	<input type="submit" value="로그인">

</form>
${msg}


</body>
</html>
