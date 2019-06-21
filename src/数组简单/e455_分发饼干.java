package 数组简单;

import java.util.Arrays;

public class e455_分发饼干 {
    //贪心思想
    //最优解一定是每个从小到大每个孩子拿到的都是刚好满足他需求的最小的那块饼干
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int i = 0, j = 0;
            while (i < g.length && j < s.length){
                if (g[i] <= s[j]){
                    i++;
                }
                j++;
            }
            return i;
        }
    }
}
