import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Backend Bootcamp Week6 Assignment 
 * @Author Wendy Sun 
 * 
 * b.	Deck
 * 		i.	Fields
 * 			1.	cards (List of Card)
 * 		ii.	Methods
 * 			1.	shuffle (randomizes the order of the cards)
 * 			2.	draw (removes and returns the top card of the Cards field)
 * 			3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
 */
public class Deck {
	//Field 
	List<Card> cards = new ArrayList<Card>(); //List of Card
	List<String> suits = Arrays.asList("Diamonds", "Hearts", "Clubs", "Spades");
	private Card topCard; 
	
	
	/*
	 * In the constructor, when a new Deck is instantiated, 
	 * the Cards field should be populated with the standard 52 cards.
	 */
	public Deck () {
			for (int i =2; i<15; i++) {
				for(String suit:suits) {
					cards.add(new Card(i,suit)); 
				}//end for
			}//end for
		}//end constructor 
	
	
	/*
	 *shuffle (randomizes the order of the cards)
	 */
	public void shuffleCards (){
		Collections.shuffle(cards);
	}//end shuffleCards
	

	/*
	 * draw (removes and returns the top card of the Cards field)
	 */
	public Card drawCards (){
		  topCard = cards.remove(0);
		  return topCard; 		
	}//end drawCards
}//end Deck
