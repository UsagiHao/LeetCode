package 数组简单;

import java.util.ArrayList;
import java.util.List;

public class e119_杨辉三角Ⅱ {
    //注释掉的是自己写的屑方法
    //
    class Solution {
        /*public List<Integer> getRow(int rowIndex) {
            List<Integer> result = new ArrayList<>();
            if (rowIndex == 0) {
                result.add(1);
                return result;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int i = 1; i <= rowIndex; i++){
                result.clear();
                result.add(1);
                for (int j = 0; j < temp.size() - 1; j++){
                    result.add(temp.get(j) + temp.get(j + 1));
                }
                result.add(1);
                temp.clear();
                for (int num : result){
                    temp.add(num);
                }
            }
            return result;
        }
            */
        /**
         * 获取杨辉三角的指定行
         * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
         * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
         */
        public List<Integer> getRow(int rowIndex) {
            List<Integer> res = new ArrayList<>(rowIndex + 1);
            long cur = 1;
            for (int i = 0; i <= rowIndex; i++) {
                res.add((int) cur);
                cur = cur * (rowIndex-i)/(i+1);
            }
            return res;
        }
    }
}
