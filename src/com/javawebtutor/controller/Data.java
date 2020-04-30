package com.javawebtutor.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.javawebtutor.hibernate.util.HibernateUtil;
import com.javawebtutor.model.Inbox;
import com.javawebtutor.model.User;
import com.javawebtutor.service.InboxService;
import com.javawebtutor.service.LoginService;
import java.util.*;
//import antlr.collections.List;
public class Data extends HttpServlet{

	
	
	String uname;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		response.setHeader("Cache-Control","no-cache,no-store ,must-revalidate");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		
		 System.out.println(uname);
		 
		 if(session.getAttribute("username")!=null){
			 uname=(String)session.getAttribute("username");
				 out.print("welcome : "+ uname +"");
				}
				else{
				request.setAttribute("Error1","Plz Do login First");
				 response.sendRedirect("login.jsp");
				
					}
		 
		
		 Session sessio = HibernateUtil.openSession();
		 
		 sessio.beginTransaction();
		 
		 Criteria criteria =sessio.createCriteria(Inbox.class);
		 criteria.add(Restrictions.eq("Reciever",uname));
		 
		 List<Inbox> inbo=(List<Inbox>)criteria.list();
		 sessio.getTransaction().commit();
		 
		 out.print("<table align='left' width='70%' border='4' bgcolor='###FFF'>");
		 
		 out.print("<tr><th>SENDER</th><th>MESSAGE</th><th>DATE OF RECIEVING</th><th>Delete</th></tr>");
		 
		 
		 for(Inbox i : inbo)
		 {
			 
			 out.print("<tr>");
				out.print("<td>" +i.getSender() + "</td>");
				out.print("<td>" + i.getMsg() + "</td>");
				out.print("<td>" + i.getDat() + "</td>");
				out.print("<td><a href='DeleteServlet'>Delete</a></td>");
			// System.out.println(i.getSender());
			// System.out.println(i.getMsg());
			 out.print("</tr>");
		 }out.print("<br>");
		 out.print("<br>");
		 
		 out.print("</table>");
			out.print("<table align='right' width='20%' border='5'>");
			out.print("<tr><td><a href='compose.jsp'>COMPOSE</a></td></tr>");
			out.print("<tr><td><a href='login.jsp'>HOME</a></td></tr>");
			out.print("<tr><td><a href='LogoutServlet'>LOGOUT</a></td></tr>");
			//out.print("<tr><td><a href='DeleteServlet'>Delete</a></td></tr>");
			
			out.print("</table>");
		
	/*	// User user = (User) session.getAttribute("user");
		out.print("<b>Welcome : "+ uname +"</b>");
		
		InboxService inboxService = new InboxService();
		 List<Inbox> list = inboxService.getListOfUsers();
		
				
				
		
			out.print("<table align='left' width='50%' border='4' bgcolor='###FFF'>");
			out.print("<tr><th>SENDER</th><th>MESSAGE</th><th>DATE OF RECIEVING</th><th>Delete</th></tr>");
			 for (Inbox u : list) {
				 System.out.println(u.getReciever());
				out.print("<tr>");
				out.print("<td>" +u.getReciever() + "</td>");
				out.print("<td>" + u.getMsg() + "</td>");
				out.print("<td>" + u.getDat() + "</td>");
				//out.print("<td>" + in + "</td>");
				//out.print("<td>" DeleteServlet.Del`"</td>");
			//	out.print("<td><a href='DeleteServlet' >Delete</a></td>");
			
				out.print("</tr>");
			
			}
			out.print("</table>");
			out.print("<table align='right'width='40%'>");
			out.print("<tr><td><a href='Compose.html'>COMPOSE</a></td></tr>");
			out.print("<tr><td><a href='InboxServlet'>INBOX</a></td></tr>");
			out.print("<tr><td><a href='LogoutServlet'>LOGOUT</a></td></tr>");
			//out.print("<tr><td><a href='DeleteServlet'>Delete</a></td></tr>");
			
			out.print("</table>");
		
	}
*/
}
}
