package com.jse.phone;
import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class PhoneController {
	
	public static void main(String[] args) {
		PhoneService service = new PhoneService();
		String message = "";
		
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}
				break;

			case "2":
				Phone[] phones = service.getPhones();
				for (int i = 0; i < 3; i++) {
					message += phones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}

				break;

			case "4":
				CelPhone[] celPhones = service.getCelphones();
				for (int i = 0; i < 3; i++) {
					message += celPhones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
				break;

			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[4]));
				}
				break;
			case "6":
				Iphone[] iphones = service.getIphones();
				for (int i = 0; i < 3; i++) {
					message += iphones[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);

				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXY_NOTE_MENU).split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
				}
				break;
			case "8":
				GalaxyNote[] galaxyNotes = service.getGalaxynote();
				for (int i = 0; i < 3; i++) {
					message += galaxyNotes[i].toString();
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}

		}
	}
}