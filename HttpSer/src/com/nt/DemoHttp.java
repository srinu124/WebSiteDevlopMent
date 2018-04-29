package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoHttp
 */
@WebServlet("/DemoHttp")
public class DemoHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   //System.out.println("dopost method");
   response.setContentType("text/html");
   PrintWriter pw=response.getWriter();
   String name=request.getParameter("name");
   String name1=request.getParameter("pwd");
   pw.println("<body bgcolor=green>name</body>");
   pw.println("<br>");
   pw.println(name1);
    if(name.equals("srinu")&&name1.equals("nenavath")) {
    pw.println("login is success");
    	pw.println("<br>");
    }else {
    	pw.println("login is fail");
    }
	}

}
