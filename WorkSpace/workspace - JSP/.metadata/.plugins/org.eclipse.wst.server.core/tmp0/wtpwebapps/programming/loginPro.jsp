<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	
	session.setAttribute("userid", userid);
	session.setAttribute("password", password);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>Session</title>
</head>
<body>
	<h2>로그인 확인</h2>
	<%= session.getAttribute("userid") %>님이 로그인 하셨습니다.
</body>
</html>