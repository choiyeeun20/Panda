package com.jse.swing;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		
		while(true) {
			System.out.println("0. 종료  1.학점계산기");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: 
				grade = new Grade();
				System.out.println("학점계산기");
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
						
			}
			
				
			}
		}
	}

