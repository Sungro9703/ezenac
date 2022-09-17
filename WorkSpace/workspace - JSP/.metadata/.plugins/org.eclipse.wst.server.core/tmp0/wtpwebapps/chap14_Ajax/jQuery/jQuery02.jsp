<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ID 선택자2</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
  <script type="text/javascript">
  	function addHtml() {
		$("#article").html('안녕하세요' +'<br>') /* id가 article인 태그를 찾아서 html()의 인자값을 태그에 설정함 */
	}
  
  </script>
</head>
<body>
	<div>
		<p id="article"></p>	
	</div>
	<input type="button" value="추가하기" onclick="addHtml()"/>
	
</body>
</html>