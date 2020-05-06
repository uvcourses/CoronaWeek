package daily.string;

import java.util.ArrayList;
import java.util.List;

public class MaxProfit {

	public int maxProfit(int[] prices) {

		int minPricesSoFar = Integer.MAX_VALUE;
		int maxTotalProfit = 0;
		List<Integer> firstBuySellProfit = new ArrayList<Integer>();

		for (int i = 0; i < prices.length; ++i) {
			minPricesSoFar = Math.min(minPricesSoFar, prices[i]);
			maxTotalProfit = Math.max(maxTotalProfit, prices[i] - minPricesSoFar);
			firstBuySellProfit.add(maxTotalProfit);
		}

		int maxPriceSoFar = Integer.MIN_VALUE;

		for (int j = prices.length - 1; j > 0; --j) {
			maxPriceSoFar = Math.max(maxPriceSoFar, prices[j]);
			maxTotalProfit = Math.max(maxTotalProfit, maxPriceSoFar - prices[j] + firstBuySellProfit.get(j - 1));
		}
		System.out.println(maxTotalProfit);
		return maxTotalProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxProfit m = new MaxProfit();
		m.maxProfit(new int[] { 3, 3, 5, 0, 0, 3,1,4 });
	}

}
