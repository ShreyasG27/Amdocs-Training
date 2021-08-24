package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.project.dao.ContactDAO;
import com.amdocs.project.dao.impl.ContactDAOIMPL;
import com.amdocs.project.model.Contact;

@WebServlet("/contactupdate")
public class ContactUpdate extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int contact_ID=Integer.parseInt(request.getParameter("contactid"));
		int user_ID=Integer.parseInt(request.getParameter("userid"));
		String email= request.getParameter("email");
		String name=request.getParameter("name");
		long phone=Long.parseLong(request.getParameter("phone"));
		String message=request.getParameter("message");
		
		
		
		
		
		ContactDAO dao1 = new ContactDAOIMPL();
		Contact cont= new Contact(contact_ID, user_ID, email, name,  phone,message);
		
		
		boolean stat= dao1.update(cont,contact_ID);
		if(stat)
		{
			response.sendRedirect("contactdisplay.jsp");
		}
		else {
			out.println("Contact could not be updated!! Try Again!");
		}
	}
}
