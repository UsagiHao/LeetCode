package 数组中等;

public class e31_下一个排列 {
    //看了官方题解
    //如果整个数组降序，那肯定没法排成更大的数了
    //否则的话，从右往左遍历，到不再降序的那个点，即a[i] < a[i + 1]
    //接下来由于要把它变成字典序的下一个更大的数，因此就在i + 1到结尾这个降序的序列中去从右往左找，找到第一个>a[i]的数a[j]，将这两个数调换
    //为了保证是最小的那个“更大的数字”，因此还需要将第i位之后的那个降序序列整个翻转，变成升序。
    public class Solution {
        public void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i + 1] <= nums[i]) {
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (j >= 0 && nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }
            reverse(nums, i + 1);
        }

        private void reverse(int[] nums, int start) {
            int i = start, j = nums.length - 1;
            while (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
