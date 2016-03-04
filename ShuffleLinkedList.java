 * Knuth shuffle: In iteration i, pick an integer r between 0 and i uniformly at random. Swap a[i] and a[r]. 
 *    Proof?
 */ 
 import java.util.Random;
import java.util.Arrays;

/**
public class Node {
    
     Node next;
    int val;
 
}
 */

public class ShuffleLinkedList {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Node n = new Node();
        n.val = 1;
        Node n2 = new Node();
          n.next = n2;
        n2.val =2;
        Node n3 = new Node();
         n2.next = n3;
        n3.val = 3;
        Node n4 = new Node();
         n3.next = n4;
        n4.val = 4;
       
        shuffleListKnuth(n);
        System.out.println(n.val+"->"+n2.val+"->"+n3.val+"->"+n4.val);

    
    }
     static void shuffleListKnuth(Node head){
        if(head == null) return;
        // first get the number of nodes in the list
        Node current = head;
        int total = 0;
        while(current != null){
            total++;
            current = current.next;
        }
        
        int[] vals = new int[total];
        int i = 0;
        current = head;
        while(current != null){
            vals[i++] = current.val;
            current = current.next;
        }
        
        Random rand = new Random();
        int selected = 0;
        int temp;
        for(i = 0; i < total; i++){
            selected = rand.nextInt(i+1); // we use i+1 since nextInt is exclusive on the right hand side
            // swap the value;
            temp = vals[selected];
            vals[selected] = vals[i];
            vals[i] = temp;
        }
        
        // change the list
        current = head;
        i = 0;
        while(current != null){
            current.val = vals[i++];
            current = current.next;
        }
    
}
}
