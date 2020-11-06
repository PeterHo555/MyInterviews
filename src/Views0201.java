import java.util.HashSet;

public class Views0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null) return head;
        HashSet<Integer> set = new HashSet<>();
        ListNode pre = head, node = head.next;
        set.add(head.val);
        while(node != null){
            if(set.contains(node.val)){
                pre.next = null; // 出现重复节点，pre后置先断掉
                node = node.next;
            }else {
                set.add(node.val);
                pre.next = node;
                pre = node;
                node = node.next;
            }
        }
        return head;
    }
}
