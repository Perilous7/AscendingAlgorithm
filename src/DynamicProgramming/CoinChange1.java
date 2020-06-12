package DynamicProgramming;

import java.util.Arrays;

public class CoinChange1 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        return dp[amount]>amount? -1:dp[amount];
    }


    public static void main(String[] args) {
        int[] coins ={186,419,83,408};
        System.out.println(coinChange(coins, 6249));
        coins = new int[]{2,3,5};
        System.out.println(coinChange(coins, 6));
    }
}
