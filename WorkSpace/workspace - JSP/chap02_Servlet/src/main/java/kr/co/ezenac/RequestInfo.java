package kr.co.ezenac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/requestInfo")
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트가 요청한 파라미터 값들을 인코딩해주는 코드
		request.setCharacterEncoding("utf-8");
		System.out.println("request.getCharacterEncoding() = " + request.getCharacterEncoding());
		//요청방법
		System.out.println("request.getMethod() = " + request.getMethod());
		//프로토콜 종류와 버전
		System.out.println("request.getProtocol() = " + request.getProtocol());
		//서버이름 또는 ip주소
		System.out.println("request.getServerName() = " + request.getServerName());
		//서버 포트
		System.out.println("request.getServerPort() = " + request.getServerPort());
		//요청 URL
		System.out.println("request.getRequestURL() = " + request.getRequestURL());
		//요청 URI
		System.out.println("request.getRequestURI() = " + request.getRequestURI());
		//context path
		System.out.println("request.getContextPath() = " + request.getContextPath());
		//servlet path
		System.out.println("request.getServletPath() = " + request.getServletPath());
		//queryString
		System.out.println("request.getQueryString() = " + request.getQueryString());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
