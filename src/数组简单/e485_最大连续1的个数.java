package 数组简单;

public class e485_最大连续1的个数 {
//顺序遍历即可，注意最后一位为1时要单独考虑
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            if (nums.length == 1 && nums[0] == 1) return 1;
            int result = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == 1){
                    count++;
                }else{
                    result = Math.max(result, count);
                    count = 0;
                }
            }
            return result > count ? result : count;
        }
    }
}
