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

@WebServlet("/admindel")
public class AdminDelete extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int admin_ID=Integer.parseInt(request.getParameter("adminid"));
	
		
		
		
		
		AdminDAO dao1 = new AdminDAOIMPL();
		
		
		
		boolean stat= dao1.delete(admin_ID);
		if(stat)
		{
			response.sendRedirect("admin.jsp");
		}
		else {
			out.println("admin could not be deleted!! Try Again!");
		}
	}
}
