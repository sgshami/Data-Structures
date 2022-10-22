package Queues;
import java.util.ArrayList;

/**
 *Creating the queue data algorithm
 * @author s31011
 * @version 8/16/18
 */
public class TheQueue {
    private ArrayList<String> queueArray;

    public TheQueue() {
        this.queueArray = new ArrayList();
    }
    public void enqueue( String input ){
        queueArray.add(input);
    }
    public String peek(){
        return queueArray.get(0);
    }
    public String dequeue(){
        return queueArray.remove(0);
    }
    public void printall(){
        System.out.print("The items in the list will be printed in chronological order as follows:");
        for(int i = 0; i<queueArray.size(); i++){
            System.out.print(" " + queueArray.get(i) + "; ");
        }
        System.out.println();
    }
    
    public static void main( String[] args ) {
        TheQueue theQueue = new TheQueue();
        theQueue.enqueue("Sami");
        theQueue.enqueue("Joseph");
        theQueue.enqueue("Sarah");
        theQueue.printall();
        theQueue.enqueue("John");
        theQueue.enqueue("Bob");
        System.out.println(theQueue.peek() + " is first in line.");
        System.out.println(theQueue.dequeue() + " was removed from the queue.");
        System.out.println("The new list is as follows" + "\n ------------------------------------------------------------------------------");
        theQueue.printall();
    }
}
