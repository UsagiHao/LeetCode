package 数组简单;

public class e122_买卖股票的最佳时机Ⅱ {
    //其实就是转化为统计连续的谷底和峰顶之间的价格差，因为连续的两个谷底和峰顶价格差A、B，加起来的和肯定大于第一个谷底到第二个峰顶的价格差C
    //也可以直接简化为：只要第二天的价格比第一天低，就可以卖掉算利润

    /**注意while循环的时候，内存循环似乎不会判断外层循环的终止条件
     * 第14行如果不加上和外层相同的判断条件index < prices.length - 1，会报数组越界
     */
    class Solution {
        public int maxProfit(int[] prices) {
            int valley = prices[0];//谷底
            int peak = prices[0];//峰顶
            int maxProfit = 0;
            int index = 0;
            while (index < prices.length - 1){
                while (index < prices.length - 1 && prices[index] >= prices[index + 1]){ //注意循环终止条件
                    index++;
                }
                valley = prices[index];
                while (index < prices.length - 1 && prices[index] <= prices[index + 1]){ //注意循环终止条件
                    index++;
                }
                peak = prices[index];
                maxProfit = maxProfit + peak - valley;
            }
            return maxProfit;
        }
    }

/*    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 1) return 0;
            int maxProfit = 0;
            int index = 0;
            while (index < prices.length - 1){
                if (prices[index] < prices[index + 1]){
                    maxProfit = maxProfit + prices[index + 1] - prices[index];
                }
                index++;
            }
            return maxProfit;
        }
    }*/
}
