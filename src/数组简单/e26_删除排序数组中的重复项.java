package 数组简单;

public class e26_删除排序数组中的重复项 {
    //快慢双指针
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length < 2){
                return nums.length;
            }
            int slow = 0, fast = 1;
            int length = 1;
            while (fast < nums.length){
                if (nums[fast] != nums[slow]){
                    nums[++slow] = nums[fast];
                    length++;
                }
                fast++;
            }
            return length;
        }
    }
}
