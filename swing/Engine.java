package com.jse.swing;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		Grade [] grades = new Grade[3];
		Member [] member = new Member[3];
		
		while(true) {
			System.out.println("0. 종료  1.성적표입력 2.성적표 출력 3.등수나열 4.회원등록  5.회원조회" );
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
				for(int i=0; i<3; i++) {
					grades[i] = input(scanner); 
				}break;
			case 2: 
				for(int i=0;i<3;i++) {
					Grade grade = grades[i];
					System.out.println(String.format("[%s : 총점 %d 점, 평균%d점 ,학점 %s]", 
							 grade.getName(), grade.total(), grade.average(),grade.grade()));				
					}break;
			case 3 :System.out.println("총점별로 1,2,3등 이름 나열하기");
					String result = "";
					for(int i=0; i<3; i++) {
						if(grades[i].total()>300) {
						result = "1등";
					}	else if(grades[i].total() >= 200) {
						result = "2등";
					} 	else {
						result = "3등";
					}
					System.out.println();
					}break;
					
			case 4 :System.out.println("회원등록");
					for(int i=0; i<3; i++) {
						member[i] = join(scanner);
					}
						break;
					}
					}
			}
	
	
	static Grade input(Scanner scanner) {
		Grade grade = new Grade();
		System.out.println("이름을 입력하세요");
		grade.setName(scanner.next());
		System.out.println("국어점수를 입력하세요");
		grade.setKorean(scanner.nextInt());
		System.out.println("영어점수를 입력하세요");
		grade.setEnglish(scanner.nextInt());
		System.out.println("수학점수를 입력하세요");
		grade.setMath(scanner.nextInt());
		System.out.println(String.format("[%s : 총점 %d 점, 평균%d점 ,학점 %s]", 
				 grade.getName(), grade.total(), grade.average(),grade.grade()));
		return grade;
	}
	public static Member join (Scanner scanner) {
		Member member= new Member();
		System.out.println("이름입력");
		member.setName(scanner.next());
		System.out.println("Id입력");
		member.setUserid(scanner.next());
		System.out.println("Password입력");
		member.setPasswd(scanner.next());
		System.out.println("나이입력");
		member.setAge(scanner.nextInt());
		return member;
	}
	}
	
	



