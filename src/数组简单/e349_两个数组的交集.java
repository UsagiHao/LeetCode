package 数组简单;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class e349_两个数组的交集 {

    //set存交集
/*    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> res = new HashSet<>();
            for(int n : nums1)
                set.add(n);
            for(int n : nums2)
                if(set.contains(n))
                    res.add(n);
            int[] result = new int[res.size()];
            int index = 0 ;
            for(int n : res)
                result[index++] = n;
            return result;
        }
    }*/
    //题目本意要求的双指针解法，先排序，之后双指针
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int[] arr = new int[nums1.length];
            int p = 0;
            int i = 0;
            int j = 0;
            while(i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    if (p == 0 || arr[p - 1] != nums1[i]) {
                        arr[p] = nums1[i];
                        p += 1;
                        i++;
                        j++;
                    } else if (arr[p - 1] == nums1[i]) {
                        i++;
                        j++;
                    }

                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
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
