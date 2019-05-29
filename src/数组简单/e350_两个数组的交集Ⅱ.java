package 数组简单;

import java.util.Arrays;

public class e350_两个数组的交集Ⅱ {
//使用hashmap或者先排序再双指针
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int[] arr = new int[nums1.length];
            int p = 0;
            int i = 0;
            int j = 0;
            while(i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    arr[p] = nums1[i];
                    p += 1;
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                }
            }

            int[] res = new int[p];
            for (int k = 0; k < p; k++) {
                res[k] = arr[k];
            }
            return res;
        }
    }
}
