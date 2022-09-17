<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<c:url var="url1" value="member2.jsp">	<%-- url 태그로 이동할 페이지 설정 --%>
	<c:param name="id" value="ezen500"/>	<%-- 이동할 페이지로 전달할 데이터 설정 --%>
	<c:param name="pwd" value="8024"/>
	<c:param name="name" value="이순신"/>
	<c:param name="email" value="ezen500@gmail.com"/>
</c:url>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>Insert title here</title>
</head>
<body>
	<a href="${url1 }">회원정보출력</a>
</body>
</html>