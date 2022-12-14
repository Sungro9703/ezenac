package kr.co.ezenac.urlpatttern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//디렉터리 이름만 일치하는 URL 패턴
//@WebServlet("/order/*")
public class UrlTest02 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//컨텍스트 이름만 가져옴
		String context = request.getContextPath();
		System.out.println("컨텍스트 이름: " + context);
		//전체 url 가져옴
		String url = request.getRequestURL().toString();
		System.out.println("전체 URL: " + url);
		//서블릿 매핑 이름만 가져옴
		String mapping = request.getServletPath();
		System.out.println("서블릿 매핑 이름: " + mapping);
		// URI 가져옴
		String uri = request.getRequestURI();
		System.out.println("URI: " + uri);
		
		out.print("<html><body bgcolor = 'blue' >");
		out.print("<b>URL TEST02 입니다.</b>");
		out.print("</html></body>");
	}
}
