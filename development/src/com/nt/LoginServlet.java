package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 System.out.println("doget method is executed");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("srinu u r executed in browser dogetmethod");
	   
		 int a=10;
		 int b=20;
		LoginServlet l=new LoginServlet();
	  
	}
	

}
