package 数组简单;

public class e234_回文链表 {
    //快慢双指针遍历一遍，然后把链表的后半部分翻转来与前半部分比较
    //注意链表的翻转不要出错
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    class Solution {//双指针遍历一遍找到链表的中点，前半部分转置，与后半部分比较
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            ListNode slow = head, fast = head;
            while (fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head2 = reverse(slow.next);
            while (head2 != null){
                if (head.val != head2.val) return false;
                head = head.next;
                head2 = head2.next;
            }
            return true;
        }

        private ListNode reverse(ListNode head){
            if (head == null || head.next == null) return head;
            ListNode newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }
}
