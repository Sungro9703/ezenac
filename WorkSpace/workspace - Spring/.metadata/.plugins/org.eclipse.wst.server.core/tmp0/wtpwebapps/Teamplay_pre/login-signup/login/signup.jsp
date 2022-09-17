<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>회원가입</title>
</head>
<style>
.text-field {
	font-size: 14px;
	padding: 10px;
	border: none;
	width: 400px;
	margin-bottom: 10px;
	background-color: #EEEFF1;
}

#input {
	text-align: center;
}

#check_btn{
	font-size: 14px;
	border: none;
	padding: 10px;
	background-color: #9bb7d6;
	color: white;
	text-align: center;
	width: 130px;
	height:36px;
	margin-bottom: 10px;
	position: absolute
}

.info {
	margin-bottom: 20px;
}

#next_btn{
	 font-size: 14px;
  border: none;
  padding: 10px;
  width: 130px;
  background-color:#9bb7d6;
  margin-bottom: 30px;
  color: white;
  text-align: center;
  float:right;
  border-radius: 5px;
}
.text{
position:absolute;
left:25%;

}



</style>
<body>
<h2>회원가입</h2>
		<h2 style="text-align: center;">회원가입</h2>
		<h3 style="color: #808080; text-align: center;" >회원정보를 입력해주세요</h3>	
		<hr style="border: thin 2px #808080;">
		<br>
	<form action="${contextPath}/member/addMember.do" method="post">
	<div id="signup-form">		
		<div id="input">

			<div class="info">
				<div class="text">아이디</div>
				<input type="text" class="text-field" id="id" placeholder="아이디">&nbsp;&nbsp;
			</div>

			<div class="info">
				<div class="text">이름</div>
				<input type="text" class="text-field" id="name" placeholder="이름">
			</div>

			<div class="info">
				<div class="text">비밀번호</div>
				<input type="password" class="text-field" id="pw"
					placeholder="비밀번호">
			</div>
			
			<div class="info">
				<div class="text">생년월일</div>
				<input type="date" class="text-field" id="birth" placeholder="생년월일">
			</div>
			
			<div class="info">
				<div class="text">성별</div>
				<select class="text-field" id="gender">
					<option value="남자">남자</option>
					<option value="여자">여자</option>
				</select>
			</div>
			
			<div class="info">
				<div class="text">전화번호</div>
				<input type="tel" class="text-field" id="phone" placeholder="전화번호">
			</div>
			
			<div class="info">
				<div class="text">주소</div>
				<input type="text" class="text-field" id="addr" placeholder="주소">
			</div>


		</div>
		
		<div>
			<input type="button" id="next_btn" value="가입하기"/>
		</div>

	</div>
	</form>


</body>
</html>