<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>JSTL - forTokens</title>
</head>
<body>
	<%
		String rgba = "Red,Green,Blue,Black";
	%>
	<h4>JSTL의 forTokens 태그</h4>
	<c:forTokens items="<%=rgba %>" delims="," var="color">
		<span style="color: ${color}">${color }</span><br/>
	</c:forTokens>
	<br/>
	
	<c:set var="fruits" value="사과,파인애플,바나나,망고,귤" />
	<c:forTokens items="${fruits }" delims="," var="token">
		${token }<br/>
	</c:forTokens>
	
	
</body>
</html>