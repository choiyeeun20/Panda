package com.jse.arr;

public class CardService3 {
	private CardBean[][][] cardContainer;
	public CardService3() {
		cardContainer = new CardBean[10][10][10];
	}
	public void setCardCountainer(CardBean[][][] cardcoutainer) {
		this.cardContainer = cardcoutainer;
	}
	public CardBean[][][] getCardContainer(){
		return cardContainer;
}
}
