package kr.co.ezenac02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("doGet(로그인) 메서드 호출");
		request.setCharacterEncoding("utf-8");	// 전송된 데이터를 utf-8으로 인코딩
		
		// getParameter()를 이용해 <input>의 name속성 값으로 전송된 value를 받아옴
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		
		System.out.println("아이디" + userId);
		System.out.println("비밀번호" + userPw);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
