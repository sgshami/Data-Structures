package StacksArrays;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author s31011
 * @version 8/15/2018
 */
public class War {
    private ArrayList <Card> deck1;
    private ArrayList <Card> deck2;
    private Deck deck;
    
    public War(){
        deck1 = new ArrayList<>();
        deck2 = new ArrayList<>();
        deck = new Deck();
        for(int i = 0; i<26; i++){
            deck1.add(deck.pop());
            deck2.add(deck.pop());
        }
    }
    public void playGame(){
        Card c1 = deck1.remove(0);
        Card c2 = deck2.remove(0);
        if(c1.getValue() > c2.getValue()){
            deck1.add(c1);
            deck1.add(c2);
        }else if(c1.getValue() < c2.getValue()){
            deck2.add(c1);
            deck2.add(c2);
        }else{
            for(int i = 0; i<3; i++){
                deck1.remove(i);
            }
            Card ca = deck1.remove(0);
            for(int i = 0; i<3; i++){
                deck2.remove(i);
            }
            Card cb = deck2.remove(0);
            
        }
    }
}

