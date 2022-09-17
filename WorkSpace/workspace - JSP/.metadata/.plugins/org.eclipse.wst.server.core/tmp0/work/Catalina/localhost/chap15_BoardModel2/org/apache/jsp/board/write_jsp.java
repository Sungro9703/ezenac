/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-27 07:40:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>파일 첨부형 게시판</title>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  	function validateForm(form) {		//폼내용 검증\r\n");
      out.write("		if (form.name.value == \"\") {\r\n");
      out.write("			alert(\"작성자를 입력하세요.\")\r\n");
      out.write("			form.name.focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}  		\r\n");
      out.write("		if (form.title.value == \"\") {\r\n");
      out.write("			alert(\"제목을 입력하세요.\")\r\n");
      out.write("			form.title.focus()\r\n");
      out.write("			return false\r\n");
      out.write("		}\r\n");
      out.write("  		if (form.content.value == \"\") {\r\n");
      out.write("  			alert(\"내용을 입력하세요.\")\r\n");
      out.write("  			form.content.focus()\r\n");
      out.write("  			return false\r\n");
      out.write("  		}\r\n");
      out.write("  		if (form.pass.value == \"\") {\r\n");
      out.write("  			alert(\"비밀번호를 입력하세요.\")\r\n");
      out.write("  			form.pass.focus()\r\n");
      out.write("  			return false\r\n");
      out.write("  		}  		\r\n");
      out.write("	}\r\n");
      out.write("  	\r\n");
      out.write("  </script>  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2> 파일 첨부형 게시판 - 글쓰기</h2>\r\n");
      out.write("	<form action=\"../board/write.do\" name=\"writeFrm\" method=\"post\" enctype=\"multipart/form-data\"\r\n");
      out.write("	      onsubmit=\"return validateForm(this)\">\r\n");
      out.write("		<table border=\"1\" width=\"90%\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>작성자</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type=\"text\" name=\"name\" style=\"width: 150px;\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>제목</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type=\"text\" name=\"title\" style=\"width: 90%\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>내용</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<textarea name=\"content\" style=\"width: 90%; height: 100px;\"></textarea>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>	\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>첨부파일</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type=\"file\" name=\"ofile\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>	\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>비밀번호</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type=\"password\" name=\"pass\" style=\"width: 100px\" />\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>					\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\" align=\"center\">\r\n");
      out.write("					<button type=\"submit\">작성 완료</button>\r\n");
      out.write("					<button type=\"reset\">다시 입력</button>\r\n");
      out.write("					<button type=\"button\" onclick=\"location.href='../board/list.do'\">목록 보기</button>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>		\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
