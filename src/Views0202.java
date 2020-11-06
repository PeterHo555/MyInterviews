public class Views0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode p1 = head, p2 = head;
        while(k > 0){
            k--;
            p1 = p1.next;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.val;
    }
}
