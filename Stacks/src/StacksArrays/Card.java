package StacksArrays;

/**
 * This class defines a card as well as a value and suit.
 * @author s31011
 * @version 8/13/2018
 */
public class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        if(value==1){
            return "Ace of " + suit;
        }else if(value==11){
            return "Jack of " + suit;
        }else if(value==12){
            return "Queen of " + suit;
        }else if(value==13){
            return "King of " + suit;
        }else{
            return value + " of " + suit;
        }
    }
    
    
}
