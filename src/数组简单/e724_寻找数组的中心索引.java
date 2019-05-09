package 数组简单;

public class e724_寻找数组的中心索引 {
    //一个指针从左到右移动，分别算出两边的和进行比较
    class Solution {
        public int pivotIndex(int[] nums) {
            if (nums == null || nums.length <= 2) return -1;

            int leftSum = 0;
            int rightSum = 0;
            int index = 0;

            for (int i = 1; i < nums.length; i++){
                rightSum += nums[i];
            }

            if (rightSum == 0) return 0;

            while (index < nums.length - 1){
                leftSum += nums[index];
                rightSum -= nums[index + 1];
                if (leftSum == rightSum) return index + 1;
                index++;
            }
            return -1;
        }
    }
}
