package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.project.dao.CourseDAO;
import com.amdocs.project.dao.impl.CourseDAOIMPL;
import com.amdocs.project.model.Course;

@WebServlet("/courseuser")
public class CourseEnrol extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		int course_ID=Integer.parseInt(request.getParameter("courseid"));
		int user_ID=Integer.parseInt(request.getParameter("userid"));
		
		CourseDAO dao = new CourseDAOIMPL();
		
		
		
		boolean status = dao.enrol(user_ID,course_ID);
		
		if(status)
			response.sendRedirect("courseuser.jsp");
		else
			out.println("Try Again");
		
		
	
	}
}

