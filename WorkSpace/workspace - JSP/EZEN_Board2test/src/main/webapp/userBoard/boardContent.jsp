<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>게시글 상세보기</title>
	<link href="boardContent.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="Header.jsp" %>

	<div id="wholeContainer">
		<div class="side"></div>
	
		<div class="container">
			<div>
				<h2 style="color: #9bb7d6;" >유저 게시판</h2>
			</div>
			<div class="boardWrite">
				<table class="writeTable">
					<colgroup>
						<col style="width: 70%">
						<col style="width: 30%">
					</colgroup>
					<tr>
						<td>제목</td>
						<td>
							홍길동 2022-06-10 16:30:30 조회: 1
						</td>
					</tr>
					
					<tr>
						<td colspan="2" style="text-align: right;">
							<input type="button" value="수정하기" onclick="location.href='boardEdit.jsp" />
							<input type="button" value="삭제하기"/>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" style="height: 500px;">
							<div class="boardContent"></div>
						</td>
					</tr>
					
					<tr>
						<td colspan="2" style="text-align: center;">
							<input type="button" value="추천" />
						</td>
					</tr>
				</table>
			</div>
			<br/>
			
			<div style="text-align: center;">
				<input type="button" id="toList" value="목록으로" onclick="location.href='boardList.jsp'">
			</div>
			
			<div class="replyBox">
				<div><h2>댓글</h2></div>
				<div>
					<div class="replyName"><h4>홍길동</h4></div>
					<div class="replyContent">재미있을 것 같아요!</div>
					<div class="replySpan">
						<span class="replyDate">2022-06-10 16:30:30</span>
						<span class="replybtn">
							<input type="button" value="댓글 수정" />
							<input type="button" value="댓글 삭제" />
						</span>
					</div>
				</div>
			</div>
			
		</div>
	
		<div class="side"></div>
	</div>
	<br/>
	
	<%@ include file="Footer.jsp" %>
</body>
</html>