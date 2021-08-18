package com.amdocs.training.dao.impl;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.User;

import java.sql.*;

public class UserDAOImpl implements UserDAO {
    Connection conn= DBUtil.getConn();
    @Override
    public boolean create() {
        String query="create table user1(user_id int primary key auto_increment, name varchar(100),phone_no int8, email varchar(100), address varchar(100), reg_date varchar(50), password varchar(100), upload_photo varchar(100)";
        try{
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(query);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean display() {
        String display="select * from user1";
        try{
            Statement stmt=conn.createStatement();
            ResultSet data=stmt.executeQuery(display);
            while (data.next())
            {
                long phone=data.getLong(3);
                int user_ID=data.getInt(1);
                String name=data.getNString(2);
                String email=data.getNString(4);
                String address=data.getNString(5);
                String date=data.getNString(6);
                String password=data.getNString(7);
                String image=data.getNString(8);
                System.out.println("User_ID : "+user_ID+"\tName : "+name+"\tPhone : "+phone+"\tEmail : "+email+"\tAddress : "+address+"\tDate : "+date+"\tPassword : "+password+"\tUpload_Image : "+image);
            }
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean saveUser(User user) {
        String insert = "insert into user1 values(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps= conn.prepareStatement(insert);
            ps.setNString(2,user.getName());
            ps.setInt(1,user.getUser_ID());
            ps.setNString(4,user.getEmail());
            ps.setLong(3,user.getPhone());
            ps.setNString(5,user.getAddress());
            ps.setNString(6,user.getDate());
            ps.setNString(7,user.getPassword());
            ps.setNString(8,user.getUpload_Image());
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int userid) {
        String query="delete from admin where admin_id=?";
        try{
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setInt(1,userid);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
