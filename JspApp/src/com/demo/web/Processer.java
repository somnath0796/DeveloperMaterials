package com.demo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Processer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		UserDao dao = new UserDao();
		User user = dao.getUserByName(name);
		if(user.getUserName() != null){
			if(user.getPassword().equals(password)){
				RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
				request.getSession().setAttribute("name", name);
				rd.forward(request, response);
			} else {
				response.sendRedirect("failure.jsp");
			}
		}else{
			response.sendRedirect("failure.jsp");
		}
	}

}
