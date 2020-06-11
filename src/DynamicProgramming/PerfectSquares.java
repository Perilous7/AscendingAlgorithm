package DynamicProgramming;

import java.util.Arrays;

public class PerfectSquares {
    public static int solve(int n){
        if(checkSquare(n)){
            return 1;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        int[] square = new int[(int) Math.floor(Math.sqrt(n))];
        for(int i=0;i<square.length;i++){
            square[i]= (i+1)*(i+1);
        }

        dp[0] = 0;
        for(int i = 0;i<=n;i++){
            for(int j=0;j<square.length;j++){
                if(i>=square[j])
                dp[i]=Math.min(dp[i],dp[i-square[j]]+1);
            }
        }

        return dp[n];
    }

    public static boolean checkSquare(int x){
        double sq = Math.sqrt(x);
        return sq-Math.floor(sq)==0;
    }

    public static void main(String[] args) {
        System.out.println(solve(7));
        System.out.println(solve(12));
        System.out.println(solve(15));
        System.out.println(solve(16));

    }
}
