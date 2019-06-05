package 栈简单;

import java.util.Stack;

public class e682_棒球比赛 {

    class Solution {
        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack<>();
            int sum = 0;
            for (String s : ops){
                if (s.equals("+")){
                    int top1 = stack.pop();
                    int top2 = stack.peek();
                    stack.push(top1);
                    stack.push(top1 + top2);
                    sum += (top1 + top2);
                }else if (s.equals("D")){
                    int top = stack.peek();
                    stack.push(top * 2);
                    sum += (top * 2) ;
                }else if (s.equals("C")){
                    int top = stack.pop();
                    sum -= top;
                }else {
                    stack.push(Integer.parseInt(s));
                    sum += Integer.parseInt(s);
                }
            }
            return sum;
        }
    }
}
