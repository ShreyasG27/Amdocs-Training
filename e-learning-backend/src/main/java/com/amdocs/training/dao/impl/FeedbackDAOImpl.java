package com.amdocs.training.dao.impl;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.model.Feedback;

import java.sql.*;

public class FeedbackDAOImpl implements FeedbackDAO {
    Connection conn= DBUtil.getConn();
    @Override
    public boolean create() {
        String query="create table feedback(user_id int references user1,name varchar(100),email varchar(100),f_id int(30) auto_increment primary key,feedback varchar(100))";
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
        String display="select * from feedback";
        try{
            Statement stmt=conn.createStatement();
            ResultSet data=stmt.executeQuery(display);
            while (data.next())
            {
                int Feedback_ID=data.getInt(4);
                int User_ID=data.getInt(1);
                String name=data.getNString(2);
                String email=data.getNString(3);
                String feedback=data.getNString(5);
                System.out.println("Feedback_ID : "+Feedback_ID+"\tUser_ID : "+User_ID+"\tName : "+name+"\tEmail : "+email+"\tFeedback : "+feedback);
            }
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean saveFeedback(Feedback feedback) {
        String insert = "insert into feedback values(?,?,?,?,?)";
        try{
            PreparedStatement ps= conn.prepareStatement(insert);
            ps.setNString(2,feedback.getName());
            ps.setInt(1,feedback.getUser_ID());
            ps.setNString(3,feedback.getEmail());
            ps.setInt(4,feedback.getFeedback_ID());
            ps.setNString(5,feedback.getFeedback());
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int feedbackid) {
        String query="delete from admin where admin_id=?";
        try{
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setInt(1,feedbackid);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
