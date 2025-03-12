package Linked_List;

public class ShallowCopyOfNode {

//     Method 1
//    public static void print(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.val);
//            temp= temp.next;
//        }
//    }
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b= new Node(25);
        Node c= new Node(39);
        Node d= new Node(75);
        Node e= new Node(86);
        a.next=b;
        b.next=c;
        c.next= d;
        d.next= e;
//        print(a);

//          method 2

        Node temp= a; // shallow copy of a -> temp
        while (temp != null) {

            System.out.println(temp.val);
            temp= temp.next;
        }

        // method 3

//        for(int i=1;i<=5;i++)
//        {
//            System.out.println(temp.val);
//            temp= temp.next;

//        }
    }
}
