package week06_finalproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {  //gives perameters for the player and various points of data
        this.name = name;
        this.score = 0;
        hand = new ArrayList<>();
    }
    public void describe() {   //This allows for us to describe the player/card hand and what it is doing.
        System.out.println("Player: " + name);
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        if (hand.isEmpty()) { //allows for a card to be played
            return null;
        }
        return hand.remove(0);
    }

    public void draw(Deck deck) {  //allows player to draw from the deck
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    public void incrementScore() { //have the score increment up from 0
        score++;
    }

    public int getScore() { //create getter for the score to use later
        return score;
    }

}
