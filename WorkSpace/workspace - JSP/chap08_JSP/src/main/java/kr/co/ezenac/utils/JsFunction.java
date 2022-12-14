package kr.co.ezenac.utils;

import javax.servlet.jsp.JspWriter;

public class JsFunction {
	// 메시지 알림창을 띄우고 명시한 URL로 이동
	public static void alertLocation(String msg, String url, JspWriter out) {
		try {
			String script = ""
							+"<script>"
							+"		alert( "+msg+")"
							+"		location.href= '"+url+"';"
							+"</scrupt>";
			out.print(script);
		} catch (Exception e) {}
	}
	
	//메시지 알림창을 띄우고 이전 페이지로 돌아감 (ex.로그인에 실패했습니다.)
	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = ""
							+"<script>"
							+"		alert( "+msg+")"
							+"		history.back();"
							+"</scrupt>";
			out.print(script);
		} catch (Exception e) {}
	}
}
