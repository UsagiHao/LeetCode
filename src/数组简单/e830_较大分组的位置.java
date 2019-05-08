package 数组简单;

import java.util.*;

public class e830_较大分组的位置 {
    //从头到尾遍历，用一个变量计数即可，注意一下List<List<Integer>>的返回值类型，毕竟是不确定长度的动态数组
    //注意对结果按照字典顺序输出的理解，其实从头到尾遍历就已经是按字典序输出这个结果了
    class Solution {
        public List<List<Integer>> largeGroupPositions(String S) {
            List<List<Integer>> result = new ArrayList<>();
            char[] chars = S.toCharArray();
            int length = 0;

            for (int i = 0; i < chars.length - 1; i++){
                if (chars[i] == chars[i + 1]){
                    length++;
                }else{
                    if (length >= 2){
                        List<Integer> list = new ArrayList<>();
                        list.add(i - length);
                        list.add(i);
                        result.add(list);
                    }
                    length = 0;
                }
            }

            if (length >= 2){
                List<Integer> list = new ArrayList<>();
                list.add(chars.length - 1 - length);
                list.add(chars.length - 1);
                result.add(list);
            }
            return result;
        }
    }

}
