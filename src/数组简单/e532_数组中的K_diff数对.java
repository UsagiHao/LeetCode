package 数组简单;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class e532_数组中的K_diff数对 {
    //思路类似于两数之和的那题，一个map就可以解决
    class Solution {
        public int findPairs(int[] nums, int k) {
            if (k < 0 || nums.length < 2) return 0;
            int result = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums){
                int count = map.containsKey(num) ? map.get(num) + 1 : 1;
                map.put(num, count);
            }

            if (k == 0){
                for (int num: map.keySet()){
                    if (map.get(num) >= 2){
                        result++;
                    }
                }
            }else {
                for (int num: map.keySet()){
                    if (map.containsKey(num + k)){
                        result++;
                    }
                }
            }
            return  result;
        }
    }
}
