<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>JSON 테스트</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script type="text/javascript">
  	$(function() {
		$("#checkJson").click(function() {
			let jsonStr = '{"age":[22, 33, 44]}'		/* json 배열을 age이름으로 저장 */
			let jsonInfo = JSON.parse(jsonStr)				    /* JSON 자료형을 리턴함 */
			
			let output = "회원 나이<br/>"
			output += "===============<br/>"
			for(let i in jsonInfo.age) {		/* 배열이름 age으로 배열 요소에 반복변수 이용해 값을 가져옴*/
				output += jsonInfo.age[i] +"<br/>"
			}
			$("#output").html(output)			/* 회원이름 출력 */
		})
	})
  </script>
</head>
<body>
	<a id="checkJson" style="cursor: pointer;">출력</a><br/><br/>
	<div id="output"></div>
</body>
</html>


























