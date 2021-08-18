package com.amdocs.training.dao;


import com.amdocs.training.model.Feedback;

public interface FeedbackDAO {
    boolean create();
    boolean display();
    boolean saveFeedback(Feedback feedback);
    boolean delete(int feedbackid);
}
