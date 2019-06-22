package 字符串中等;

import java.util.Collections;
import java.util.List;

public class e524_通过删除字母匹配到字典里最长单词 {

    class Solution {
        public String findLongestWord(String s, List<String> d) {
            String result = "";
            Collections.sort(d);
            for (String str: d){
                for (int i = 0, j = 0; i < s.length() && j < str.length(); i++){
                    if (s.charAt(i) == str.charAt(j)){
                        j++;
                    }
                    if (j == str.length()){
                        if (str.length() > result.length()){
                            result = str;
                        }
                    }
                }
            }
            return result;
        }
    }
}
