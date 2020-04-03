package com.jse.app;
import java.util.Scanner;
public class HelloJava {
	public static void main (String [] args) {
		System.out.print("어디사세요?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("아 "+ name +" 좋은 곳 이에요");
		System.out.println("몇 살 이에요?");
		int age = scanner.nextInt(); 
		System.out.println(age + "살이네요.");
		System.out.println("키는 몇이고,몸무게는 몇 kg 입니까?");
		float heigt = scanner.nextFloat();
		double weigt = scanner.nextDouble();
		System.out.println("혈액형이 뭐에요?");
		char bloodtype = scanner.next().charAt(0);
		
		int a = 0;
		System.out.println(a);
		
	}
	}
