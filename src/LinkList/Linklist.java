package Linklist;

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
    if(head == null){
        head=tail=newNode;
        return;
    }
    // step2: newNode next = head
    newNode.next = head;

    // step3: head = newNode
    head = newNode;

}

// print linklist
public void print(){
        Node temp = head;
        while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
        }
}
       public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.print();
        
      


    }
}
