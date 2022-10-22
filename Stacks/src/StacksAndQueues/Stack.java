package StacksAndQueues;

/**
 *
 * @author s31011
 * @version 8-20-18
 */
public class Stack {
    private static class Node{
        private int data;
        private Node next;
        
        private Node(int data){
            this.data = data;
        }
    }
    
    private Node top;
    
    public int pop(){
        int data = top.data;
        top = top.next;
        return data;
    }
    
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    
    public int peek(){
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
}
