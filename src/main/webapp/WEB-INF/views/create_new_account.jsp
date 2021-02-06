<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 계정 생성</title>
</head>
<body>

<form action="createNewAccount">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="password"><br>
이름 : <input type="text" name="name"><br>
나이 : <input type="number" name="age"><br>
주소 : <input type="text" name="address"><br>
성별 : <input type="radio" name="gender" value=1 >남<input type="radio" name="gender" value=2 checked>여<br>
<input type="submit" value="새 계정 생성">
</form>

</body>
</html>