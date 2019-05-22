package 数组简单;

import java.util.HashMap;

public class e169_求众数 {

    //法一可改进，没必要把每个数的出现次数都算一遍，只要判断它是否 > n/2 即可
    //法三：排序后，众数一定出现在数组最中间
    class Solution {
/*        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer>  map = new HashMap<>();

            for (int num : nums){
                map.put(num, (map.containsKey(num) ? map.get(num) + 1 : 1));
            }

            int max = 0;
            int index = 0;

            for (int i = 0; i < nums.length; i++){
                if (map.get(nums[i]) > max){
                    max = map.get(nums[i]);
                    index = nums[i];
                }
            }
            return index;
        }*/

        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer>  map = new HashMap<>();

            for (int num : nums){
                map.put(num, (map.containsKey(num) ? map.get(num) + 1 : 1));
                if (map.get(num) > nums.length / 2) return num;
            }
            return 0;

        }
    }
}
