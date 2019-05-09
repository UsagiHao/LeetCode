package 数组简单;

import java.util.Arrays;
import java.util.Collections;

public class e747_至少是其他数字两倍的最大数 {
    //法一简单，但要注意值传递和引用传递的问题，以及Arrays.sort的平均时间复杂度为o(nlgn)，法二直接遍历找最大值，更快
    class Solution {
/*        public int dominantIndex(int[] nums) {
            if (nums.length <= 1) return 0;
            int[] newNum = nums.clone(); //注意如果不调用clone方法的话，相当于只传了一个引用
            Arrays.sort(newNum);
            int max = newNum[newNum.length - 1];
            if (max >= (2 * newNum[newNum.length - 2])){
                for (int i = 0; i < nums.length; i++){
                    if (nums[i] == max){
                        return i;
                    }
                }
            }else {
                return -1;
            }

            return -1;
        }*/

        public int dominantIndex(int[] nums) {
            //find max num
            int max = 0;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > max){
                    max = nums[i];
                    index = i;
                }
            }
            int half = max/2;
            for (int i = 0; i < nums.length; i++) {
                if(i == index)continue;
                if(half >= nums[i]){
                    continue;
                }else{
                    return -1;
                }
            }
            return index;
        }
    }

}
