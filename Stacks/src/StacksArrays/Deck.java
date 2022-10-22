package StacksArrays;
/**
 *
 * @author s31011
 * @version 8/15/2018
 */
import java.util.Random;

public class Deck {

    private Card deck[];
    private int topOfDeck = -1;
    private final int DECK_SIZE = 52; 
    
    public Deck() {
        String suits[] = {"Diamonds", "Clubs", "Spades", "Hearts"};
        deck = new Card[DECK_SIZE];
        for(int i = 0; i<4; i++){
            for(int j = 1; j<14; j++){
                push(new Card(j, suits[i]));
            }
        }
    }
    public void push(Card c) {
        if(topOfDeck + 1 < DECK_SIZE){
            topOfDeck++;
            deck[topOfDeck] = c;
        }else{
            System.out.println("The Deck is full and no card can be added...is someone cheating?");
        }
    }
    public Card pop() {
        if(topOfDeck > -1){
            Card c = deck[topOfDeck];
            deck[topOfDeck] = null;
            topOfDeck--;
            return c;
        }else{
            System.out.println("The stack is empty");
            return null;
        }
    }
    public Card peek() {
        return deck[topOfDeck];
    }
    @Override
    public String toString() {
        String output = "";
        for(int i= 0; i<topOfDeck + 1; i++){
            output += (deck[i].toString() + "\n");
        }
        return output;
    }
    public void shuffle() {
    Random rnd = new Random();
        for (int i = topOfDeck; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card c = deck[index];
            deck[index] = deck[i];
            deck[i] = c;
        }
    }
    public static void main( String[] args ) {
        Deck deck = new Deck();
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
    }
}
