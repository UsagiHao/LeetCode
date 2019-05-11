package 数组简单;

public class e661_图片平滑器 {
    //读懂题意后直接暴力即可
    class Solution {
        public int[][] imageSmoother(int[][] M) {
            int[][] res = new int[M.length][M[0].length];
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    res[i][j] = sum(M, i, j);
                }
            }
            return res;
        }

        public int sum(int[][] M, int i, int j) {
            int row = M.length;
            int column = M[0].length;
            int count = 1;
            int left_up = 0;
            int left = 0;
            int left_down = 0;
            int up = 0;
            int down = 0;
            int right_up = 0;
            int right = 0;
            int right_down = 0;
            if (i - 1 >= 0) {
                up = M[i - 1][j];
                count++;
                if (j - 1 >= 0) {
                    left_up = M[i - 1][j - 1];
                    count++;
                }
                if (j + 1 < column) {
                    right_up = M[i - 1][j + 1];
                    count++;
                }
            }
            if (i + 1 < row) {
                down = M[i + 1][j];
                count++;
                if (j - 1 >= 0) {
                    left_down = M[i + 1][j - 1];
                    count++;
                }
                if (j + 1 < column) {
                    right_down = M[i + 1][j + 1];
                    count++;
                }
            }
            if (j - 1 >= 0) {
                left = M[i][j - 1];
                count++;
            }
            if (j + 1 < column) {
                right = M[i][j + 1];
                count++;
            }
            int sum = left + left_down + left_up + right + right_down + right_up + up + down + M[i][j];
            return sum / count;
        }
    }
}
