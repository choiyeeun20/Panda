package com.jse.grade;

public class GradeService {
	private Grade [] grades;
	private int count;
	
	public GradeService() {
		grades = new Grade[3];
		count =0;
	}
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	public Grade[] getGrades() {
		return grades;
	}
	public void add(Grade grade) {
		grades[0] = grade;

	}
	
	
}

