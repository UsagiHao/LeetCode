package 数组简单;

public class e896_单调数列 {
    //从前往后比较即可，注意边界
    class Solution {
        public boolean isMonotonic(int[] A) {
            int i = 0;
            int j = A.length - 1;
            while (i <= A.length - 1){
                if (i == A.length - 1) return true;
                if (A[i] <= A[i + 1]){
                    i++;
                }else break;
            }

            while (j >= 0){
                if (j == 0) return true;
                if (A[j] <= A[j - 1]){
                    j--;
                }else break;
            }

            return false;
        }
    }
}
