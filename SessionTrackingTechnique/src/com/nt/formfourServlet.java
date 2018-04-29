package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class formfourServlet extends HttpServlet {
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  res.setContentType("text/html");
	  PrintWriter pw=res.getWriter();
	  String s=req.getParameter("name");
	  String s1=req.getParameter("name1");
      String s2=req.getParameter("t1");
	  String s3=req.getParameter("cast");
	  String s4=req.getParameter("day");
	  String s5=req.getParameter("mont");
	  String s6=req.getParameter("year");
	  String s7=req.getParameter("t3");
	  String s8=req.getParameter("city");
	  String s9=req.getParameter("state");
	  String s10=req.getParameter("quals");
	  String s11=req.getParameter("per");
	  String s12=req.getParameter("univer");
	  HttpSession ses=req.getSession(false);
	 pw.println("student name:"+ses.getAttribute("sname"));
	 pw.println("<br>");
	 pw.println("student age:"+ses.getAttribute("sage"));
	 pw.println("<br>");
	 pw.println("student qualification:"+ses.getAttribute("squals"));
	 pw.println("<br>");
	 pw.println("student disignation:"+ses.getAttribute("sdis"));
	 pw.println("<br>");
	 pw.println("student mailid:"+ses.getAttribute("hhh"));
	 pw.println("<br>");
	 pw.println("student mobilno:"+ses.getAttribute("iii"));
	 pw.println("<br>");
	 pw.println("employee firstname:"+s);
	 pw.println("<br>");
	 pw.println("employee lastname:"+s1);
	 pw.println("<br>");
	 pw.println("gender:"+s2);
	 pw.println("<br>");
	 pw.println("cast:"+s3);
	 pw.println("<br>");
	 pw.println("date :"+s4);
	 pw.println("<br>");
	 pw.println("month:"+s5);
	 pw.println("<br>");
	 pw.println("year:"+s6);
	 pw.println("<br>");
	 pw.println("employee adress:"+s7);
	 pw.println("<br>");
	 pw.println("city:"+s8);
	 pw.println("<br>");
	 pw.println("state:"+s9);
	 pw.println("<br>");
	 pw.println("qualification:"+s10);
	 pw.println("<br>");
	 pw.println("percentage"+s11);
	 pw.println("<br>");
	 pw.println("univercity:"+s12);
	  
	  
	  
  }
}
