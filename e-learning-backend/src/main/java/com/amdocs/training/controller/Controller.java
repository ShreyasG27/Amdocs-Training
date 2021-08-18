package com.amdocs.training.controller;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.dao.impl.FeedbackDAOImpl;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.Course;
import com.amdocs.training.model.User;

import java.sql.Date;

public class Controller {
    public static void main(String[] args) {
        UserDAO userDAO=new UserDAOImpl();
        userDAO.display();
        User user=new User(107,"Shreyas","shgdbl@gmail.com","shreyyas","Pune", 8907659432L,"img.jpeg","21-08-2021");
        userDAO.saveUser(user);
        userDAO.display();
    }
}
