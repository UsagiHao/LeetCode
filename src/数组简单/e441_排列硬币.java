package 数组简单;

public class e441_排列硬币 {
    //简单数学题
    class Solution {
        public int arrangeCoins(int n) {
            if (n <= 1) return n;
            int i = 1;
            int result = 0;
            while (n > 0){
                n = n - i;
                i++;
                result++;
            }
            return (n ==0) ? result : result - 1;
        }
    }
}
