public class OddEven {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
        ListNode h = head;
        ListNode hn = h.next;
        while (h.next != null && h.next.next != null) {
            ListNode temp = h.next;
            h.next = h.next.next;
            temp.next = h.next.next;
            h = h.next;
        }
        h.next = hn;
        return head;
    }
}

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