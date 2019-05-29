package 数组简单;

import java.util.Stack;

public class e844_比较含退格的字符串 {
    //用栈做就很简单
    /**题目要求是使用双指针，一开始没想到解法，后来发现其实和栈的思路是一致的：
    转为char[]，每个数组一个指针，遇到#就回退，这样前一位就会被覆盖掉。最后比较两个char[]是否一致即可*/
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            char[] s = S.toCharArray();
            char[] t = T.toCharArray();

            String s1 = toStack(s);
            String s2 = toStack(t);
            return s1.equals(s2);
        }

        private String toStack(char[] s){
            String result = "";
            Stack<Character> stack = new Stack<>();

            for (char c : s){
                if (c == '#'){
                    if (!stack.empty()){
                        stack.pop();
                    }
                }else {
                    stack.push(c);
                }
            }

            while (!stack.empty()){
                result += stack.pop();
            }
            return result;
        }
    }

/*    class Solution {
        public boolean backspaceCompare(String S, String T) {
            int sIndex = 0;
            int tIndex = 0;
            char[] s = new char[200];
            char[] t = new char[200];

            for (int i = 0; i < S.length(); i++) {
                char temp = S.charAt(i);
                if (temp == '#') {
                    if (sIndex == 0) {
                        continue;
                    }
                    sIndex--;
                } else {
                    s[sIndex++] = temp;
                }
            }

            for (int i = 0; i < T.length(); i++) {
                char temp = T.charAt(i);
                if (temp == '#') {
                    if (tIndex == 0) {
                        continue;
                    }
                    tIndex--;
                } else {
                    t[tIndex++] = temp;
                }
            }

            if (sIndex != tIndex) {
                return false;
            }

            for (int i = 0; i < sIndex; i++) {
                if (s[i] != t[i]) {
                    return false;
                }
            }
            return true;
        }
    }*/
}
