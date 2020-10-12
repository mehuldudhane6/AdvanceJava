package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Assign31_2")
public class Assign31_2 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession s=request.getSession(true);
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		 // ArrayList<Object> al=new ArrayList<Object>();
		 // String bn=(String) s.getAttribute("bookno");
		  out.print("mehul");
//		  if(bn!=null)
//		  {
//			  al.add(bn);
//		 }
//		  String name=(String) s.getAttribute("bookname");
//		  if(name!=null)
//		  {
//			  al.add(name);
//		  }
//		  String aut=(String) s.getAttribute("author");
//		  if(aut!=null)
//		  {
//			  al.add(aut);
//		  }
//		  int price=(int) s.getAttribute("price");
//		  
//		  if(price!=0)
//		  {
//			  al.add(price);
//		  }
//		  String pub=(String) s.getAttribute("publisher");
//		  if(pub!=null)
//		  {
//			  al.add(pub);
//		  }
//		  String date=(String) s.getAttribute("date");
//		  if(date!=null)
//		  {
//			  al.add(date);
//		  }
//		  
//		  for(Object arr:al)
//		  {
//			  out.print(arr);
//		  }
	}

}
