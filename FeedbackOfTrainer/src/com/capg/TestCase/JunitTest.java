package com.capg.TestCase;


import org.junit.Before;
import org.junit.Test;

import com.capg.beans.Trainer;
import com.capg.exception.RatingDoesNotExist;
import com.capg.service.FeedbackService;
import com.capg.service.IFeedbackService;

public class JunitTest {
IFeedbackService fds;
	@Before
	public void setUp() throws Exception {
		fds=new FeedbackService();
	}

	@Test(expected=com.capg.exception.RatingDoesNotExist.class)
	public void test() throws RatingDoesNotExist {
		fds.addFeedback(new Trainer("af","sde","13-03-2000","10-04-2000",5));
		fds.getTrainerDetails(1);
	}
	@Test
	public void test1() {
		fds.addFeedback(new Trainer("af","sde","13-03-2000","10-04-2000",7));
	}

}
