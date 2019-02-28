package com.capg.dao;

import java.util.HashMap;

import com.capg.beans.Trainer;

public interface IFeedbackDAO {
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerDetails(int rating);

}
