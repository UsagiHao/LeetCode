package 数组简单;

import java.util.HashMap;

public class e219_存在重复元素Ⅱ {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++){
                if (!map.containsKey(nums[i])){
                    map.put(nums[i], i);
                }else{
                    if ((i - map.get(nums[i])) <= k){
                        return true;
                    }
                    map.replace(nums[i], i);
                }
            }
            return false;
        }
    }
}
