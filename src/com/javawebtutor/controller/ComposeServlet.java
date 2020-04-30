package com.javawebtutor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.javawebtutor.controller.SendMessage;
import com.javawebtutor.model.Inbox;
import com.javawebtutor.model.User;
import com.javawebtutor.service.RegisterService;
public class ComposeServlet extends HttpServlet {

	
	//public void doGet(HttpServletRequest request, HttpServletResponse response, Object parse)
	//		throws ServletException, IOException {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		
			
		String sender=(String)session.getAttribute("username");
		System.out.println(sender);
		
		String reciever=request.getParameter("reciever_id");
		System.out.println(reciever);
		String msg=request.getParameter("message");
		System.out.println(msg);
		
		 java.util.Date sqdate=Calendar.getInstance().getTime();
			java.sql.Date dat =new java.sql.Date(sqdate.getTime());

			DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String text = df.format(dat);
			
			
			
	
			
			 System.out.println(reciever);
			// System.out.println(userz.getUserId());
			
				
				Inbox inbo =new Inbox(sender,reciever,msg,text);
		
			 SendMessage sm = new SendMessage();
			 boolean result = sm.register(inbo);
			 
			 if(result) {
			out.print("Message Sucessfully Sent");
			RequestDispatcher rd=request.getRequestDispatcher("compose.jsp");
			rd.include(request, response);
		}
		else{
			out.print("Sorry,Message was not sent");
			RequestDispatcher rd=request.getRequestDispatcher("compose.jsp");
			rd.include(request, response);
		}
			}
			
			
			
		
		//int i=SendMessage.sendMsg(sender,reciever,msg);
		//if(i>0){
			
	            //int j=parse.Integer(reciever);
				//if(j>0){
		
		
	}


