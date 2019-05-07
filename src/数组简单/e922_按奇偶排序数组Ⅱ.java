package 数组简单;

public class e922_按奇偶排序数组Ⅱ {
//奇偶双指针，如果奇数位为偶数且偶数位为奇数，则交换；否则继续往前，注意每次要+=2
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            if (A == null || A.length == 0) return A;
            int even = 0;
            int odd = 1;
            int length = A.length;
            while (even < length && odd < length){
                if ((A[even] & 1) == 1 && (A[odd] & 1) == 0){
                    A[even] = A[even] + A[odd];
                    A[odd] = A[even] - A[odd];
                    A[even] = A[even] - A[odd];
                }else if ((A[even] & 1) == 0){
                    even+=2;
                }else if ((A[odd] & 1) == 1){
                    odd+=2;
                }
            }
            return A;
        }
    }
}

