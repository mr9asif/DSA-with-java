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

// add last
 public void addLast(int val){
    Node temp = new Node(val);
    if(head == null){
        head=tail=temp;
    }else{
      tail.next=temp;
      tail=temp;
    }
 }

//  insertAt index
void insertAt(int idx, int val){
    Node t = new Node(val);
    Node temp = head;
    for(int i=1; i<=idx-1; i++){
        temp = temp.next;
    }
    t.next= temp.next;
    temp.next = t;
    
}

// more secure insertAt
void insertAtS(int idx, int val) {
    if (idx < 0) return;

    Node t = new Node(val);

    // insert at head
    if (idx == 0) {
        t.next = head;
        head = t;
        return;
    }

    Node temp = head;
    for (int i = 0; i < idx - 1 && temp != null; i++) {
        temp = temp.next;
    }

    // index out of bounds
    if (temp == null) return;

    t.next = temp.next;
    temp.next = t;
}


// print linklist
public void display(){
        Node temp = head;
        while(temp!=null){
           System.out.print(temp.data+" ");
           temp=temp.next;
        }
}
       public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.insertAt(3, 1);
        ll.insertAtS(2, 10);
        ll.display();


    }
}
