package 数组简单;

import java.util.Arrays;

public class e581_最短无序连续子数组 {

    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int min = nums[0];
            int max = nums[0];
            int i = 0, j = 0;
            int left = 0, right = nums.length - 1;

            while (i < nums.length - 1 && nums[i] <= nums[i + 1]){
                i++;
            }

            while (j > 0 && nums[j] >= nums[j - 1]){
                j--;
            }

            for (; i < nums.length; i++){
                if (nums[i] < min){
                    min = nums[i];
                }
            }

            for (; j >= 0; j--){
                if (nums[j] > max){
                    max = nums[j];
                }
            }

            while (nums[left] <= min){
                left++;
            }

            while (nums[right] >= max){
                right--;
            }

            return right - left + 1;
        }
    }

    class Solution1 {
        public int findUnsortedSubarray(int[] nums) {
            int[] newNums = nums.clone();
            Arrays.sort(nums);
            int i = 0, j = nums.length - 1;
            while (i < j && nums[i] == newNums[i]){
                i++;
            }
            while (j >= 0 && nums[j] == newNums[j]){
                j--;
            }
            return (j - i + 1 > 0) ? j - i + 1 : 0;
        }
    }
}

