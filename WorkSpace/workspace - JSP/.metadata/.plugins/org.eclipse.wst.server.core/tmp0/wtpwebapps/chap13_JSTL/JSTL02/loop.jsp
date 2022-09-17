<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	List<String> dataList = new ArrayList<>();
	dataList.add("Hello");
	dataList.add("World Ezen!");
	dataList.add("좋은 아침입니다.");
%>
<c:set var="list" value="<%=dataList %>" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>반복문</title>
</head>
<body>
	<!-- 반복 변수 i를 1부터 10까지 1씩 증가시키면서 반복문 수행 -->
	<c:forEach var="i" begin="1" end="10" step="1" varStatus="loop">
		i = ${i } &nbsp;&nbsp;&nbsp; 반복횟수: ${loop.count }<br/>
	</c:forEach>
	<br/>
	
	<!-- 반복 변수 i를 1부터 10까지 2씩 증가시키면서 반복문 수행 -->
	<c:forEach var="i" begin="1" end="10" step="2">
		5 * ${i } = ${5 * i } <br/>
	</c:forEach>
	
	<!-- 컬렉션 객체에 저장된 객체(데이터)를 반복해서 반복 변수 data에 하나씩 가져와 처리 -->
	<c:forEach var="data" items="${list }">
		${data }<br/>
	</c:forEach>
	
</body>
</html>