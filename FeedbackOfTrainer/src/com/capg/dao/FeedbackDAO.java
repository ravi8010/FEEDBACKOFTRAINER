package com.capg.dao;

import java.util.HashMap;
import java.util.Map.Entry;

import com.capg.beans.Trainer;
import com.capg.util.DBUtil;

public class FeedbackDAO implements IFeedbackDAO{
	static HashMap<Integer,Trainer> hashmap=DBUtil.getFeedback();
	@Override
	public void addFeedback(Trainer trainer) {
	
		int id=(int)Math.random()*1000;
		
		hashmap.put(id, trainer);
		
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerDetails(int rating) {
		HashMap<Integer,Trainer> searchedHm=new HashMap<>();
		for(Entry<Integer,Trainer> fb:hashmap.entrySet())
		{
		 if(rating==fb.getValue().getRating())
		 {
			 searchedHm.put(fb.getKey(), fb.getValue());
			 
		 }
		 
		}
	
			return searchedHm;
	}

}
