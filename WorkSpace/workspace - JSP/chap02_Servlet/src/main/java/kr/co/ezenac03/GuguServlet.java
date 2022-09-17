package kr.co.ezenac03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugu")
public class GuguServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		int dan;
		
		if(request.getParameter("dan") != "") {
			dan = Integer.parseInt(request.getParameter("dan"));
			
			out.print("<html>");
			out.print("<body>");
			
			out.print("<table border=1 width=800 align=center>");
			out.print("<tr align=center bgcolor='#FFFF66'>");
			out.print("<td colsapn=2>"+ dan + "단 출력" + "</td>");
			
			for(int i=1; i<10; i++) {
				if(i % 2 == 0) {
					out.print("<tr align=center bgcolor='#ACFA58'>");
				} else {
					out.print("<tr align=center bgcolor='#81BEF7'>");
				}
				out.print("<td width=400>");
				out.print(dan + "*" + i);
				out.print("</td>");
				out.print("<td width=400>");
				out.print(dan * i);
				out.print("</td>");
				out.print("</tr>");
			}
			
		} else {
			out.print("<h3>숫자를 입력해 주세요.</h3> <a href='http://localhost:8080/chap02_Servlet/gugudan.html'>단 입력</a>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
