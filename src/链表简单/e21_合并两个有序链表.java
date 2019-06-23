package 链表简单;

public class e21_合并两个有序链表 {

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
        ListNode(int x){
            val = x;
        }
    }

    class Solution {
        /*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head1 = l1;
            ListNode head2 = l2;
            ListNode result = null;
            ListNode resultHead = null;

            if (l2 == null) return l1;
            if (l1 == null) return l2;

            if (l1.val <= l2.val){
                result = l1;
                resultHead = result;
                l1 = l1.next;
            }else {
                result = l2;
                resultHead = result;
                l2 = l2.next;
            }
            while (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    result.next = l1;
                    result = result.next;
                    l1 = l1.next;
                }else {
                    result.next = l2;
                    result = result.next;
                    l2 = l2.next;
                }
            }

            while (l1 != null){
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            }

            while (l2 != null){
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
            return resultHead;
        }*/

        //这种题目还可以递归，着实没想到
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }
}
