package 数组简单;

public class e28_实现strStr {
    //双指针，主串和模式串各一个
    //本来的想法是逐位比较，但后来遇到了坑（没想到要不匹配时主串应该回退）
    //于是变成了主串按位for循环判断

    /**
     * 实可以直接主串和模式串按指针比较，匹配则进位，不匹配则主串指针回退，模式串指针归零
     */
/*    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle == null) return 0;
            if (needle.equals("")) return 0; //有点坑，只能用equals方法而不能用==
            int hIndex = 0, nIndex = 0;
            boolean flag = true;
            while (hIndex <= haystack.length() - needle.length()){
                flag = true;
                for (int i = 0; i < needle.length(); i++){
                    if (haystack.charAt(hIndex + i) != needle.charAt(nIndex + i)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    return hIndex;
                }
                hIndex++;
            }
            return -1;
        }
    }*/
    class Solution {
        public int strStr(String haystack, String needle) {
            char[] hayArr = haystack.toCharArray();
            char[] needArr = needle.toCharArray();
            int i = 0; //主串(haystack)的位置
            int j = 0; //模式串(needle)的位置
            while (i < hayArr.length && j < needArr.length) {
                if (hayArr[i] == needArr[j]) { // 当两个字符相等则比较下一个
                    i++;
                    j++;
                } else {
                    i = i - j + 1; // 一旦不匹配，i后退
                    j = 0; // j归零
                }
            }
            if (j == needArr.length) { //说明完全匹配
                return i - j;
            } else {
                return -1;
            }
        }
    }
}
