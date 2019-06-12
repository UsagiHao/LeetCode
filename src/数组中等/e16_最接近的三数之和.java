package 数组中等;

import java.util.Arrays;

public class e16_最接近的三数之和 {
    //先固定一个数，然后转化为两数之和，这时候用双指针就可以了
    //所以其实就是先遍历一遍，内层再使用双指针，总体复杂度o(n^2)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int sum = 0;
            int result = 0;
            int temp = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 2; i++){
                int left = i + 1, right = nums.length - 1;
                while (left < right){
                    sum = nums[i] + nums[left] + nums[right];
                    if (Math.abs(target - sum) < temp) {
                        temp = Math.abs(target - sum);
                        result = sum;
                    }
                    if (sum > target){
                        right--;
                    }else if (sum < target){
                        left++;
                    }else {
                        return target;
                    }
                }
            }
            return result;
        }
    }
}
