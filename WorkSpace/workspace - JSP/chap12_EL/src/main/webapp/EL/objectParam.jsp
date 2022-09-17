<%@page import="kr.co.ezenac.el.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>표현 언어 - 객체 매개변수</title>
</head>
<body>
	<%
		request.setAttribute("personObj", new Person("이순신", 33));
		request.setAttribute("stringObj", "나는 문자열입니다.");
		request.setAttribute("integerObj", new Integer(100));
	%>
	<!-- 액션 태그 이용 objectResult.jsp로 포워딩 -->		<!-- 포워드된 페이지로 함께 전달 -->
	<jsp:forward page="objectResult.jsp">
		<jsp:param value="10" name="firstNum"/>
		<jsp:param value="20" name="secondNum"/>
	</jsp:forward>
</body>
</html>