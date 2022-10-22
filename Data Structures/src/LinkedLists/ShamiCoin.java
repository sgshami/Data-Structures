package LinkedLists;

/**
 *
 * @author s31011
 * @version 8-24-18
 */
public class ShamiCoin {
    private Block genesis;
    private Block lastBlock;
    
    public void add(int data){
        if(genesis == null){
            genesis = new Block(data, 0);
            lastBlock = genesis;
        }else{
            lastBlock = new Block(data, lastBlock.currentHash);
        }
        System.out.println("New Block Added!");
        System.out.println("Data: " + data + "\nPrevious Hasg; " + lastBlock.previousHash + "\nCurrent Hash: " + lastBlock.currentHash);
        
    }
    
    public static void main(String[] args){
        ShamiCoin buff = new ShamiCoin();
        buff.add(10);
        buff.add(17);
        buff.add(32);
        buff.add(5);
    }
}
