
/**
 * You are given coins of different denominations and a total amount of money.
 * Write a function to compute the number of combinations that make up that
 * amount. You may assume that you have infinite number of each kind of coin.
 * 
 * Input: amount = 5, coins = [1, 2, 5] Output: 4 Explanation: there are four
 * ways to make up the amount: 5=5 5=2+2+1 5=2+1+1+1 5=1+1+1+1+1
 */

public class CoinChange2 {

    public int change(int amount, int[] coins) {
        int[] res = new int[amount + 1];
        res[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j < res.length; j++) {
                if (j >= coins[i]) {
                    res[j] += res[j - coins[i]];
                }
            }
        }
        return res[amount];
    }

    public static void main(String[] args) {
        CoinChange2 change2 = new CoinChange2();
        int[] arr1 = { 1, 2, 5 };
        System.out.println(change2.change(5, arr1));
    }
}