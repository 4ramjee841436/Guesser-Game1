package Linked_List;

public class Recursive_printValue {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayRecur(Node head)
    {
        if(head == null) return ;

        System.out.println(head.val);
        displayRecur(head.next);
    }
    public static void main(String[] args) {
        Node a= new Node(14);
        Node b= new Node(45);
        Node c= new Node(22);
        Node d= new Node(100);
        Node e= new Node(175);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       displayRecur(c);
    }
}
