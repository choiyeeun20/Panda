package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[3];
		count = 0;
	}



	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;

	}


	@Override
	public int Count() {
		return count;
	}

	@Override
	public int total(Grade grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath();
	}

	@Override
	public int average(Grade grade) {
		return total(grade) / 3;
	}

	@Override
	public String record(Grade grade) {
		String result = "";
		int average = average(grade);

		if (average >= 90) {
			result = "A";
		} else if (average >= 80) {
			result = "B";
		} else if (average >= 70) {
			result = "C";
		} else if (average >= 60) {
			result = "D";
		} else if (average >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		return result;
	}



	@Override
	public Grade[] list() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Grade detail(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String ranking() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub
		
	}



	

}