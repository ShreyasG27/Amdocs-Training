package com.amdocs.project.dao;

import com.amdocs.project.model.Course;
import com.amdocs.project.model.User;

public interface CourseDAO {
    boolean create();
    boolean display();
    boolean saveCourse(Course course);
    boolean delete(int courseid);
    boolean update(Course course, int courseid);
    boolean enrol(int userid, int courseid);
    boolean deleteEnrol(int userid, int courseid);
}
