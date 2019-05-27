package 数组简单;

public class e88_合并两个有序数组 {
    //双指针，从后往前、从大往小合并
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int index = nums1.length - 1, index1 = m - 1, index2 = n - 1;
            while (index1 >= 0 && index2 >= 0){
                if (nums1[index1] > nums2[index2]){
                    nums1[index] = nums1[index1];
                    index1--;
                }else{
                    nums1[index] = nums2[index2];
                    index2--;
                }
                index--;
            }

            while (index1 >= 0){
                nums1[index] = nums1[index1];
                index--;
                index1--;
            }

            while (index2 >= 0){
                nums1[index] = nums2[index2];
                index--;
                index2--;
            }
        }
    }
}
