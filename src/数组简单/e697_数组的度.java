package 数组简单;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class e697_数组的度 {
    //暴力解法直接超时，下面两种解法思路一致，被注释掉的是自己写的耗时高解法
    //首先遍历数组，用hash表记录每个数字出现的频数以及第一次和最后一次出现的下标；然后找出频数最大的数字，
    // 计算【最后一次出现的下标-第一次出现的下标+1】。若有多个数字的频数都等于数组的度，则取长度最短的作为结果
    class Solution {
        public int findShortestSubArray(int[] nums) {
            int max = 0;
            for(int num : nums){
                max = Math.max(max, num);
            }
            int[] mapSize = new int[max+1];
            int[] mapMin = new int[max+1];
            int[] mapMax = new int[max+1];
            int maxSize = 1;
            for(int i = 0; i < nums.length; i++){
                int num = nums[i];
                if(mapSize[num] == 0){
                    mapMin[num] = i;
                    mapMax[num] = i;
                }else{
                    mapMax[num] = i;
                }
                maxSize = Math.max(maxSize, ++mapSize[num]);
            }
            int ans = Integer.MAX_VALUE;
            for(int num = 0; num <= max; num++){
                if(maxSize == mapSize[num]){
                    ans = Math.min(ans, mapMax[num] - mapMin[num] + 1);
                }
            }
            return ans;
        }
    }
/*    class Solution {
        public int findShortestSubArray(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            HashMap<Integer, List<Integer>> locMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++){
                if (!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(i);
                    locMap.put(nums[i], list);
                }else {
                    map.replace(nums[i], map.get(nums[i]) + 1);
                    List<Integer> list = locMap.get(nums[i]);
                    list.remove(1);
                    list.add(i);
                    locMap.replace(nums[i], list);
                }
            }

            int max = 0;
            for (int i = 0; i < nums.length; i++){
                if (map.get(nums[i]) > max){
                    max = map.get(nums[i]);
                }
            }

            int min = nums.length;

            for (int i = 0; i < nums.length; i++){
                if (map.get(nums[i]) == max){
                    List<Integer> list = locMap.get(nums[i]);
                    int temp = list.get(1) - list.get(0) + 1;
                    if (temp < min){
                        min = temp;
                    }
                }
            }

            return min;
        }
    }*/
}
