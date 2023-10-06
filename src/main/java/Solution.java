import java.util.Arrays;

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[Math.max(n + 1, 5)];
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 4;
        for (int i = 5; i < n + 1 ; i++) {
            if((i - 1) % 3 == 0){
                dp[i] = dp[i - 1] * 4 / 3;
            }else dp[i] = dp[i - 1] * 3 / 2;
        }

        return dp[n];
    }
}
