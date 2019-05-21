package 数组简单;

public class e283_移动零 {
    //简单双指针
    class Solution {
        public void moveZeroes(int[] nums) {
            int slow = 0;
            int fast = 0;

            for (; fast < nums.length; fast++){
                if (nums[fast] != 0){
                    nums[slow] = nums[fast];
                    slow++;
                }
            }

            for (; slow < nums.length; slow++){
                nums[slow] = 0;
            }
        }
    }
}
