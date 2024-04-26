package week06_finalproject;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.print("Player one has: ");
			card1.describe();
			System.out.print("Player two has: ");
			card2.describe();
		
			if (card1.getValue() > card2.getValue()) {
			player1.incrementScore();
			System.out.println("Player 1 receives a point\n");
			
			}else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 receives a point\n");
			}else {
				System.out.println("No point awarded\n");
			}
				
	}
		
		System.out.println("Final Score: ");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		
		//if else statement to determine the winner or if it ends in a tie
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins");
		} else
			System.out.println("It ends in a draw, folks");
		
		System.out.println();
	
		
}	
}
