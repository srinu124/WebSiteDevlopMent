package com.nt;

import java.io.IOException;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
public class FormOneServlet extends HttpServlet {
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
    String name=req.getParameter("sname");
    String age=req.getParameter("sage");
     HttpSession sess=req.getSession();
     sess.setAttribute("sname", name);
     sess.setAttribute("sage", age);
     RequestDispatcher disp=req.getRequestDispatcher("form2.html");
     disp.forward(req, res);
  }


}
