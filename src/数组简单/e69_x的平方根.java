package 数组简单;

public class e69_x的平方根 {
    //一个数 x 的开方 sqrt 一定在 0 ~ x 之间，并且满足 sqrt == x / sqrt 。可以利用二分查找在 0 ~ x 之间查找 sqrt
    class Solution {
        public int mySqrt(int x) {
            if(x <= 1) return x;
            int l = 1, h = x;
            while(l <= h){
                int mid = l + (h - l) / 2;
                int sqrt = x / mid;
                if(sqrt == mid) return mid;
                else if(sqrt < mid) h = mid - 1;
                else l = mid + 1;
            }
            return h; //注意不符合的时候返回值是h而不是-1，可以自己以8为例看一下，利用二分法逼近到最后的l=h,就算不是真的平方根，也是最接近的那个整数
        }
    }
}
