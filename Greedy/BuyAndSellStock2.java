public class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            prices[i - 1] = prices[i] - prices[i - 1];
            sum = Math.max(sum, sum + prices[i - 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();
        int[] arr1 = { 7, 1, 5, 3, 6, 4 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = { 7, 6, 4, 3, 1 };
        System.out.println(buyAndSellStock2.maxProfit(arr1));
        System.out.println(buyAndSellStock2.maxProfit(arr2));
        System.out.println(buyAndSellStock2.maxProfit(arr3));
    }
}