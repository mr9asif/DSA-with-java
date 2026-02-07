package Linklist;

public class NormalLinklistCreate {
    static class Node{
        int data;
        Node next;

        // constructor
        Node(int data){
           this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
      Node b = new Node(3);
      Node c = new Node(4);
      Node d = new Node(8);

      a.next=b;
      b.next=c;
      c.next = d;

    //   how to print linklist
     Node temp = a; // here a node store in next.
    //  b = a.next , c = b.next (b=a.next) => c = a.next.next

    while(temp !=null){
        System.out.print(temp.data+" ");
        temp = temp.next;        
    }

    }
}
