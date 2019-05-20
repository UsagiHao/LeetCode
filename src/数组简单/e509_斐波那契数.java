package 数组简单;

public class e509_斐波那契数 {
    //递归/迭代
    class Solution {
        public int fib(int N) {
/*        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N - 1) + fib(N - 2);*/
            if(N == 0) {
                return 0;
            }
            if(N == 1) {
                return 1;
            }
            int[] a = new int[N+1];
            a[0] = 0;
            a[1] = 1 ;
            for (int i = 2; i <= N; i++) {
                a[i] = a[i-2] + a[i-1];
            }
            return a[N];
        }
    }
}
