package linkedlist;

//User defined data type -> Node in class

//User defined data structure ->
class LinkedList {
    Node head; //by default null
    Node tail; //by default null
    int size;

    //Add at end
    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    //Add at front
    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    //display
    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    //Delete at head
    void deleteAtHead()  {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        } else {
            head = head.next;
            if (head == null) tail = null;
        }
        size--;
    }

    //Search
    int search(int val) {
        int idx = 0;
        if (head == null) return -1;
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
}


public class LinkListDataStructure {
    static void main() {
        LinkedList linkedList = new LinkedList();
        //Add at end
        linkedList.addAtTail(10);
        linkedList.addAtTail(20);
        linkedList.addAtTail(30);
        linkedList.addAtTail(40);
        linkedList.addAtTail(50);
//      linkedList.display(); // Add at end -> display

        //Add at front
        linkedList.addAtHead(60);
        linkedList.addAtHead(70);
        linkedList.addAtHead(80);
        linkedList.addAtHead(90);
//      linkedList.display(); // Add at front -> display

        //delete at front
        linkedList.deleteAtHead();
//      linkedList.display(); //Delete at front
//      System.out.println(linkedList.size); // This will print the size of a linked list

//      System.out.println(linkedList.search(50)); // Print the index of node


    }
}

