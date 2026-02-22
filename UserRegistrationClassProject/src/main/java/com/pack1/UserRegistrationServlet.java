package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
	  UserBean ub = new UserBean();
	  ub.setUname(req.getParameter("name"));
	  ub.setUpwd(req.getParameter("pass"));
	  ub.setUfname(req.getParameter("fname"));
	  ub.setUlname(req.getParameter("lname"));
	  ub.setUmail(req.getParameter("mail"));
	  ub.setUphone(req.getParameter("phone"));
	  
	  UserDao ud = new UserDao();
	  int rowCount = ud.insertData(ub);
	  
	  if(rowCount>0) {
		  req.setAttribute("msg", "User Registered Successfully!!!");
		  req.getRequestDispatcher("Register.jsp").forward(req, res);
		  }
	  else {
		  req.setAttribute("msg", "User couldn't register!!!");
		  req.getRequestDispatcher("Register.jsp").forward(req, res);
	  }
  }
}
