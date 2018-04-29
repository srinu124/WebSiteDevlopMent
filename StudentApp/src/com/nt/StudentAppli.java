package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StudentAppli extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	 res.setContentType("text/html");
	 PrintWriter pw=res.getWriter();
	 String name=req.getParameter("sname");
	
	 String name2=req.getParameter("mdno");
	 String name3=req.getParameter("mailid");
	 String name4=req.getParameter("fname");
	 String name5=req.getParameter("mname");
	 String name6=req.getParameter("add");
	 pw.println(name);
	pw.println("<br>");
	 pw.println(name2);
		pw.println("<br>");
	 pw.println(name3);
		pw.println("<br>");
	 pw.println(name4);
		pw.println("<br>");
	 pw.println(name5);
		pw.println("<br>");
	 pw.println(name6);
		
		
	}
		public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
