package 数组简单;

import java.util.HashSet;

public class e217_存在重复元素 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.contains(num)) {
                    set.add(num);
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
