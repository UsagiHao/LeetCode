package 数组简单;

public class e717_1比特字符和2比特字符 {
    //数学知识，遇到0的时候不管是1比特还是2比特，都一定是前一组的结算位置。所以只需要统计最后一个0前面有多少个1即可
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            if (bits == null || bits.length < 1) {
                return false;
            }

            if (bits[bits.length - 1] == 1) {
                return false;
            }

            int i = bits.length - 1 - 1;
            int count = 0;

            while (i >= 0 && bits[i--] == 1) {
                count++;
            }

            return count % 2 == 0;
        }
    }
}
