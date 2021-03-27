package Algos.ArraysAndStrings.Arrays;

import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/14/2017.
 */
public class MaxProfit {
    /*
    Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
     */

    private int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int today = 0; today < prices.length; today++) {
            if (prices[today] < minPrice)
                minPrice = prices[today];
            else if (prices[today] - minPrice > maxProfit)
                maxProfit = prices[today] - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        System.out.println("****BEST TIME TO BUY AND SELL STOCK***");
        System.out.println("Maximum profit from the given stock: " + mp.maxProfit(new Inputs().getIntArray()));
    }
}
