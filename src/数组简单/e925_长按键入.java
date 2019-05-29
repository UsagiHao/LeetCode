package 数组简单;

public class e925_长按键入 {
//2333,做完发现和推荐答案解法一样
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            int nIndex = 0, tIndex = 0;
            while (nIndex < name.length() && tIndex < typed.length()){
                if (name.charAt(nIndex) == typed.charAt(tIndex)){
                    nIndex++;
                    tIndex++;
                }else {
                    tIndex++;
                }
            }
            return nIndex == name.length();
        }
    }
}
