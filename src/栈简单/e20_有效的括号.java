package 栈简单;

import java.util.Stack;

public class e20_有效的括号 {

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] words = s.toCharArray();
            for (char c: words){
                if (c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }else {
                    if (stack.empty()) return false;
                    char top = stack.pop();
                    if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')){
                        continue;
                    }else return false;
                }
            }
            if (!stack.empty()) return false;
            return true;
        }
    }
}
