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

      a.next=b;
      b.next=c;

      System.out.println(a);

    }
}
