<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>JSTL - url</title>
</head>
<body>
	<c:url value="/JSTL02/inc/otherPage.jsp" var="url">
		<c:param name="userParam1" value="Ezen" />
		<c:param name="userParam2" value="IT Academy" />
	</c:url>
	<a href="${url }" >otherPage.jsp 바로가기</a>
</body>
</html>