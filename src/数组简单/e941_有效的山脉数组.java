package 数组简单;

public class e941_有效的山脉数组 {
//循环找到从左到右不再增的位置以及从右到左不再增的位置，比较这两个位置是否一致
    class Solution {
        public boolean validMountainArray(int[] A) {
            if (A == null || A.length < 3) return false;
            int left = 0;
            int right = A.length - 1;
            while (left < right){
                if (A[left] < A[left + 1]){
                    left++;
                }else{
                    break;
                }
            }
            while (right > 0){
                if (A[right] < A[right - 1]){
                    right--;
                }else{
                    break;
                }
            }
            if (left == A.length - 1 || right == 0) return false;
            return left == right;
        }
    }
}

