package DynamicProgramming;

import java.util.Arrays;

public class CoinsTakeOut {
    public static int coinChange(int[] coins){
        Arrays.sort(coins);
        int highestCoin = coins[coins.length-1];
        int[] dp = new int[highestCoin+1];
        int ans=0;
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        dp[1]=1;
        System.out.println(Arrays.toString(coins));
        for(int i=2;i<=highestCoin;i++){
                dp[i] = Math.min(dp[i-1]+1,dp[i-2]+1);
            }
        for(int coin: coins){
            ans+=dp[coin];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] coins ={1,2,5};
        System.out.println(coinChange(coins));
        coins = new int[]{4, 2, 1};
        System.out.println(coinChange(coins));
        coins = new int[]{2, 3, 10};
        System.out.println(coinChange(coins));

    }
}
