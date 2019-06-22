package 数组简单;

public class e633_平方数之和 {
    //简单双指针
    //发散:求平方根可以用二分法
    class Solution {
        public boolean judgeSquareSum(int c) {
            int end = (int) Math.sqrt(c);
            int start = 0;
            int sum = 0;
            while (start <= end){
                sum = start * start + end * end;
                if (sum == c) return true;
                if (sum > c){
                    end--;
                }else {
                    start++;
                }
            }
            return false;
        }
    }
}
