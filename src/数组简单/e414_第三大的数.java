package 数组简单;

import java.util.Arrays;

public class e414_第三大的数 {
    //其实是有点取巧的解法了，不然没法满足o(n)的时间复杂度
    //大体思路上很简单，但是这种交换方法在细节上有问题
    //如[1,1,2]时，max3的值就不对了
    //所以必须要靠一个变量count，当count>=3的时候才能保证max3的值不出错，此外，max3的初值要设为Long.MIN_VALUE，才能保证一定小于数组中的每一个数
    class Solution {
        public int thirdMax(int[] nums) {
            long max1 = Long.MIN_VALUE;
            long max2 = Long.MIN_VALUE;
            long max3 = Long.MIN_VALUE;

            int count = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] > max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = nums[i];
                    count++;
                }else if (nums[i] > max2){
                    if (nums[i] != max1){
                        max3 = max2;
                        max2 = nums[i];
                        count++;
                    }
                }else if (nums[i] > max3){
                    if (nums[i] != max2){
                        max3 = nums[i];
                        count++;
                    }
                }
            }

            return (int)(count < 3 ? max1 : max3);
        }
    }
}
