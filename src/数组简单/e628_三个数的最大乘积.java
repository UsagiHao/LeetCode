package 数组简单;

import java.util.Arrays;

public class e628_三个数的最大乘积 {
    //数学问题，最大值肯定存在于最大的三个数乘积或最小的两个负数和最大的一个正数乘积之中
    class Solution {
        public int maximumProduct(int[] nums) {
            int length = nums.length;
            Arrays.sort(nums);
            return Math.max(nums[length - 1] * nums[length - 2] * nums[length - 3], nums[0] * nums[1] * nums[length - 1]);

        }
    }
}
