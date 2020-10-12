package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;


@WebServlet("/Assign31_1")
public class Assign31_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession(true);
		
		int no=Integer.parseInt(request.getParameter("bookno")); 
		s.setAttribute("item1", no);
		 String bn=request.getParameter("bookname");
		 s.setAttribute("item2", bn);
		 String aut=request.getParameter("author");
		 s.setAttribute("item3", aut);
		 int pri=Integer.parseInt(request.getParameter("price"));
		 s.setAttribute("item4", pri);
		 String publish=request.getParameter("publisher");
		 s.setAttribute("item5", publish);
		 String d=request.getParameter("date");
		 s.setAttribute("item6", d);
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_jdbc","root","root");
			PreparedStatement s1=(PreparedStatement) con.prepareStatement("insert into book values(?,?,?,?,?,?)");
			s1.setInt(1, no);
			s1.setString(2, bn);
			s1.setString(3, aut);
			s1.setInt(4, pri);
			s1.setString(5, publish);
			s1.setString(6, d);
			int q=s1.executeUpdate();
			out.print("<h1><a href='Assign31_2.java'>Book list</a></h1>");
			//out.print("mehul");
			out.flush();
			out.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
	}

}
