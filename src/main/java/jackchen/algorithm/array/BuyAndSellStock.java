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
}
