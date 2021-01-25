import java.util.ArrayList;
import java.util.List;

/*
 * c.	Player
		i.	Fields
			1.	hand (List of Card)
			2.	score (set to 0 in the constructor)
			3.	name
		ii.	Methods
			1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
			2.	flip (removes and returns the top card of the Hand)
			3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
			4.	incrementScore (adds 1 to the Player’s score field)
 */

public class Player{
	//Fields 
	List<Card> hand = new ArrayList<Card>(); //hand (List of Card)
	private int score; 
	private String playerName;
	private Card topCard; 
	
	//Constructor
	public Player() {
		score=0;
	}; //default constructor 
	
	public Player(String newName) {
		setPlayerName(newName);
		score = 0; 
	}//overloading constructor 
	
	/*
	 * describe (prints out information about the player and
	 *  calls the describe method for each card in the Hand List)
	 */
	public void describe (String playerName, List<Card> hand) {
		System.out.println("Player's Name: " + playerName); 
		System.out.println("Hand List: " + hand); 
	}//end playInfo
	
	/*
	 * flip (removes and returns the top card of the Hand)
	 */
	public Card flip () {
		topCard = hand.remove(0);
		return topCard; 	
	}//end flip
	
	/*
	 * draw (takes a Deck as an argument and calls the draw method on the deck, 
	 * adding the returned Card to the hand field)
	 */
	public void draw (Deck deck) {
		hand.add(deck.drawCards());	
	}//end draw
	
	/*
	 * incrementScore (adds 1 to the Player’s score field)
	 */
	public void incrementScore () {
		score ++; 
	}//end incrementScore 

	//Setter and Getter 
	public int getScore() {
		return score;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPlayerName() {
		return playerName; 
	}
}
	
