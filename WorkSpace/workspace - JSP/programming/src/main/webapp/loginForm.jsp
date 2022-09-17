<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>Login Form</title>
	<style type="text/css">
		form {width: 500px;}
		fieldset {display: grid;
				  place-content: center;
				  padding-top: 20px;}
		th {text-align: left;}
		input {margin-left: 40px;}
		button {display: block;}
		#loginBox {height: 50px;}
	</style>
	<script type="text/javascript">
		function validation(form) {
			if(form.userid.value != form.password.value || !form.userid.value) {
				alert("로그인 실패")
				return false
			}
		}
	</script>
</head>
<body>
	<form action="loginPro.jsp" onsubmit="return validation(this)">
		<fieldset>
			<legend>로그인</legend>
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" name="userid"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr align="center" id="loginBox">
					<td colspan="2"><button type="submit">로그인</button></td>
				</tr>
			</table>
		</fieldset>
	</form>
	
	
	
</body>
</html>