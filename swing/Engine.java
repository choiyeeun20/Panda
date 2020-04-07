package com.jse.swing;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		GradeService gradeservice = new GradeService();
		
		MemberBean [] member = new MemberBean[3];
		
		while(true) {
			System.out.println("0.종료 1.성적표입력 2.성적표 출력 3.회원등록" );
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
				for(int i=0; i<3; i++) {
					System.out.println("이름,국어,영어,수학 입력");
					gradeservice.add
							(new GradeBean(
							scanner.next(),
							scanner.nextInt(),
							scanner.nextInt(),
							scanner.nextInt()));
				}
				break;
			case 2: 
				GradeBean[] grades = gradeservice.getGrades();
				for(int i=0;i<3;i++) {
					System.out.println(String.format("[%s : 총점 %d 점, 평균%d점 ,학점 %s]", 
							 grades[i].getName(), 
							 grades[i].total(), 
							 grades[i].average(),
							 grades[i].grade()));				
					}break;
			case 3 :System.out.println("회원등록");
					for(int i=0; i<3; i++) {
						
					}
					break;
					
			case 4 :System.out.println("회원등록");
					for(int i=0; i<3; i++) {
					}
						break;
					}
					}
			}
	
	
	static GradeBean input(Scanner scanner) {
		System.out.println("이름, 국어, 영어, 수학 입력");
		return new GradeBean (scanner.next(),scanner.nextInt(),
				scanner.nextInt(),scanner.nextInt());
	}
	public static MemberBean join (Scanner scanner) {
		System.out.println("아이디, 비밀번호, 이름, 나이");
		return new MemberBean(scanner.next(),scanner.next(),
				scanner.next(),scanner.nextInt());
	}
	}
	
	



