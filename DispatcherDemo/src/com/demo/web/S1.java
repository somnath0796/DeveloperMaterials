package com.demo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String name =request.getParameter("name");
		if(name.equals("james")){
			rd = request.getRequestDispatcher("/S2");
			request.setAttribute("data", "Valid James");
			rd.forward(request, response);
		}else{
			rd = request.getRequestDispatcher("/S3");
			request.setAttribute("data", "Invalid James");
			rd.forward(request, response);
		}
		
		
	}

}
