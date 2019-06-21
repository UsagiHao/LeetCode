package 字符串中等;

public class e392_判断子序列 {
    //贪心思想
    //这里的保证局部最优解其实就是从左到右依次判断啦
    class Solution {
        public boolean isSubsequence(String s, String t) {
            for (int i = 0, pos = 0; i < s.length(); i++, pos++) {
                pos = t.indexOf(s.charAt(i), pos); //注意这个indexof方法
                if(pos == -1) return false;
            }
            return true;
        }
    }
}
