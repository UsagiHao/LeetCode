package 链表简单;

public class e141_环形链表 {
    //快慢双指针
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) return true;
            }
            return false;
        }
    }
}
