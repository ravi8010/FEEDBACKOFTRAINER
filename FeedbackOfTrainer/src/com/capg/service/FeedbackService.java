package com.capg.service;

import java.util.HashMap;

import com.capg.beans.Trainer;
import com.capg.dao.FeedbackDAO;
import com.capg.dao.IFeedbackDAO;
import com.capg.exception.RatingDoesNotExist;

public class FeedbackService implements IFeedbackService {
 IFeedbackDAO fd=new FeedbackDAO();
	@Override
	public void addFeedback(Trainer trainer) {
		// TODO Auto-generated method stub
          fd.addFeedback(trainer);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerDetails(int rating) throws RatingDoesNotExist {
		if(fd.getTrainerDetails(rating).size()==0)
		{
			throw new RatingDoesNotExist();
		}
	
		return fd.getTrainerDetails(rating);
	}

}
