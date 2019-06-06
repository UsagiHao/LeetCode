package 链表简单;

public class e19_删除链表的倒数第N个节点 {
/*
思路：没想出能使用一趟扫描实现的方法，借鉴了别人的双指针算法
可以使用两个指针而不是一个指针。第一个指针从列表的开头向前移动n步，而第二个指针将从列表的开头出发。现在，两个指针同时移动，当第一个指针移动到末尾时，第二个指针刚好到倒数第N个的位置
*/
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode preNode = head;
            ListNode curNode = head;
            for (int i = 0; i < n; i++){
                curNode = curNode.next;
            }
            if (curNode == null){
                return head.next;
            }

            while (curNode.next != null){
                curNode = curNode.next;
                preNode = preNode.next;
            }
            preNode.next = preNode.next.next;
            return head;
        }
    }
}
