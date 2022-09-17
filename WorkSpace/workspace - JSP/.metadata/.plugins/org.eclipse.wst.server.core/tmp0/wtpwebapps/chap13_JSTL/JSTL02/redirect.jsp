<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>JSTL - redirect</title>
</head>
<body>
	<c:set var="requestVar2" value="이젠IT" scope="request" />
	<c:redirect url="/JSTL02/inc/otherPage.jsp" >
		<c:param name="userParam1" value="EzenITAcademy"/>
		<c:param name="userParam2" value="이젠아이티아카데미"/>
	</c:redirect>
</body>
</html>