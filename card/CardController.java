package com.jse.card;
import com.jse.util.Constants;
import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardService cardService = new CardServiceImpl();
		Card card = null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.CARD_MENU)){
				case "0": return;
				case "1": 
					for (int i = 0; i < 3; i++) {
						String[] values = JOptionPane.showInputDialog(Constants.CARD_INPUT).split(",");
						card = new Card();
						card.setKind(values[0]);
						card.setNumber(Integer.parseInt(values[1]));
						cardService.add(card);
					}
					break;
					
				case "2": JOptionPane.showMessageDialog(null,cardService.printCard());
				
					break;
			
		}
	}
}
	
}