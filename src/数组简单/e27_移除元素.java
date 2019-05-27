package 数组简单;

public class e27_移除元素 {

    class Solution {
        public int removeElement(int[] nums, int val) {
            int slow = 0, fast = 0;
            int length = 0;
            while (fast < nums.length){
                if (nums[fast] != val){
                    nums[slow++] = nums[fast];
                    length++;
                }
                fast++;
            }
            return length;
        }
    }
}
