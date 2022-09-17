package kr.co.ezenac.member04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/member3")
public class MemberServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		
		String command = request.getParameter("command");
		if(command != null && command.equals("addMember")) {
			String _id = request.getParameter("id");
			String _pwd = request.getParameter("pwd");
			String _name = request.getParameter("name");
			String _email = request.getParameter("email");
			
			MemberVO vo = new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			
			dao.addMember(vo);
		}
		// command값이 delMember인 경우 id를 가져와 SQL문 전달
		else if (command != null && command.equals("delMember")) {
			String id = request.getParameter("id");
			dao.delMember(id);
		}
		
		
		List<MemberVO> list = dao.listMembers();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
		
		for(int i=0; i<list.size(); i++) {
			MemberVO memberVO = list.get(i);		//조회한 회원정보를 for문 <tr>태그 이용해 출력
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoindate();
			out.print("<tr><td>" +id+" </td><td>"
								 +pwd+" </td><td>"
								 +name+" </td><td>"
								 +email+" </td><td>"
								 +joinDate+ "</td><td>"		//삭제를 클릭하면 command 값과 회원 id를 서블릿으로 전송
								 + "<a href='chap03_Servlet/member3?command=delMember&id="+id+" '>삭제</a></td></tr>");			
		}
		
		
		out.print("</table></body>");
		out.print("</html>");
	}
}
