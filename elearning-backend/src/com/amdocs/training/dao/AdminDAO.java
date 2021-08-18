package com.amdocs.training.dao;


import com.amdocs.training.model.Admin;

public interface AdminDAO {
    boolean create();
    boolean display();
    boolean saveAdmin(Admin admin);
    boolean delete(int adminid);
}
