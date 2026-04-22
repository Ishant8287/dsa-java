package linkedlist;

public class DisplayLinkedList {
    static void display(Node head) {
        Node temp = head;
//        Using while loop
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
//        Using for loop
//        for (Node temp = head; temp != null; temp = temp.next) {
//            System.out.print(temp.value + " ");
//        }
//        Using recursion
//        if(head.next == null){
//            return;
//        }
//        System.out.println(head.value);
//        display(head.next);
//    }
    }

    static void main() {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);

        //Connect these nodes now or link them
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
    }
}
