package 数组简单;

public class e345_反转字符串中的元音字母 {
    //头尾双指针，注意考虑大小写
    //循环终止条件是left < right,如果写成≤，会出现一个元音都没有的话，最终导致left = s.length()，从而使数组越界的情况
    class Solution {
        public String reverseVowels(String s) {
            if (s.equals("")) return s;
            char[] word = s.toCharArray();
            int left = 0, right = s.length() - 1;
            char temp = ' ';
            while (left < right){
                while (left < right && !isVowel(word[left])){
                    left++;
                }
                while (left < right && !isVowel(word[right])){
                    right--;
                }
                temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++;
                right--;
            }

            return new String(word);
        }

        private boolean isVowel(char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
                    || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
        }
    }
}
