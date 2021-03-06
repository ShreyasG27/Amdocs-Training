package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.project.dao.AdminDAO;
import com.amdocs.project.dao.impl.AdminDAOIMPL;
import com.amdocs.project.model.Admin;


@WebServlet("/adminadd")
public class AdminAdd extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int admin_ID=Integer.parseInt(request.getParameter("adminid"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password= request.getParameter("password");
		
		AdminDAO dao = new AdminDAOIMPL();
		Admin admin = new Admin(admin_ID,name,email, password );
		
		boolean status = dao.saveAdmin(admin);
		
		if(status)
			response.sendRedirect("admin.jsp");
			
			
		else
		{
			
			out.println("Try Again");
		}
	}
	
}
