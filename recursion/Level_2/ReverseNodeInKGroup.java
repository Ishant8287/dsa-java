package Level_2;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseNodeInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = head;
        ListNode prevGroupTail = dummy;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        while (count >= k) {
            curr = prevGroupTail.next;
            ListNode prev = null;
            ListNode next = null;

            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode tailOfReversedGroup = prevGroupTail.next;
            tailOfReversedGroup.next = curr;
            prevGroupTail.next = prev;

            prevGroupTail = tailOfReversedGroup;
            count -= k;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseNodeInKGroup solver = new ReverseNodeInKGroup();

        // Example setup: 1 -> 2 -> 3 -> 4 -> 5, k = 2
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode result = solver.reverseKGroup(head, 2);

        // Print result
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
    }
}