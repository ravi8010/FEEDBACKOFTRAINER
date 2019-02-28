package com.capg.util;

import java.util.HashMap;

import com.capg.beans.Trainer;

public class DBUtil {
	static HashMap<Integer,Trainer> feedbackList=new HashMap<>();
	static
	{
		feedbackList.put(41,new Trainer("Smitha","Java","13-03-2000","10-04-2000",5));
		feedbackList.put(42,new Trainer("Smitha","Java","01-01-2001","10-01-2000",4));
		feedbackList.put(43,new Trainer("Smitha","Java","13-10-2001","23-10-2001",3));
	}
	public static HashMap<Integer, Trainer> getFeedback() {
		return feedbackList;
	}



}
