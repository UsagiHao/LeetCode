package 数组简单;

public class e643_子数组最大平均数I {
    //所谓滑窗法，感觉就是单指针向前移动，加上新的一位减去最前面一位
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int sum = 0;
            for (int i = 0; i < k; i++){
                sum += nums[i];
            }

            int max = sum;

            for (int i = k; i < nums.length; i++){
                sum = sum - nums[i - k] + nums[i];
                if (nums[i] > nums[i - k]){
                    max = Math.max(sum, max);
                }
            }
            return (double)max / k;
        }
    }
}
