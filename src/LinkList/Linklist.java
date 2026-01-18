package LinkList;



public class Linklist {
 public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
 public static Node head;
 public static Node tail;

//  add first
public  void addFirst(int data){
    // step1: create new node
    Node newNode = new Node(data);
    // step2: newNode next = head
    newNode.next = head;

}
       public static void main(String[] args) {
        Linklist ll = new Linklist();
        System.out.println(ll);
    }
}
