package 字符串简单;

public class e680_验证回文字符串Ⅱ {
    //一开始想要在遇到s[i] != s[j]的时候跳过其中该删去的那项，count+1，继续判断。结果发现不知道该如何实现
    //其实只要在遇到s[i] != s[j]的时候，把i到j - 1项和i + 1到j项字串拿出来判断是否有回文就行了
    class Solution {
        public boolean validPalindrome(String s) {
            int left=0;
            int right=s.length()-1;//"abca"
            while(left<right) {//结束条件：left=right的时候
                //左右两边的字符不相等的时候，选择跳过左边或者右边的一个字符
                if(s.charAt(left)!=s.charAt(right)) {
                    return isPalindrome(s,left,right-1)||isPalindrome(s,left+1,right);
                }
                //左右两边的字符相等。
                left++;
                right--;
            }
            return true;
        }
        private boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i++) != s.charAt(j--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
