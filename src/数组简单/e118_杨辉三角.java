package 数组简单;

import java.util.ArrayList;
import java.util.List;

public class e118_杨辉三角 {

    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            if (numRows == 0) return result;
            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            result.add(row1);
            for (int i = 2; i <= numRows; i++){
                List<Integer> newRow = new ArrayList<>();
                newRow.add(1);
                List<Integer> aboveRow = result.get(result.size() - 1);
                for (int j = 0; j < aboveRow.size() - 1; j++){
                    newRow.add(aboveRow.get(j) + aboveRow.get(j + 1));
                }
                newRow.add(1);
                result.add(newRow);
            }
            return result;
        }
    }
}
