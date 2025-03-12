package Linked_List;
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}
public class NodeClass {
    public static void main(String[] args) {
        Node a= new Node(12);
        Node b= new Node(34);
        Node c= new Node(43);
        Node d= new Node(21);
        // Linking with each other

        a.next= b; // a -> b
        b.next= c; // b ->c
        c.next= d; // c ->d
        System.out.println(a.val); // print value of a
        System.out.println(a.next);// print address of b
        System.out.println(a.next.val); // print b value
        System.out.println(a.next.next.val); // print c value
    }
}
