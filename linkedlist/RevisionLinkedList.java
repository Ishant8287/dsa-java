package linkedlist;

class LL {
    Node head; //Initially null
    Node tail; //Initially null


    //Add at tail
    void addAtTail(int value) {
        Node temp = new Node(value);

        //base case
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.next = null;
        }
    }
    //Add at head
    void addAtHead(int value) {
        Node temp = new Node(value);
        if (head == null) {
            addAtTail(value);
        }
        else{
            temp.next = head;
            head = temp;
        }
    }
    //Delete at head
    void deleteAtHead() {
        if()
    }

}

public class RevisionLinkedList {

}
