package kr.co.ezenac.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set2")
public class SetCookieValue2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		DateFormat datrFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date d = new Date();
		String dateToStr = datrFormat.format(d);
		
		
		out.print("현재 시간: " + dateToStr);
		// Cookie 객체를 생성한 후 cookieTest 이름으로 한글 정보를 인코딩해서 쿠키에 저장
		Cookie c = new Cookie("cookieTest2", URLEncoder.encode("Servlet 쿠키 프로그래밍입니다", "utf-8"));
		
		c.setMaxAge(24*60*60);		//유효기간 설정 (하루)
		response.addCookie(c);		//생성된 쿠키를 브라우저로 전송
		
		
		out.print("현재 시간을 Cookie로 저장합니다.");
	}
}
