package com.amdocs.training.dao;


import com.amdocs.training.model.Course;

public interface CourseDAO {
    boolean create();
    boolean display();
    boolean saveCourse(Course course);
    boolean delete(int courseid);
}
