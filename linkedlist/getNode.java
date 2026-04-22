package linkedlist;

public class getNode {
    static void main() {
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
        System.out.println(get(a,3));
    }
    static int get(Node head , int val) {
        for(int i = 0;i <val;i++){
            head = head.next;
        }
        return head.value;
    }
}
