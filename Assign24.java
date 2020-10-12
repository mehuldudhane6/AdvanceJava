package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Assign24")
public class Assign24 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter p=response.getWriter();
		 String x=request.getParameter("first");
		 String y=request.getParameter("second");
		 String a=request.getParameter("add");
		 String s=request.getParameter("sub");
		 String m=request.getParameter("mult");
		 String d=request.getParameter("div");
		 if(a!=null)
		 {
		 if(a.equals("on"))
		 {
			 int res=Integer.parseInt(x)+Integer.parseInt(y);
			 p.print("<h1>"+"result="+res+"</h1>");
		 }
		 }
		 if(d!=null)
		 {
		 if(d.equals("on"))
		 {
			 int res=Integer.parseInt(x)/Integer.parseInt(y);
			 p.print("<h1>"+"result="+res+"</h1>");
		 }
		 }
		 if(s!=null)
		 {
		 if(s.equals("on"))
		 {
			 int res=Integer.parseInt(x)-Integer.parseInt(y);
			 p.print("<h1>"+"result="+res+"</h1>");
		 }
		 }
		 if(m!=null)
		 {
		 if(m.equals("on"))
		 {
			 int res=Integer.parseInt(x)*Integer.parseInt(y);
			 p.print("<h1>"+"result="+res+"</h1>");
		 }
		 }
		 
	}

}
