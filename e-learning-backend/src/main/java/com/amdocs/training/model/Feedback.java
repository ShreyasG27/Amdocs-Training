package com.amdocs.training.model;

public class Feedback {
    private int Feedback_ID;
    private int User_ID;
    private String Name;
    private String Email;
    private String Feedback;

    private Feedback(){}

    public Feedback(int feedback_ID, int user_ID, String name, String email, String feedback) {
        Feedback_ID = feedback_ID;
        User_ID = user_ID;
        Name = name;
        Email = email;
        Feedback = feedback;
    }

    public int getFeedback_ID() {
        return Feedback_ID;
    }

    public void setFeedback_ID(int feedback_ID) {
        Feedback_ID = feedback_ID;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }
}
