package com.javawebtutor.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javawebtutor.model.User;
import com.javawebtutor.service.LoginService;


public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

	 String userId = request.getParameter("userId");	
	 String password = request.getParameter("password");
	 LoginService loginService = new LoginService();
	 boolean result = loginService.authenticateUser(userId, password);
	 User user = loginService.getUserByUserId(userId);
	 if(result == true){
		 request.getSession().setAttribute("user", user);	
		 
		 HttpSession session=request.getSession();
			session.setAttribute("username",userId);
		
			//RequestDispatcher rd=request.getRequestDispatcher("compose.jsp");
			//rd.include(request, response);
		 
		 response.sendRedirect("compose.jsp");
	 }
	 else{
		 response.sendRedirect("error.jsp");
	 }
}

}