package 数组简单;

public class e766_托普利茨矩阵 {
    //考虑上三角矩阵的每一行第一个数，以及下三角矩阵每一列的第一个数，分别与它们的[i++][j++]比较，有不相等的则为false
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            for(int i = 0; i < matrix.length - 1; i++){
                int m = i;
                int n = 0;
                int temp = matrix[m][n];
                while(m < matrix.length && n < matrix[0].length){
                    if(matrix[m][n] != temp){
                        return false;
                    }
                    m++;
                    n++;
                }
            }
            for(int i = 1; i < matrix[0].length; i++){
                int m = 0;
                int n = i;
                int temp = matrix[m][n];
                while(m < matrix.length && n < matrix[0].length){
                    if(matrix[m][n] != temp){
                        return false;
                    }
                    m++;
                    n++;
                }
            }
            return true;
        }
    }
}
