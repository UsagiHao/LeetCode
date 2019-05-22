package 数组简单;

public class e189_旋转数组 {
    class Solution {
        public void rotate(int[] nums, int k) {
            reverse(0, nums.length - 1 - k, nums);
            reverse(nums.length - k, nums.length - 1, nums);
            reverse(0, nums.length - 1, nums);
        }

        private void reverse(int x, int y, int[] nums){
            for (int i = x; i < (x + y) / 2; i++){
                nums[i] = nums[i] + nums[y - i + x];
                nums[y - i + x] = nums[i] - nums[y - i + x];
                nums[i] = nums[i] - nums[y - i + x];
            }
        }

       /* public void rotate_1(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            for (int i = 0; i < k; i++) {
                int temp = nums[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = temp;
            }
        }*/
    }
}
