package 数组简单;

public class e832_翻转图像 {
    //没什么好说的，直接按题意来即可
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int row = A.length;
            int col = A[0].length;

            for (int i = 0; i < row; i++){
                for (int j = 0; j < col / 2; j++){
                    A[i][j] = A[i][j] + A[i][col - 1 - j];
                    A[i][col - 1 - j] = A[i][j] - A[i][col - 1 - j];
                    A[i][j] = A[i][j] - A[i][col - 1 - j];
                }
            }

            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    if (A[i][j] == 0) {
                        A[i][j] = 1;
                    }else{
                        A[i][j] = 0;
                    }
                }
            }
            return A;
        }
    }
}
