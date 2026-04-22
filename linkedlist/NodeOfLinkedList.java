package linkedlist;


public class NodeOfLinkedList {
    static void main() {
//      10->20->30->40->50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        //Connect these nodes now or link them
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//      e.next = null;


        System.out.println(a.next.next.next.value);
    }
}
