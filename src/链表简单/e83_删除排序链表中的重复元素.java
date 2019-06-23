package 链表简单;

public class e83_删除排序链表中的重复元素 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode cur = head;
            ListNode next = cur.next;
            while (cur != null && next != null){
                if (cur.val == next.val){
                    cur.next = null;
                    next = next.next;
                }else{
                    cur.next = next;
                    cur = next;
                    next = next.next;
                }
            }
            return head;
        }

        //法二：递归
       /* public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;
            head.next = deleteDuplicates(head.next);
            return head.val == head.next.val ? head.next : head;
        }*/
    }
}
