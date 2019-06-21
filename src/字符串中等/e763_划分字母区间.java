package 字符串中等;

import java.util.ArrayList;
import java.util.List;

public class e763_划分字母区间 {
    //贪心
    //先保存每个字符最后一次出现的位置
    //从第一个字符开始遍历，每获取一个字符就取出其最后一次出现的位置，
    //在达到该位置之前，继续寻找这个字串中其他字符的更靠后的最后位置，
    //若达到最后位置之前都没有发现更靠后的最后位置，则将当前最后位置作为一个片段的末尾；否则则更新目前这个字串的最后位置
    //在每一步中得到截止目前为止的局部最优解，后一个最优解总是比前一个最优解“更优”， 由此推进到结束时，便可得到全局最优解。
    class Solution {
        public List<Integer> partitionLabels(String S) {
            List<Integer> result = new ArrayList<>();
            int[] lastIndex = new int[26];
            //记录每个字母最后一次出现的位置
            for (int i = 0; i < S.length(); i++){
                lastIndex[S.charAt(i) - 'a'] = i;
            }

            int start = 0;
            while (start < S.length()){
                int end = start;
                for(int i = start; i < S.length() && i <= end; i++) {
                    int last = lastIndex[S.charAt(i) - 'a'];
                    if(last == i) continue;
                    if(last > end) end = last;
                }
                result.add(end - start + 1);
                start = end + 1;
            }
            return result;
        }
    }
}
