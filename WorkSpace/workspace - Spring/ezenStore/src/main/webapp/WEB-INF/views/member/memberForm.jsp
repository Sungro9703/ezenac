<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" /> 
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script type="text/javascript">
		function fn_duplicatecheck() {
			let _id = $("#_member_id").val()
			if (_id == '') {
				alert("ID를 입력하세요.")
				return
			}
			$.ajax({
				type: "post",
				url: "${contextPath}/member/duplicateCheck.do",
				dataType: "text",
				data: {id: _id},
				success: function (data, textStatus) {
					if (data == 'false') {
						alert("사용할 수 있는 ID입니다.")
						$('#btnDuplicateCheck').prop("disabled", true)
						$('#_member_id').prop("disabled", true)
						$('#member_id').val(_id)
					}
					else {
						alert("사용할 수 없는 ID입니다.")
					}
				},
				error: function (data, textStatus) {
					alert("에러가 발생했습니다.")
				}
			})
	
		}
		
		$(document).ready(function () {
		    setDateBox();
		  });

		  // select box 연도 , 월 표시
		  function setDateBox() {
		    var dt = new Date();
		    var year = "";
		    var com_year = dt.getFullYear();

		    // 년
		    $("#member_birth_y").append("<option value=''>년도</option>");

		    // 올해 기준으로 -50년부터 +1년을 보여준다.
		    for (var y = (com_year - 50); y <= (com_year); y++) {
		      $("#member_birth_y").append("<option value='" + y + "'>" + y + "</option>");
		    }

		    // 월
		    var month;
		    $("#member_birth_m").append("<option value=''>월</option>");
		    for (var i = 1; i <= 12; i++) {
		      $("#member_birth_m").append("<option value='" + i + "'>" + i + "</option>");
		    }

		    //
		    var day;
		    $("#member_birth_d").append("<option value=''>일</option>");
		    for (var i = 1; i <= 31; i++) {
		      $("#member_birth_d").append("<option value='" + i + "'>" + i + "</option>");
		    }

		  }
		  
		  function email_change(){
			  if(document.join.email.options[document.join.email.selectedIndex].value == '0'){
				   document.join.email2.disabled = true;
				   document.join.email2.value = "";
			  }
			  if(document.join.email.options[document.join.email.selectedIndex].value == '9'){
				   document.join.email2.disabled = false;
				   document.join.email2.value = "";
				   document.join.email2.focus();
			  } else{
			   document.join.email2.disabled = true;
			   document.join.email2.value = document.join.email.options[document.join.email.selectedIndex].value;
			  }
		}
		  

		  function sample4_execDaumPostcode() {
		        new daum.Postcode({
		            oncomplete: function(data) {
		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

		                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
		                var roadAddr = data.roadAddress; // 도로명 주소 변수
		                var extraRoadAddr = ''; // 참고 항목 변수

		                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
		                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
		                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
		                    extraRoadAddr += data.bname;
		                }
		                // 건물명이 있고, 공동주택일 경우 추가한다.
		                if(data.buildingName !== '' && data.apartment === 'Y'){
		                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                }
		                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
		                if(extraRoadAddr !== ''){
		                    extraRoadAddr = ' (' + extraRoadAddr + ')';
		                }

		                // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                document.getElementById('sample4_postcode').value = data.zonecode;
		                document.getElementById("sample4_roadAddress").value = roadAddr;
		                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
		                
		                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
		                if(roadAddr !== ''){
		                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
		                } else {
		                    document.getElementById("sample4_extraAddress").value = '';
		                }

		                var guideTextBox = document.getElementById("guide");
		                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
		                if(data.autoRoadAddress) {
		                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
		                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
		                    guideTextBox.style.display = 'block';

		                } else if(data.autoJibunAddress) {
		                    var expJibunAddr = data.autoJibunAddress;
		                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
		                    guideTextBox.style.display = 'block';
		                } else {
		                    guideTextBox.innerHTML = '';
		                    guideTextBox.style.display = 'none';
		                }
		            }
		        }).open();
		    }

	</script>	
</head>
<body>
	<h3>회원가입정보 입력</h3>
	<form name="join" action="${contextPath}/member/addMember.do" method="post">
		<div id="detail_table">
			<table>
				<tbody>
					<tr class="dot_line">
						<td class="fixed_join">아이디</td>
						<td colspan="2">
							<input type="text" name="_member_id"  id="_member_id" size="20"/>
							<input type="hidden" name="member_id" id="member_id" />
							<input type="button" id="btnDuplicateCheck" value="중복체크" onclick="fn_duplicatecheck()" />
						</td>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">비밀번호</td>
						<td>
							<input type="password" name="member_pw"  id="member_pw" size="20"/>
						</td>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">이름</td>
						<td>
							<input type="text" name="member_name"  id="member_name" size="20"/>
						</td>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">성별</td>
						<td>
							<label><input type="radio" name="member_gender" value="female"/>여성</label>
							<label><input type="radio" name="member_gender" value="male"/>남성</label>
						</td>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">생년월일</td>
						<td>
							<select name="member_birth_y" id="member_birth_y" title="년" class="date_select"></select>년
							<select name="member_birth_m" id="member_birth_m" title="월" class="date_select"></select>월
							<select name="member_birth_d" id="member_birth_d" title="일" class="date_select"></select>일
							<label><input type="radio" name="member_birth_gn" value="solar"/>양력</label>
							<label><input type="radio" name="member_birth_gn" value="lunar"/>음력</label>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">휴대폰번호</td>
						<td>
							<select id="hp1" name="hp1">
								<option>010</option>
							</select>
							-&nbsp<input type="text" id="hp2" name="hp2" size="4">
							-&nbsp<input type="text" id="hp3" name="hp3" size="4"><br/>
							<label><input type="checkbox"> BeyondTrust에서 발송하는 SMS 소식을 수신합니다.</label>
						</td>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">
							이메일<br/>
							(e-mail)
						</td>
						<td>
							<input type="text" id="email1" name="email1">@
							<input type="text" id="email2" name="email2" disabled>
							<select name="email" onchange="email_change()" >
								<option value="0">선택하세요</option>
								<option value="9">직접입력</option>
								<option value="hanmail.net">hanmail.net</option>
								<option value="naver.com">naver.com</option>
								<option value="yahoo.co.kr">yahoo.co.kr</option>
								<option value="hotmail.com">hotmail.com</option>
								<option value="paran.com">paran.com</option>
								<option value="nate.com">nate.com</option>
								<option value="google.com">google.com</option>
								<option value="gmail.com">gmail.com</option>
								<option value="empal.com">empal.com</option>
								<option value="korea.com">korea.com</option>
								<option value="freechal.com">freechal.com</option>
							</select><br/>
							<label><input type="checkbox"> BeyondTrust에서 발송하는 e-mail을 수신합니다.</label>
						</td>
					</tr>
					<tr class="dot_line">
						<td class="fixed_join">주소</td>
						<td>
							<input type="text" id="sample4_postcode" onclick="sample4_execDaumPostcode()"> 우편번호검색<br/>
							지번 주소:<br/>
							<input type="text" id="sample4_roadAddress" size="30"><br/>
							도로명 주소:<br/>
							<input type="text" id="sample4_jibunAddress" size="30"><br/>
							나머지 주소:<br/>
							<input type="text" size="30">
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		
		<div class="clear">
			<br />
			<table align="center">
				<tr>
					<td>
						<input type="submit" value="회원가입" />
						<input type="reset" value="다시입력" /> 
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>














