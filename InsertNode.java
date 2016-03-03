/**
 *
 * insert a node in a sorted list
 */
public class InsertNode {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node newNode = list.newNode(3);
        list.sortedInsert(newNode);
        newNode = list.newNode(5);
        list.sortedInsert(newNode);
        newNode = list.newNode(4);
        list.sortedInsert(newNode);
        list.printList();
    }
    
}

class LinkedList{
Node head;

 void sortedInsert(Node newNode){
     Node current;
     if(head == null || head.data >= newNode.data)
     {
     newNode.next = head;
     head = newNode;
     }else{
     current = head;
     while(current.next !=null && current.next.data < newNode.data)
         current = current.next;
       newNode.next = current.next;
       current.next = newNode;
        
     }

}

 Node newNode(int d ){
 Node n = new Node(d);
 return n;
 }

void printList(){
  Node temp = head;
  while(temp !=null)
  {
  System.out.print(temp.data+"->");
  temp = temp.next;
  }

}
 
 

}
class Node{
int data;
Node next;

Node(int d){
this.data = d;
next = null;
}
}
