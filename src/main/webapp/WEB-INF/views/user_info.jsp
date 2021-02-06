<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfo</title>
</head>
<body>

<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>나이</th>
		<th>주소</th>
		<th>성별</th>
		<th>수정</th>
	</tr>
	<c:forEach items="${dtoList}" var="list">
	<tr>
		<td>${list.id}</td>
		<td>${list.password}</td>
		<td>${list.name}</td>
		<td>${list.age}</td>
		<td>${list.address}</td>

		<c:set var="gender" value="${list.gender}"/>
			<c:choose>
				<c:when test="${gender == 1}">
					<td>남</td>
				</c:when>
				<c:when test="${gender == 2}">
					<td>여</td>
				</c:when>
			</c:choose>
		<td><a href="moveModifyUserInfo?id=${list.id}">수정페이지</a></td>
	</tr>
	</c:forEach>
</table>


<a href="moveCreateNewAccount">새 계정 생성</a>
</body>
</html>