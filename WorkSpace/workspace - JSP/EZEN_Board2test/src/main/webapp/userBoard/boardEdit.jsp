<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>게시글 수정하기</title>
	<link href="boardWrite.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="Header.jsp" %>
	
	<div id="wholeContainer">
		<div class="side"></div>

	
		<div class="container">
		<div>
			<h2>게시글 수정하기</h2>
		</div>
		
			<form action="#">
				<div class="boardWrite">
					<table class="writeTable">
						<colgroup>
							<col style="width: 10%">
							<col style="width: 10%">
							<col style="width: 80%">
						</colgroup>
						<tr>
							<td>
								<select>
									<option>맛집</option>
									<option>명소</option>
									<option>축제</option>
								</select>
							</td>
							<td style="text-align: center;">제목</td>
							<td>
								<input type="text">
							</td>
						</tr>
						<tr>
							<td colspan="3">
								<textarea></textarea>
							</td>
						</tr>
						<tr>
							<td>
								<input type="file">
							</td>
						</tr>
					</table>
				</div>
				<br/>
				<div class="btn">
					<input type="button" id="toList" value="목록으로" onclick="location.href='boardList.jsp'">
					<input type="submit" value="작성 완료">
				</div>
			</form>
		</div>
		
		<div class="side"></div>
	</div>
	
	<br/>
	<%@ include file="Footer.jsp" %>
</body>
</html>