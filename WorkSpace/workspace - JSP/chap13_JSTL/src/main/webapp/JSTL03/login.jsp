<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>로그인</title>
</head>
<body>
	<form action="result2.jsp" method="post">
		아이디: <input type="text" name="userId"/><br/>
		비밀번호: <input type="password" name="userPw"/><br/>
		<input type="submit" value="로그인" />
		<input type="reset" value="다시입력" />
	</form>
	
</body>
</html>