<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>Insert title here</title>
</head>
<body>
	<h2>각 영역에 저장된 속성 읽이(EL 내장 객체 사용) - 포워드 페이지</h2>
	<ul>
		<!-- EL의 내장 객체를 통해 각 영역에 저장된 속성값 출력 -->
		<li>페이지 영역(EL): ${pageScope.scopeValue }</li>
		<li>리퀘스트 영역(EL): ${requestScope.scopeValue }</li>
		<li>세션 영역(EL): ${sessionScope.scopeValue }</li>
		<li>애플리케이션 영역(EL): ${applicationScope.scopeValue }</li>
		<li></li>
	</ul>
	
	<h2>영역 지정없이 속성 읽기</h2>
	<ul>
		<!-- 영역을 따로 지정하지 않으면 가장 좁은 영역에서부터 속성을 찾음 -->
		<li>${scopeValue }</li>
	</ul>
</body>
</html>