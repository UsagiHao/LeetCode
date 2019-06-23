package 链表中等;

public class e24_两两交换链表中的节点 {
    //迭代操作即可，注意循环终止条件
    //当然也可以递归
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

   /* class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode pre = new ListNode(-1);
            ListNode cur = head;
            ListNode ret = head.next;

            while (cur != null && cur.next != null){
                ListNode next = cur.next.next;//下一次操作的节点
                pre.next = cur.next;
                cur.next.next = cur;
                cur.next = next;
                pre = cur;
                cur = next;
            }

            return ret;
        }
    }*/

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
