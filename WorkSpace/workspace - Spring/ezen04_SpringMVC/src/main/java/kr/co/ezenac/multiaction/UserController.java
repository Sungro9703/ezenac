package kr.co.ezenac.multiaction;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/*
 * 설정 파일의 
 */
public class UserController extends MultiActionController {
	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) 
				throws UnsupportedEncodingException {
		
		request.setCharacterEncoding("utf-8");
		String userId = "";
		String passwd = "";
		
		ModelAndView mav = new ModelAndView();
		userId = request.getParameter("userId");
		passwd = request.getParameter("passwd");
		
		//ModelAndView에 로그인 정보(모델)를 바인딩함
		mav.addObject("userId", userId);
		mav.addObject("passwd", passwd);
		
		//ModelAndView 객체에 포워딩할 JSP 뷰이름을 설정 
		mav.setViewName("result");
		
		
		return mav;
	}
	
	public ModelAndView memberInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		/* 회원 가입창에서 전송된 회원정보를 addObject() 이용해 ModelAndView 객체에 바인딩함  */
		mav.addObject("id", id);
		mav.addObject("pwd", pwd);
		mav.addObject("name", name);
		mav.addObject("email", email);
		mav.setViewName("memberInfo");		//memberInfo.jsp로 포워딩함
		
		return mav;
	}

}
















