<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width, initial-scale=1.0">
<title>내장 객체 - response</title>
</head>
<body>
<%
	String id = request.getParameter("user_id");
	String pwd = request.getParameter("user_pwd");
	if (id.equalsIgnoreCase("ezen") && pwd.equalsIgnoreCase("0824")) {
		response.sendRedirect("responseWelcome.jsp");
	}
	else {
		request.getRequestDispatcher("responseMain.jsp?loginErr=1").forward(request, response);
	}
%>
</body>
</html>