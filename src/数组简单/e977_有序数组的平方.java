package 数组简单;

public class e977_有序数组的平方 {
    //头尾双指针，比较绝对值的大小，把大的那方插入到结果数组的最后
    class Solution {
        public int[] sortedSquares(int[] A) {
            int n = A.length;
            int left = 0;
            int right = n - 1;
            int[] result = new int[n];
            while (left <= right){
                int x = Math.abs(A[left]);
                int y = Math.abs(A[right]);
                if (x >= y){
                    result[--n] = x * x;
                    left++;
                }else {
                    result[--n] = y * y;
                    right--;
                }
            }
            return result;
        }
    }
}



