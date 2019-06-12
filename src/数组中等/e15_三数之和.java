package 数组中等;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e15_三数之和 {
    //排序，先固定一个数，然后转化为双指针问题
    //注意去重
    //排序时间复杂度o(nlogn),循环时间复杂度o(n^2)，总时间复杂度o(n^2)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            int sum = 0;
            for (int i = 0; i < nums.length -2; i++){
                if (i > 0 && nums[i] == nums[i - 1]){
                    continue;
                }
                int left = i + 1, right = nums.length - 1;
                while (left < right){
                    sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        /**
                         * 注意，这里应该是继续移动指针而不是break，毕竟left++以及right--是有可能出现新的解的
                         */
                        while (left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        right--;
                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        left++;
                    }else if (sum > 0){
                        while (left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        right--;
                    }else {
                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        left++;
                    }
                }
            }
            return result;
        }
    }
}
