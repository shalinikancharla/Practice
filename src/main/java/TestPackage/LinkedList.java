package TestPackage;


public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        for (int i = 2; i < 10; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        System.out.println(temp.toString());
        temp = head;
        System.out.println(temp);
        //temp has the linked list. -- Reverse the linked list
        Node reverse=new Node(10);
        Node temp1=reverse;
        for(int i=9;i>1;i--)
        {
            temp1.next=new Node(i);
            temp1=temp1.next;
        }
        temp1=reverse;
        System.out.println(temp1);


    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}