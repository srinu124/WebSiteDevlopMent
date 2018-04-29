package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	  res.setContentType("text/html");
	  PrintWriter pw=res.getWriter();
	  String name=req.getParameter("mailid");
	  String name1=req.getParameter("pass");
	  res.setHeader("location","https://stigentech.com:2096/");
	 /* if(name.equals("seenu.n@stigentech.com")&& name1.equals("Reset@123")) {
		 // pw.println("logini success");
		  //res.setHeader("location","http://www.facebook.com");
		
	  }else {
		  pw.println("login fail");
	  }
	*/  
  }
}
