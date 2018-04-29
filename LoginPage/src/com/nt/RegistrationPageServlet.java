package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationPageServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	 
	String s=req.getParameter("uname");
	String s1=req.getParameter("pwd");
	String s2=req.getParameter("mdno");
	RequestDispatcher dis=req.getRequestDispatcher("details.jsp");
	dis.forward(req, res);
}
}
