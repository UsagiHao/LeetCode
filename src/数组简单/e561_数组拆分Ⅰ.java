package 数组简单;

import java.util.Arrays;

public class e561_数组拆分Ⅰ {

    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int i = 0; i < nums.length; i+=2){
                sum += nums[i];
            }
            return sum;
        }
    }
}
