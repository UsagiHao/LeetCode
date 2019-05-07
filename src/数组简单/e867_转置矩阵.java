package 数组简单;

public class e867_转置矩阵 {
    //emmm没什么好说的
    class Solution {
        public int[][] transpose(int[][] A) {
            int[][] B = new int[A[0].length][A.length];
            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < A[0].length; j++){
                    B[j][i] = A[i][j];
                }
            }
            return B;
        }
    }
}
