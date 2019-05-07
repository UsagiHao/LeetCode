package 数组简单;

import java.util.HashSet;

public class e888_公平的糖果交换 {
    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            int sumA = 0, sumB = 0;
            for (int i :A){
                sumA += i;
            }

            HashSet<Integer> set = new HashSet<>();
            for (int i :B){
                sumB += i;
                set.add(i);
            }

            int delta = (sumB - sumA) / 2;

            for (int i : A){
                if (set.contains(i + delta)) return new int[]{i, i + delta};
            }
            return null;
        }
    }
}
