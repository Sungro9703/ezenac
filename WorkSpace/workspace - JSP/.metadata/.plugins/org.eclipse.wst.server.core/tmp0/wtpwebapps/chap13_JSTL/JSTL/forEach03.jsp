<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="kr.co.ezenac.jstl.Person"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>JSTL - forEach (향상된 for문-collection)</title>
</head>
<body>
	<h4>List 컬렉션 사용</h4>
	<%
		LinkedList<Person> lists = new LinkedList<>();
		lists.add(new Person("이순신", 34));
		lists.add(new Person("정도전", 40));
		lists.add(new Person("이도", 36));
	%>
	
	<c:set var="lists" value="<%= lists %>" />
	<c:forEach items="${lists }" var="list">
		<li>
			이름: ${list.name }, 나이: ${list.age }
		</li>
	</c:forEach>
	
	<%
		Map<String,Person> maps = new HashMap<>();
		maps.put("1st", new Person("이순신", 34));
		maps.put("2nd", new Person("정도전", 44));
		maps.put("3rd", new Person("최영", 54));
	%>
	<c:set var="maps" value="<%=maps %>" />
	
	<!-- 위에 맵 컬렉션을 저장한 후 키와 함께 객체 세개 저장
		맵에 저장된 값이 Person 객체이므로 ${map.value.멤버변수명} 형태로 출력할 수 있음
	 -->
	
	<c:forEach items="${maps }" var="map">
		Key => ${maps.key }<br/>
		Value => 이름 : ${map.value.name }, 나이 : ${map.value.age }
	</c:forEach>
	
	
</body>
</html>