package com.jse.app;
import java.util.Scanner;
import java.util.Random;
public class Engine {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Calculator calculator = null;// null 주소를 가진 instance
		Dice dice = null;			// null 주소를 가진 instance
		RPSGame rpsGame = null; // null 주소를 가진 instance
		Kaup kaup = null;
		
		while(true) {
			System.out.println("0. 종료 "
					+ " 1. 회원가입 "
					+ " 2. 로그인"
					+ " 3. 계산기"
					+ " 4. 주사위 홀짝 맞추기"
					+ " 5. 가위바위보 게임"
					+ " 6. 1부터 100까지의 합"
					+ " 7. 카우프 지수");
			int flag = scanner.nextInt();
			switch(flag) {
			case 0: System.out.println("종료");
			return;
			case 1: 
				System.out.println("회원가입");
				System.out.println("아이디 입력");
				member.setId(scanner.next());
			break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getId();
				System.out.println("로그인된 아이디:"+ returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 3 :
				calculator = new Calculator();
				System.out.println("계산기");
				System.out.print("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a);
				System.out.println("두번째 수 입력");
				int b = scanner.nextInt();
				calculator.setNum2(b);
				System.out.println("두수의 합:" + calculator.calculate());
				break;
			case 4: 
					dice = new Dice();
					System.out.println("주사위 홀짝 맞추기");
					System.out.println("예상하는 홀짝을 입력해 주세요");
					String expect = scanner.next();
					System.out.println(String.format("사용자가 입력한 값: %s", expect));
					dice.setExpect(expect);
					int diceNumber = random.nextInt(4);
					System.out.println(String.format("컴퓨터가 생성한 값: %s", diceNumber));
					dice.setdice(diceNumber);
					System.out.println(dice.switchDice());
				break;
			case 5: 
					rpsGame = new RPSGame();
					System.out.println("***가위바위보 게임***");
					System.out.println("가위1, 바위2, 보3 를 입력하세요");
					int user = scanner.nextInt();
					System.out.println("사용자가 입력한 값:" + user );
					rpsGame.setUserValue(user);
					int com = random.nextInt(3)+1;
					System.out.println("컴퓨터가 입력한 값:"+ com);
					rpsGame.setUserValue(com);
					System.out.println(rpsGame.game());
					break;
					
			case  7:
				kaup = new Kaup();
				System.out.println("카우프지수 확인하기");
				double height = scanner.nextDouble();
				System.out.println("사용자의 키:"+ height);
				kaup.setHeight(height);
				System.out.println("몸무게를 입력하세요");
				double weight = scanner.nextDouble();
				kaup.setWeight(weight);
				System.out.println(kaup.kaup());
				
				break;
				
				
				
			}
		}
	}
}	
		

	
	
	
