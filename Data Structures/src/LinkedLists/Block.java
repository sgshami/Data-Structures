package LinkedLists;

/**
 *
 * @author s31011
 * @version 8-24-18
 */
public class Block {
    int data;
    int currentHash;
    int previousHash; 
    
    Block(int data, int previousHash){
        this.data = data;
        this.previousHash = previousHash;
        currentHash = hashCode();
    }
    
   
}
