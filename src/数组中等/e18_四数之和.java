package 数组中等;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e18_四数之和 {
    //拿三数之和改一下就行，多了一层循环
    //同样要注意去重
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            int sum = 0;
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < nums.length - 3; i++) {
                if (i != 0 && nums[i] == nums[i - 1]){
                    continue;
                }
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j != i + 1 && nums[j] == nums[j - 1]){
                        continue;
                    }
                    int left = j + 1, right = nums.length - 1;
                    while (left < right) {
                        sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            left++;
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            right--;
                        } else if (sum > target) {
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }
                            right--;
                        } else {
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            left++;
                        }
                    }
                }
            }
            return result;
        }
    }
}
