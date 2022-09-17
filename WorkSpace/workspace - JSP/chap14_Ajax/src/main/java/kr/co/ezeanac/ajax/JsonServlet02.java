package kr.co.ezeanac.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@WebServlet("/json2")
public class JsonServlet02 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		JSONObject totalObject = new JSONObject();		//배열 저장할 JSONObject 선언
		JSONArray membersArray = new JSONArray();		//JSON 객체 저장
		
		JSONObject memberInfo = new JSONObject();		//회원 한명 정보가 들어가는 JSON객체 선언
		memberInfo.put("name", "이순신");
		memberInfo.put("age", "30");
		memberInfo.put("gender", "남자");
		memberInfo.put("nickname", "충무공");				//회원 정보를 name/value 쌍으로 저장
		membersArray.add(memberInfo);					//회원 정보를 다시 membersArray 배열에 저장
		
		memberInfo = new JSONObject();
		memberInfo.put("name", "신사임당");
		memberInfo.put("age", "40");
		memberInfo.put("gender", "여자");
		memberInfo.put("nickname", "오만원");	
		membersArray.add(memberInfo);
		
		totalObject.put("members", membersArray);
		
		String jsonInfo = totalObject.toJSONString();	//JsonObect를 문자열로 변환
		System.out.println(jsonInfo);
		
		out.print(jsonInfo);							//JSON 데이터를 브라우저로 전송
		
		
	}
}








