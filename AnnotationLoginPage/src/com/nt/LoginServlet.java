package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		pw.println("<body bgcolor=pink>");
		pw.println("<center>");
		pw.println("<h1>login success</h1><hr size=6 color=black>");
		pw.println(name);
		pw.println("<br>");
		pw.println(pwd);
		pw.println("<br>");
		
		pw.println("<a href=>Homepage</a>");
		pw.println("</center>");
		
	}
}
