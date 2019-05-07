package 数组简单;

import java.util.HashMap;
import java.util.Iterator;

public class e914_卡牌分组 {
    //hashmap统计每个数字出现的次数
    //注意之前对题意理解有误，只要两个数字出现的次数有最大公约数即可，并不一定要求非得相同。
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            if (deck == null || deck.length < 2) return false;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < deck.length; i++){
                if (!map.containsKey(deck[i])){
                    map.put(deck[i], 1);
                }else {
                    map.replace(deck[i], map.get(deck[i]) + 1);
                }
            }
            for (int i = 0; i < deck.length - 1; i++){
                if (getGCD(map.get(deck[i]), map.get(deck[i + 1])) == 1)  return false;
            }
            return true;
        }

        public int getGCD(int a, int b){
            if (a == 0) return b;
            return getGCD(b % a, a);
        }

    }
}
