package servletHW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		//��Ǯ�� // getAttribute�� ������Ʈ �̱⿡ Human���� ĳ��Ʈ ��ȯ
		Research research= (Research)req.getAttribute("research");
		
		PrintWriter pw = resp.getWriter();
		String name= research.getName();
		String english= research.getEnglish();
		String[] otherLanguage= research.getOtherLanguage();
		String opinion = research.getOpinion();
		String age = research.getAge();
		
		  pw.println("<html>");
		  
		  pw.println("<head>"); pw.println("</head>");
		  
		  
		  pw.println("<body>"); pw.println("<h1>���� ���� ���</h1>");
		  pw.println("<h3>�̸�: "+name+"</h3>");
		  
		  pw.println("<h3>����ȸȭ�� ���� ����: "+english+"</h3>"); if(otherLanguage!=null) {
		  for(int i=0; i<otherLanguage.length;i++) {
		  pw.println("<p>Ÿ ���� ���:"+otherLanguage[i]+"</p>"); } }
		  pw.println("<h3>��������� ���� �ǰ� : " +opinion+"</h3>");
		  pw.println("<p>���ɴ� : "+age+"</p>"); pw.println("</body>");
		  
		  pw.println("</html>");
		
			/*
			 * pw.println("<html>");
			 * 
			 * pw.println("<head>"); pw.println("</head>");
			 * 
			 * 
			 * pw.println("<body>"); pw.println("<h1>SampleServlet</h1>");
			 * pw.println("<p>����:"+research.toString()+"</p>");
			 * 
			 * pw.println("</body>");
			 * 
			 * pw.println("</html>");
			 */	}
	
}