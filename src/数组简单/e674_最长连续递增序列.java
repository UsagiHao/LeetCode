package 数组简单;

public class e674_最长连续递增序列 {
    //没什么好说的，遍历一遍就行了
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if (nums.length == 1) return 1;
            int index = 0;
            int max = 0;
            int increaseLength = 1;

            while (index < nums.length - 1){
                if (nums[index + 1] > nums[index]){
                    increaseLength++;
                }else{
                    increaseLength = 1;
                }
                if (max < increaseLength){
                    max = increaseLength;
                }
                index++;
            }

            return max;
        }
    }
}
