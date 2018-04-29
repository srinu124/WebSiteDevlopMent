package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FormTwoServlet extends HttpServlet {

	 public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		 String squal=req.getParameter("squal");
		 String sdis=req.getParameter("sdis");
		 HttpSession sess=req.getSession(false);
		 sess.setAttribute("squals", squal);
		 sess.setAttribute("sdis", sdis);
		 RequestDispatcher pach=req.getRequestDispatcher("form3.html");
		 pach.forward(req, res);
		 
	 }
}
