package 数组简单;

public class e905_按奇偶排序数组 {
    //头尾双指针，从头遍历遇到奇数就换到后面
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            if (A == null || A.length <= 1) return A;
            int left = 0;
            int right = A.length - 1;
            while (left < right){
                if ((A[left] & 1) == 1){
                    A[right] = A[left] + A[right];
                    A[left] = A[right] - A[left];
                    A[right] = A[right] - A[left];
                    right--;
                }else{
                    left++;
                }
            }
            return A;
        }
    }
}
