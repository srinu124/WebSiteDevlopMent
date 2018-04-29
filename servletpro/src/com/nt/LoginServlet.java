package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
   res.setContentType("text/html");
   PrintWriter pw=res.getWriter();
  pw.println("welcome login servlet");   
	 
 }
}
