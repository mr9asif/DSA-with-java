package Linklist;

public class SinglyLinklist {
    // initialize data
    int data;
    SinglyLinklist next;

    // constructor to initialize a new node
    SinglyLinklist(int data){
        this.data=data;
         this.next=null;
    }

    public static void main(String[] args) {
        SinglyLinklist head = new SinglyLinklist(10);
        head.next=new SinglyLinklist(20);
        head.next.next = new SinglyLinklist(30);

          // printing linked list
        SinglyLinklist temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    
}
