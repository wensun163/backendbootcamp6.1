
/*
 * Backend Bootcamp Week6 
 * @Author Wendy Sun
 * Creating an automated version of the classic card game WAR.
 * i.	Fields
 * 		1.	value (contains a value from 2-14 representing cards 2-Ace)
 * 		2.	name (e.g. Ace of Diamonds, or Two of Hearts)
 * ii.	Methods
 * 		1.	Getters and Setters
 * 		2.	describe (prints out information about a card)

 */

public class Card {
	//Fields
	private int value; 
	private String name; 
	
	//Constructor
	public Card () {}; //default constructor 
	
	
	public Card (int newValue, String suit) {
		value = newValue;  
		
		switch(newValue) {
			case 2: name = "Two"; 
				break; 
			case 3: name = "Three";
            	break;
			case 4: name = "Four";
            	break;
			case 5: name = "Five";
            	break;
			case 6: name = "Six";
            	break;
			case 7: name = "Seven";
            	break;
			case 8: name = "Eight";
            	break;
			case 9: name = "Nine";
            	break;
			case 10: name = "Ten";
            	break;
			case 11: name = "Jack";
            	break;
			case 12: name = "Queen";
				break;
			case 13: name = "King";
            	break;
			case 14: name = "Ace";
            	break;			
				
		}
		
		name += " of " + suit; 
		System.out.println(name); 
	}
	
	/*
	 * Methods
	 */
	
	//Getters and Setters
	public int getValue() {
		return value;
	}
	
	
	public void setValue(int value) {
		//Question 
		if(value >1 && value < 15) {
			this.value = value;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Method that describes (prints out information about a card)
	 */
	public void infoCard (String name, int value) {
		System.out.println(name + "has a value of " + value + ".");
	}//end infoCard

}//Card
