package medium._82;

public class Main {

    public static void main(String[] args) {
        ListNode node32 = new ListNode(3, null);
        ListNode node31 = new ListNode(3, node32);
        ListNode node2 = new ListNode(2, node31);
        ListNode node12 = new ListNode(1, node2);
        ListNode node11 = new ListNode(1, node12);
        Solution solution = new Solution();
        ListNode start = solution.deleteDuplicates(node11);
        System.out.println("e");
        while (start != null) {
            System.out.println(start.val);
            start = start.next;
        }
    }
}
