public class MainTest {
    public static void main(String[] args) {
        Views0201 views0201 = new Views0201();
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        node0.next = node1; node1.next = node2; node2.next = node3; node3.next = node4; node4.next = node5;
        views0201.removeDuplicateNodes(node0);

    }
}
