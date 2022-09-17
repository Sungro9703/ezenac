<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>표현언어(EL) - 폼값 처리</title>
</head>
<body>
	<h2>폼값 처리</h2>
	<form action="formParmResult.jsp">
		이름: <input type="text" name="name" /><br/>
		성별: <input type="radio" name="gender" value="man" />남자
			 <input type="radio" name="gender" value="woman" />여자<br/>
		학력:
			<select name="grade">
				<option value="ele">초등</option>
				<option value="mid">중등</option>
				<option value="high">고등</option>
				<option value="uni">대</option>
			</select>
		관심사항:
			<input type="checkbox" name="inter" value="pol" />정치
			<input type="checkbox" name="inter" value="eco" />경제
			<input type="checkbox" name="inter" value="ent" />연애
			<input type="checkbox" name="inter" value="spo" />운동<br/>
		<input type="submit" value="전송하기" />
		
	</form>
</body>
</html>