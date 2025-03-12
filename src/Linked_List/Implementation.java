package Linked_List;
class SLL {
    Node head;
    Node tail;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }
    void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

public class Implementation {
    public static void main(String[] args) {
        SLL list= new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(145);
        list.insertAtEnd(67);
        list.insertAtEnd(98);
       list.display();
        System.out.println();
        list.insertAtEnd(125);
        System.out.println("After adding a new value ");
        list.display();

    }
}
