package com.amdocs.training.dao;

import com.amdocs.training.model.Contact;

public interface ContactDAO {
    boolean create();
    boolean display();
    boolean saveContact(Contact contact);
    boolean delete(int contactid);
}
