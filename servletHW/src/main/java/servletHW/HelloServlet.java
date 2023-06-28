package servletHW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProc(req,resp);
	}
	
protected void doProc(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//Servlet -> web
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html; charset=utf-8");
			
			String name = req.getParameter("name");
			String english = req.getParameter("english");
			String otherLanguage[]=req.getParameterValues("otherLanguage");
			String opinion = req.getParameter("opinion");
			String age=req.getParameter("age"); 
			
			Research research = new Research(name,english,otherLanguage,opinion,age);
			req.setAttribute("research", research);
			
			req.getRequestDispatcher("server").forward(req, resp);
			
			/*
			 * PrintWriter pw = resp.getWriter(); pw.println("<html>");
			 * 
			 * pw.println("<head>"); pw.println("</head>");
			 * 
			 * 
			 * pw.println("<body>"); pw.println("<h1>���� ���� ���</h1>");
			 * pw.println("<h3>�̸�: "+name+"</h3>");
			 * 
			 * pw.println("<h3>����ȸȭ�� ���� ����: "+english+"</h3>"); if(otherLanguage!=null) {
			 * for(int i=0; i<otherLanguage.length;i++) {
			 * pw.println("<p>Ÿ ���� ���:"+otherLanguage[i]+"</p>"); } }
			 * pw.println("<h3>��������� ���� �ǰ� : " +opinion+"</h3>");
			 * pw.println("<p>���ɴ� : "+age+"</p>"); pw.println("</body>");
			 * 
			 * pw.println("</html>");
			 */
	}
	
}