package com.jse.inheritance;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();

		while (true) {
			System.out.println();
			String message = "";
			switch (JOptionPane.showInputDialog("0.종료\t1.집전화 입력 \t.2.집전화 출력"
					+ "\t 3. 휴대전화입력\t 4. 휴대전화출력\t 5.아이폰입력 \t "
					+ "6.아이폰출력  \t 7.갤럭시입력 \t 8.갤럭시출력")) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력: phonenuumber, name,company").split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}
				break;

			case "2":
				Phone[] phones = service.getPhones();
				for (int i = 0; i < 3; i++) {
					message += (String.format("출력 :%s %s %s\n", phones[i].getPhoneNumber(), phones[i].getName(),
							phones[i].getCompany()));
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력: phonenuumber, name,company,true").split(",");
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}

				break;

			case "4":
				CelPhone[] celPhones = service.getCelphones();
				for (int i = 0; i < 3; i++) {
					message += (String.format("출력:%s,%s,%s,%s \n", celPhones[i].getPhoneNumber(),
							celPhones[i].getName(), celPhones[i].getCompany(), celPhones[i].getMove()));
				}
				JOptionPane.showMessageDialog(null, message);
				break;

			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력: phoneNumber, name, company,true, search")
							.split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[4]));
				}
				break;
			case "6":
				Iphone[] iphones = service.getIphones();
				for (int i = 0; i < 3; i++) {
					message += (String.format("출력:%s,%s,%s,%s,%s \n", iphones[i].getPhoneNumber(), iphones[i].getName(),
							iphones[i].getCompany(), iphones[i].getMove(), iphones[i].getSearch()));
				}
				JOptionPane.showMessageDialog(null, message);

				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("입력: phonenuumber, name, company, true, search, bigsize")
							.split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
				}
				break;
			case "8":
				GalaxyNote[] galaxyNotes = service.getGalaxynote();
				for (int i = 0; i < 3; i++) {
					message += String.format("출력: %s, %s, %s, %s,%s,%s \n", galaxyNotes[i].getPhoneNumber(),
							galaxyNotes[i].getSearch(), galaxyNotes[i].getName(), galaxyNotes[i].getCompany(),
							galaxyNotes[i].getMove(), galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}

		}
	}
}
