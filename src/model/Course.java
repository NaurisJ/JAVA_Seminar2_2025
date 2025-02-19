package model;

import model.Professor;

public class Course {
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 0;
	
	
	
	// getter
	public long getcID() {
		return cID;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}

	
	// setter
	
	public void setTitle(String inputTitle) {
		if (inputTitle != null
				&& inputTitle.matches("[A-Za-z ]{4,20}")) {
			title = inputTitle;
		} else {
			title = "unknown";
		}
	}
	
	public void setCreditPoints(int inputCreditPoints) {
		if (inputCreditPoints > 0 && inputCreditPoints <= 30) {
			creditPoints = inputCreditPoints;
		} else {
			creditPoints = 1;
		}
	}
	
	public void setcID() {
		cID = counter++;
	}
	
	public void setProfessor() {
		
	}
	
	
	// bez argumenta konstruktors
	public Course() {
		setcID();
		setTitle("JAVA");
		setCreditPoints(6);
		
		
	}
	
	
	
}
