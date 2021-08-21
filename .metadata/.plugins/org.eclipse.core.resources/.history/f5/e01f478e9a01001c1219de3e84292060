package com.amdocs.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;

@WebServlet("/register")
public class RegistrationController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		int user_ID = Integer.parseInt(request.getParameter("userid"));
		String name = request.getParameter("name");
		String email=request.getParameter("email");
		String password= request.getParameter("password");
		String address = request.getParameter("address");
		long phone = Long.parseLong(request.getParameter("phone"));
		String upload_Image= request.getParameter("image");
		String date=request.getParameter("date");
		
		UserDAO dao = new UserDAOImpl();
		User user = new User(user_ID, name,email,password, address, phone,upload_Image,date);
		
		boolean status = dao.saveUser(user);
		
		if(status)
			out.println("User Saved Successfully");
		else
			out.println("Try Again");
	}
}
