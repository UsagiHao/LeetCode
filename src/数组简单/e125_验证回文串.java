package 数组简单;

public class e125_验证回文串 {
    //左右双指针，注意内层循环的判断条件问题，上次就被坑过了
    class Solution {
        public boolean isPalindrome(String s) {
            if (s == null || s.equals("")) return true;
            s = s.toLowerCase();
            int left = 0, right = s.length() - 1;

            while (left < right){
                while (!isValid(s.charAt(left)) && left < right){
                    left++;
                }
                while (!isValid(s.charAt(right)) && right > left){
                    right--;
                }
                if (s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }

        private boolean isValid(char a){
            if ((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9')) return true;
            return false;
        }
    }
}
