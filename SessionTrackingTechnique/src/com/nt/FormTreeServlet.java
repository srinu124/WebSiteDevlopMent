package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FormTreeServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
     String ccc=req.getParameter("sid");
     String ccc1=req.getParameter("mdno");
     HttpSession sess=req.getSession();
     sess.setAttribute("hhh", ccc);
     sess.setAttribute("iii", ccc1);
     RequestDispatcher dis=req.getRequestDispatcher("form4.html");
     dis.forward(req, res);
    }
}
