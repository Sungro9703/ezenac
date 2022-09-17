<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("user_id");
	String userPw = request.getParameter("user_pw");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width, initial-scale=1.0">
<title>결과 출력2</title>
</head>
<body>
	<%
		if (userId == null || userId.length()==0) {
	%>
		아이디를 입력하세요.<br/>
		<a href="login.html">로그인하기</a>
	<%
		} else {
	%>
		<h1>환영합니다. <%=userId%>님!</h1>
	<%
		}
		
	%>
	
	
</body>
</html>