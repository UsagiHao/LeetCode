package 数组简单;

public class e605_种花问题 {
    //头尾两个0就可以种一棵，中间每有3个连续的0就把中间那个替换成1，种一棵
    //好难啊
    //19/06/21注：其实用贪心思想来做，好像也没有那么难
/*    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            if (n == 0) {
                return true;
            }
            if (flowerbed.length == 1) {
                if (n == 1 && flowerbed[0] == 0) {
                    return true;
                }
                return false;
            }
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                n--;
            }
            if (flowerbed.length > 2) {
                for (int i = 1; i != flowerbed.length - 1; i++) {
                    if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                    if (n <= 0) {
                        return true;
                    }
                }
                if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                    n--;
                }
            }
            if (n <= 0) {
                return true;
            }
            return false;
        }
    }*/

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1) continue;
            int pre = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
            if(pre == 0 && next == 0) {
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt >= n;
    }
}
