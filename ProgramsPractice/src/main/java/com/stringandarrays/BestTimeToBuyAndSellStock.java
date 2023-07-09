package com.stringandarrays;

//Solution:Nikhil Lohia - Youtube
//Best time to buy and sell stock
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 25, 2, 5, 6, 3, 8 };

		int maxProfit = 0;

		int buyPrice = prices[0];

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] < buyPrice) {
				buyPrice = prices[i];
			} else {
				int currentProfit = prices[i] - buyPrice;
				maxProfit = Math.max(currentProfit, maxProfit);
			}
		}

		System.out.println(maxProfit);
	}

}
