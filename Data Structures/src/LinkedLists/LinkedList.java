package LinkedLists;

/**
 *
 * @author s31011
 * @version 8-20-18
 */
public class LinkedList {
    private Node head;
    
    public LinkedList(){
        this.head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void append(int data) {
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
    
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    
    public void delete(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
