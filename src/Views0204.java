public class Views0204 {
    public ListNode partition(ListNode head, int x) {
        ListNode cur = head, prev = head;
        while (cur != null) {
            if (cur.val < x) {
                int tmp = prev.val;
                prev.val = cur.val;
                cur.val = tmp;
                prev = prev.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
