package 链表简单;

public class e206_反转链表 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //法一：递归
   /* class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null){
                return head;
            }

            ListNode next = head.next;
            ListNode newHead = reverseList(next);
            next.next = head;
            head.next = null;
            return newHead;
        }
    }*/

   //法二：迭代法，需要保存前一个节点prev和后一个节点nextTemp
/*   public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while (curr != null) {
           ListNode nextTemp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextTemp;
       }
       return prev;
   }*/

    //法三：头插法,每次都插入到head前面，更新head
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode cur = head.next;
        head.next = null;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = head;
            head = cur;
            cur = next;
        }
        return head;
    }

}
