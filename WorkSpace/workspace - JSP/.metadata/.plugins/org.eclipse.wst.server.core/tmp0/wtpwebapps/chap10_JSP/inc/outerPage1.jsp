<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>OuterPage</title>
</head>
<body>
	<h2>외부 파일1</h2>
	<% String newVar1 = "이젠IT 아카데미 학원"; %>
	<ul>
		<li>page 영역 속성: <%= pageContext.getAttribute("pAttr") %></li>
		<li>request 영역 속성: <%= request.getAttribute("rAttr") %></li>
	</ul>
</body>
</html>