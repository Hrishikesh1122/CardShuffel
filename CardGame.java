/**
 * Purpose : Shuffle deck of card and distribute 9 cards each to 4 players
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @Since 10-06-2021
 *
 */
package com.hrishi.cards;
import java.util.Random;
public class CardGame {
	Random random = new Random();
	private static String[] symbols=new String[] {"CLUB","DIAMOND","HEART","SPADE"};
	private static String[] ranks=new String[] {"2","3","4","5","6", "7","8","9","10","J","Q","K","A"};
	private static String[] deck = new String[52];
	private static String[][] shuffled = new String[12][3];
    
	/**
	 * Creates a deck of cards (1D array) from symbols[] and ranks[]
	 * @return deck of cards
	 */
	private String[] getDeck() {
		for(int i=0;i<deck.length;i++)
			deck[i]=symbols[i/13]+"->"+ranks[i%13];		
		return deck;	
	}
	
	/**
	 * Shuffles the deck of cards
	 * @return array deck
	 */
	private String[] shuffleDeck() {
		for(int i=0;i<deck.length;i++)
		{
			Random random = new Random();
			int index=random.nextInt(52);
			String temp = deck[i];
			deck[i]=deck[index];
			deck[index]=temp;		
		}
		return deck;	
	}
	
	/**
	 * Stores shuffled deck array into 2D array
	 * Displays the cards of 4 players
	 */
	private void to2DArray() {
		for(int j=0;j<12;j++)
		{
			for(int k=0;k<3;k++)
			{	
				shuffled[j][k]=deck[(k*10)+j];
				System.out.print(shuffled[j][k]+"  ");
			}
			System.out.println();
			if((j+1)%3==0)
				System.out.println();
		}
	}

	public static void main(String[] args) {
		CardGame game = new CardGame();
		game.getDeck();
		game.shuffleDeck();
		game.to2DArray();

}
}