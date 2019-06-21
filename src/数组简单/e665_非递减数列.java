package 数组简单;

public class e665_非递减数列 {
    //数学问题，关键就是在nums[i] > nums[i + 1]时，究竟是把nums[i]变小，还是把nums[i + 1]变大
    //比较nums[i - 1] 与 nums[i + 1]的值，如果nums[i - 1]小，则选择把nums[i]变小；如果nums[i + 1]小，则选择把nums[i + 1]变大
    //开头两位由于不存在nums[i - 1]，所以选择把nums[0]变小
    class Solution {
        /*public boolean checkPossibility(int[] nums) {
            if (nums.length == 1) return true;

            int count = 0;

            if (nums[0] > nums[1]){
                nums[0] = nums[1];
                count++;
            }

            for (int i = 1; i < nums.length - 1; i++){
                if (nums[i] > nums[i + 1]){
                    count++;
                    if (count > 1) return false;
                    if (nums[i - 1] < nums[i + 1]){
                        nums[i] = nums[i - 1];
                    }else {
                        nums[i + 1] = nums[i];
                    }
                }
            }

            return true;
        }*/

        //贪心思想
        //我的理解是从左到右保证局部都是非递减的，如果遇到nums[i]<nums[i - 1]的情况，优先把nums[i - 1]变小，
        // 毕竟nums[i]变大之后，变得比nums[i + 1]大的风险也会增大
        //但是nums[i - 1]变小之后，还得判断它是否比nums[i - 2]小了，如果这样的话就不能把nums[i - 1]变小而只能选择把nums[i]变大
        public boolean checkPossibility(int[] nums) {
            int cnt = 0;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] < nums[i - 1]){
                    cnt++;
                    if(i - 2 >= 0 && nums[i - 2] > nums[i]) nums[i] = nums[i-1];
                    else nums[i - 1] = nums[i];
                }
            }
            return cnt <= 1;
        }
    }
}
