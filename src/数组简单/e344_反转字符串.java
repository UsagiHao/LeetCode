package 数组简单;

public class e344_反转字符串 {

    class Solution {
        public void reverseString(char[] s) {
            char temp = ' ';
            for (int i = 0; i < s.length / 2; i++){
                temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = s[i];
            }
        }
    }
}
