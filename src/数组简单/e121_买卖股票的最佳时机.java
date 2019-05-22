package 数组简单;

public class e121_买卖股票的最佳时机 {
    //传说中的动态规划思想？
    //可以把数组的值对应的点连接起来，看成有峰和谷的折线
    // 我们需要找到最小的谷之后的最大的峰。 可以维持两个变量——minprice 和 maxprofit
    // 它们分别对应迄今为止所得到的最小的谷值和最大的利润（卖出价格与最低价格之间的最大差值）。
    //循环比较即可
    //（动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}）
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 1) return 0;
            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 0; i < prices.length; i++){
                if (prices[i] < minPrice){
                    minPrice = prices[i];
                }
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            }
            return maxProfit;
        }
    }
}
