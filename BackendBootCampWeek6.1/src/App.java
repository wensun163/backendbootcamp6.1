
/*
 * Backend BootCamp Assignment 6
 * @Author Wendy Sun
 * 
 * 2. Create a class called App with a main method
 * 3.	Instantiate a Deck and two Players, call the shuffle method on the deck.
 * 4.	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
 * 5.	Using a traditional for loop, iterate 26 times and call the flip method for each player.
 * 		a.	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
 * 6.	After the loop, compare the final score from each player. 
	7.	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

 * 
 */
public class App {

	public static void main(String[] args) {
		//Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck(); 
		//Question 
		Player player1 = new Player("Kate"); 
		Player player2 = new Player(); 
		deck.shuffleCards();
		//player1.setPlayerName("Janice");
		player2.setPlayerName("William");
		
	
		
		/*
		 * Using a traditional for loop,
		 *  iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		 */
		for (int i=0; i<52;i++) {
			if(i%2 ==0) {
				player1.draw(deck); 
			}else {
				player2.draw(deck); 
			}//end if
		} //end for loop
			
		/*
		 * Using a traditional for loop, iterate 26 times and call the flip method for each player.
		 * Compare the value of each card returned by the two player’s flip methods.
		 *  Call the incrementScore method on the player whose card has the higher value.
		 */
		
		
		for (int i=0; i<26; i++) {
			Card topCardPlayer1 = player1.flip(); 
			Card topCardPlayer2 = player2.flip(); 
			if(topCardPlayer1.getValue() > topCardPlayer2.getValue()) {
				 player1.incrementScore(1); 
			}else {
					player2.incrementScore(1); 
				}//end if
			}//end for loop
		
		/*After the loop, compare the final score from each player. 
		 * 
		 * 7.	Print the final score of each player
		 *  and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		 */
		System.out.println(player1.getPlayerName() + " has final score of " + player1.getScore());
		System.out.println(player2.getPlayerName() + " has final score of " + player2.getScore());
		
		if (player1.getScore()>player2.getScore()) {
			System.out.println(player1.getPlayerName() + " is the winner!"); 
		}else if (player1.getScore() < player2.getScore()){
			System.out.println(player2.getPlayerName() + " is the winner!"); 
		}else {
			System.out.println("It is a draw!");
		}//end if	
			
	}//end main
}//end App
			
		

