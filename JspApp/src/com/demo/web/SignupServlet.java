package com.demo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(!name.equals(null)){
			if(!password.equals(null)){
				UserDao ud = new UserDao();
				User u = new User();
				u.setUserName(name);
				u.setPassword(password);
				
				boolean saved = ud.insertUser(u);
				if(saved){
					RequestDispatcher rd = request.getRequestDispatcher("/registersuccess.jsp");
					request.getSession().setAttribute("name", name);
				}
				
			}
		}
	}

}
