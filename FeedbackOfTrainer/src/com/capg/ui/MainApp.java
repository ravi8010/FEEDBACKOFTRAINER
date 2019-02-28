package com.capg.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.capg.beans.Trainer;
import com.capg.exception.RatingDoesNotExist;
import com.capg.service.FeedbackService;
import com.capg.service.IFeedbackService;

public class MainApp {
static IFeedbackService fds=new FeedbackService();
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws RatingDoesNotExist {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("1:AddFeedBack\n2:Display Details of Trainer\n3:Exit ");
			System.out.println("Enter your Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			
			case 1:addFeedback();
			break;
			case 2:displayTrainerList();
			break;
			case 3:System.exit(0);
			break;
			default:System.out.println("wrong choice");
			
			}
			
		}
       
	}
	private static void displayTrainerList() throws RatingDoesNotExist {
		System.out.println("Enter Rating");
		int rating=sc.nextInt();
		HashMap<Integer,Trainer> hm=fds.getTrainerDetails(rating);
		for(Entry<Integer,Trainer> feedback:hm.entrySet())
		{
			Trainer trainer=feedback.getValue();
			System.out.println("Trainer Name:"+trainer.getName()+"Trainer Course"+trainer.getCourseName()+" Starting Date"+trainer.getStartDate()+" Ending Date"+trainer.getEndDate());
		}
		  
		
	}
	private static void addFeedback() {
		sc.nextLine();
		System.out.println("Enter Trainer Name");
		String name=sc.nextLine();
		while(!(Pattern.matches("[A-z,a-z, ]+",name)))
				{
			System.out.println("Enter valid Name");
			name=sc.nextLine();
				}
		System.out.println("Enter Course");
		String cname=sc.nextLine();
		System.out.println("Enter Start Date in DD-MM-YYYY");
		String sDate=sc.nextLine();
		while(!(validateDate(sDate)))
		{
			System.out.println("Enter valid Date");
			sDate=sc.nextLine();
		}
		
		//while(!(validateDate(sd)))
		System.out.println("Enter End Date in DD-MM-YYYY");		
		String eDate=sc.nextLine();
		while(!(validateDate(eDate)))
		{
			System.out.println("Enter valid Date");
			eDate=sc.nextLine();
		}
		//LocalDate ed=LocalDate.parse(eDate);
		System.out.println("Enter Rating");
		int rating=sc.nextInt();
		while(rating<=0&&rating>5)
		{
			rating=sc.nextInt();
		}
	
	Trainer trainer=new Trainer();
	trainer.setName(name);
	trainer.setCourseName(cname);
	trainer.setStartDate(sDate);
	trainer.setEndDate(eDate);
	trainer.setRating(rating);
	
	fds.addFeedback(trainer);
	
				
		}
static 	DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public static boolean validateDate(String sd)
	{
	try
	{
	   LocalDate.parse(sd, df);
	   return true;
	}
		catch(Exception e)
	{
			System.err.println("Invalid Date");
	}
	return false;
	}
	
}


