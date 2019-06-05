package 栈简单;

import java.util.HashMap;
import java.util.Stack;

public class e496_下一个更大元素Ⅰ {

    /**
     * 法一：三层循环暴力解法
     */
/*    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] result = new int[nums1.length];
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) {
                hashMap.put(nums2[i], i);
            }
            for (int i = 0; i < nums1.length; i++) {
                int index = hashMap.get(nums1[i]);
                int tmp = -1;
                for (int j = index + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        tmp = nums2[j];
                        break;
                    }
                }
                result[i] = tmp;
            }
            return result;
        }
    }*/

    /**
     * 方法二：栈
     * 一开始看到题目的时候不知道该如何用栈去做，感觉总得同时对两个数组进行遍历
     * 后来百度意识到，其实num1的元素都在num2中，那么单独遍历num2，利用栈找到每个元素后面第一个比它大的元素，将其存在map里即可
     * 最后只需遍历一遍num1，从map里取出对应的结果，没有的话则利用map.getOrDefault()方法赋默认值-1
     */
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            if (nums2 == null || nums2.length < 1) return new int[0];
            int[] result = new int[nums1.length];
            Stack<Integer> stack = new Stack<>();

            for (int num : nums2){
                while (!stack.empty() && stack.peek() < num){  //注意这里应该是while而不是if，可能会有多个key对应同一个value
                    map.put(stack.pop(), num);
                }
                stack.push(num);
            }
            for (int i = 0; i < nums1.length; i++){
                result[i] = map.getOrDefault(nums1[i], -1); //getOrDefault方法，有则取值，无则赋默认值-1
            }
            return result;
        }
    }
}
