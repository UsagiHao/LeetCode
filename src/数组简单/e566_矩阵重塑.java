package 数组简单;

import java.util.Arrays;

public class e566_矩阵重塑 {

    class Solution {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
            int length = nums.length * nums[0].length;
            int newLength = r * c;
            if (newLength > length) return nums;

            int[][] result = new int[r][c];

            int row = 0, col = 0;
            for (int i = 0; i < r; i++){
                for (int j = 0; j < c; j++){
                    result[i][j] = nums[row][col];
                    col++;
                    if (col >= nums[0].length){
                        col = 0;
                        row++;
                    }
                }
            }
            return result;
        }
    }
}
