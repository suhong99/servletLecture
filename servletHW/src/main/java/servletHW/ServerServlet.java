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
		
		//짐풀러 // getAttribute는 오브젝트 이기에 Human으로 캐스트 변환
		Research research= (Research)req.getAttribute("research");
		
		PrintWriter pw = resp.getWriter();
		String name= research.getName();
		String english= research.getEnglish();
		String[] otherLanguage= research.getOtherLanguage();
		String opinion = research.getOpinion();
		String age = research.getAge();
		
		  pw.println("<html>");
		  
		  pw.println("<head>"); pw.println("</head>");
		  
		  
		  pw.println("<body>"); pw.println("<h1>설문 조사 결과</h1>");
		  pw.println("<h3>이름: "+name+"</h3>");
		  
		  pw.println("<h3>영어회화에 대한 관심: "+english+"</h3>"); if(otherLanguage!=null) {
		  for(int i=0; i<otherLanguage.length;i++) {
		  pw.println("<p>타 관심 언어:"+otherLanguage[i]+"</p>"); } }
		  pw.println("<h3>영어수업에 대한 의견 : " +opinion+"</h3>");
		  pw.println("<p>연령대 : "+age+"</p>"); pw.println("</body>");
		  
		  pw.println("</html>");
		
			/*
			 * pw.println("<html>");
			 * 
			 * pw.println("<head>"); pw.println("</head>");
			 * 
			 * 
			 * pw.println("<body>"); pw.println("<h1>SampleServlet</h1>");
			 * pw.println("<p>정보:"+research.toString()+"</p>");
			 * 
			 * pw.println("</body>");
			 * 
			 * pw.println("</html>");
			 */	}
	
}
