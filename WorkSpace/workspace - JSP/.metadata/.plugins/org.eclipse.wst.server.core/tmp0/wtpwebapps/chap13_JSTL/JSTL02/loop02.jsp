<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.ezenac.jstl.MemberBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>

<%
	List<MemberBean> memberList = new ArrayList<>();
	MemberBean m1 = new MemberBean("ezen100", "0824", "이순신", "ezen100@gmail.com");
	MemberBean m2 = new MemberBean("ezen200", "0824", "신사임당", "ezen200@gmail.com");
	MemberBean m3 = new MemberBean("ezen300", "0824", "이도", "ezen300@gmail.com");
	memberList.add(m1);
	memberList.add(m2);
	memberList.add(m3);
%>
<c:set var="membersList" value="<%= memberList %>" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>반복문</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="#99ccff">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
		<c:forEach var="i" begin="0" end="2" step="1">
			<tr align="center">
				<td>${membersList[i].id }</td>
				<td>${membersList[i].pwd }</td>				
				<td>${membersList[i].name }</td>				
				<td>${membersList[i].email }</td>							
			</tr>
		</c:forEach>
		<br/>
		
		<c:forEach var="member" items="${membersList }">
			<tr align="center">
				<td>${member.id }</td>
				<td>${member.pwd }</td>
				<td>${member.name }</td>
				<td>${member.email }</td>
			</tr>
		</c:forEach>
		
	</table>	
</body>
</html>