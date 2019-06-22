package 数组中等;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class e406_根据身高重建队列 {
    //先按h升序，k降序的顺序排列数组
    //排完之后将结果按序插入到list的第people[i][1]位即可
    //因为每次待插入的数x，都肯定不比list里已有的数大；所以要满足它前面有k个数大于等于它，只需将它插到第k位即可
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            if(people == null || people.length == 0 || people[0].length == 0) return new int[0][0];

            Arrays.sort(people, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    if(a[0] == b[0]) return a[1] - b[1];
                    return b[0] - a[0];
                }
            });

            int n = people.length;
            List<int[]> tmp = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});
            }

            int[][] ret = new int[n][2];
            for(int i = 0; i < n; i++) {
                ret[i][0] = tmp.get(i)[0];
                ret[i][1] = tmp.get(i)[1];
            }
            return ret;
        }
    }
}
