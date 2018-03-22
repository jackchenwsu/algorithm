package jackchen.algorithm.array;

public class BuyAndSellStock {

    /*
     * 121. Say you have an array for which the ith element is the price of a given stock on day i.
     * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     */
    public int maxProfit(int[] prices)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++)
        {
            if (prices[i] < minPrice) { minPrice = prices[i]; }

            if (prices[i] - minPrice > maxProfit)
            {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    /*
     * 122. Say you have an array for which the ith element is the price of a given stock on day i.
     * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
     * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
     */
    public int maxProfit2_1(int[] prices)
    {
        int maxProfit = 0;
        int i=0;

        while (i < prices.length-1)
        {
            // Find the valley
            while (i < prices.length-1 && prices[i] >= prices[i+1]) i++;
            int valley = prices[i];

            // Find the next peak
            while (i < prices.length-1 && prices[i] <= prices[i+1]) i++;
            int peak = prices[i];

            maxProfit += peak - valley;
        }

        return maxProfit;
    }

    public int maxProfit2_2(int[] prices)
    {
        int maxProfit = 0;

        for (int i=1; i<prices.length; i++)
        {
            if (prices[i] > prices[i-1])
            {
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}
