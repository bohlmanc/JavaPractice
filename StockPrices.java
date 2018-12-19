public class StockPrices {

	public int GetMaxProfit(int[] prices) {

		// After we've created out array, time to iterate...

		int minPrice = prices[0];		// keep track of minimum price
		int maxProfit = prices[1] - prices[0];				// keep track of max profit

		for(int i = 1;i<prices.length;i++) {

			int price = prices[i];
			int potentialProfit = price - minPrice;

			maxProfit = Math.max(potentialProfit,maxProfit);
			minPrice = Math.min(minPrice, prices[i]);

			System.out.println("Current min: "+minPrice + " current max profit: "+maxProfit);

		}

		return maxProfit;

	}

	public static void main(String[] args) {

		int[] testPrices = {1,4,3,2,5,0,2,7};
		StockPrices run = new StockPrices();
		System.out.println(run.GetMaxProfit(testPrices));

	}

}