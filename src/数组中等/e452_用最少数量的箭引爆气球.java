package 数组中等;

import java.util.Arrays;

public class e452_用最少数量的箭引爆气球 {

    class Solution {
        public int findMinArrowShots(int[][] points) {
            if(points.length == 0) return 0;
            Arrays.sort(points,(a, b) -> (a[1] - b[1]));
            int end = points[0][1];
            int result = 1;
            for (int i = 1; i < points.length; i++){
                if (points[i][0] <= end){
                    continue;
                }
                result++;
                end = points[i][1];
            }
            return result;
        }
    }
}
