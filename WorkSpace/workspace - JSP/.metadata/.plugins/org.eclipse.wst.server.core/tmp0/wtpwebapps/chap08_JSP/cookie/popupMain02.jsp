<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String popupMode = "on"; 
	
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies) {
			String cookieName = c.getName();
			String cookieValue = c.getValue();
			if(cookieName.equals("Popupclise")) {
				popupMode = cookieValue;
			}
		}
	}

%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>쿠키를 이용한 팝업 관리</title>
	<style type="text/css">
		div#popup {
			position: absolute;
			top: 100px;
			left: 50px;
			color: yellow;
			width: 270px;
			height: 100px;
			background-color: gray;
		}
		div#popup>div {
			position: relative;
			background-color: #ffffff;
			top: 0px;
			border: 1px solid gray;
			padding: 10px;
			color: black;
		}
	
	</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#closeBtn').click(function() {	/* 닫기 버튼을 누르면*/
				$('#popup').hide();				/* 팝업창을 숨김 처리*/
				/* [오늘 하루 열지 않음]을 체크했는지 확인하여
				   쿠키를 설정 --popupCookie.jsp를 실행
				*/
				// id가 inactiveToday이면서 checked 체크박스 					/ 값을 읽어옴
				let chkVal = $('input:checkbox[id=inactiveToday]:checkde').val();
				
				// jQuery의 ajax() 함수: 비동기 HTTP 요청을 보내는 함수
				$.ajax({						//4) 비동기 요청 보냄
					url: './popupCookie.jsp',	//1) 요청을 보낼 페이지의 URL
					type: 'get',				//2) get, post 등 http 메서드 지정
					data: {inactiveToday: chkVal}, //3) 서버로 보낼 데이터
					dataType:"text",			//5) 서버로부터 받을 응답 데이터의 타입은 일반 텍스트
					success: function(resData){	// 6) 요청 성공 시 실행할 롤백 함수
						if(resData != '')		//7) 응답 데이터가 있다면
							location.reload()	//8) 페이지 새로고침
					}
				})
			})
			
		})
	</script>
</head>
<body>
	<h2>팝업 메인 페이지</h2>
	<%
		for (int i=1; i<=10; i++) {
			out.print("현재 팝업창은 " + popupMode+ "상태입니다.<br/>");
		}
		if (popupMode.equals("on")) {		/* 팝업 창 표시 */
	%>
		<div id="popup">
			<h2 align="center">공지사항 팝업입니다.</h2>
			<div align="right">
				<form action="#" name="popFrm">
					<input type="checkbox" id="inactiveToday" value="1" />하루동안 열지 않음
					<input type="button" value="닫기" id="closeBtn" />
				</form>
			</div>
		</div>
	<% 
		}
	%>
</body>
</html>