package week06_finalproject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private StringBuilder buildCards = new StringBuilder();
	
	private List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
	private List<String> values = Arrays.asList("Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Jack", "Queen", "King", "Ace");
		/*
		 * creating a deck should generate new cards of correct value and suit
		 * --deck could be a list of card objects--
		 * distribute the suit names
		 * be able to draw a card - that should remove it from the deck.
	
		 */
	public Deck() {
		
		for(String suit : suits) {
			
			int counter = 2;
			for (String value : values) {
				buildCards.setLength(0);
				buildCards.append(value + " of " + suit); //card name built as a string
				Card card = new Card(buildCards.toString(), counter);
				cards.add(card);
				counter += 1;
			}
		}
	}
	public void shuffle() {
		// be able to shuffle deck
		Collections.shuffle(this.cards);
		
	}
	
	

	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	} 


	
	public int getSize() {
		return cards.size(); //how many cards in deck
	}
	
}
