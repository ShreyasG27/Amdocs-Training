package com.amdocs.training.dao;

import com.amdocs.training.model.User;

public interface UserDAO {
    boolean create();
    boolean display();
    boolean saveUser(User user);
    boolean delete(int userid);
}
