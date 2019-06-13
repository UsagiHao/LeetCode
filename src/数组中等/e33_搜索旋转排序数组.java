package 数组中等;

public class e33_搜索旋转排序数组 {
    //又是不会做的一题
    //要求O(logn)的时间复杂度，肯定是要二分查找
    //关键想法是，找出数组被旋转的那个点
    //和nums[0]和target比较，target大的话就肯定在数组的左半部分里，否则就肯定在数组的右半部分里
    //这时候对确定了的那部分数组进行二分查找即可
    class Solution {
        int [] nums;
        int target;

        public int find_rotate_index(int left, int right) {
            if (nums[left] < nums[right])
                return 0;

            while (left <= right) {
                int pivot = (left + right) / 2;
                if (nums[pivot] > nums[pivot + 1])
                    return pivot + 1;
                else {
                    if (nums[pivot] < nums[left])
                        right = pivot - 1;
                    else
                        left = pivot + 1;
                }
            }
            return 0;
        }

        public int search(int left, int right) {
    /*
    Binary search
    */
            while (left <= right) {
                int pivot = (left + right) / 2;
                if (nums[pivot] == target)
                    return pivot;
                else {
                    if (target < nums[pivot])
                        right = pivot - 1;
                    else
                        left = pivot + 1;
                }
            }
            return -1;
        }

        public int search(int[] nums, int target) {
            this.nums = nums;
            this.target = target;

            int n = nums.length;

            if (n == 0)
                return -1;
            if (n == 1)
                return this.nums[0] == target ? 0 : -1;

            int rotate_index = find_rotate_index(0, n - 1);

            // if target is the smallest element
            if (nums[rotate_index] == target)
                return rotate_index;
            // if array is not rotated, search in the entire array
            if (rotate_index == 0)
                return search(0, n - 1);
            if (target < nums[0])
                // search in the right side
                return search(rotate_index, n - 1);
            // search in the left side
            return search(0, rotate_index);
        }
    }
}
