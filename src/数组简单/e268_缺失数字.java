package 数组简单;

import java.util.HashSet;
import java.util.TreeSet;

public class e268_缺失数字 {

    class Solution {
        public int missingNumber(int[] nums) {
            int[] a = new int[nums.length + 1];
            for (int num : nums){
                a[num] = 1;
            }
            for (int i = 0; i < a.length; i++){
                if (a[i] == 0) {
                    return i;
                }
            }
            return 0;
        }
    }
}
