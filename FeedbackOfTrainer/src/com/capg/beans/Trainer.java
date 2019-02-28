package com.capg.beans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trainer {
	private String name;
	private String courseName;
	private LocalDate startDate;
	private LocalDate endDate;
	private int rating;
	DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", courseName=" + courseName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", rating=" + rating + "]";
	}
	public Trainer(String name, String courseName,String startDate, String endDate, int rating) {
		super();
		this.name = name;
		this.courseName = courseName;
		this.startDate = LocalDate.parse(startDate, df);
		this.endDate = LocalDate.parse(endDate, df);
		this.rating = rating;
	}
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getCourseName() {
		return courseName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public int getRating() {
		return rating;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setStartDate(String startDate) {
		this.startDate = LocalDate.parse(startDate, df);
	}
	public void setEndDate(String endDate) {
		this.endDate = LocalDate.parse(endDate, df);
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
