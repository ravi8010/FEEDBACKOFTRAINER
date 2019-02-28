package com.capg.service;

import java.util.HashMap;

import com.capg.beans.Trainer;
import com.capg.exception.RatingDoesNotExist;

public interface IFeedbackService {
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerDetails(int rating) throws RatingDoesNotExist;
	
}
