import java.util.*;

public class climbingStairs {

    // Top down approach
    public static int climbStairsTopDown(int n) {

        if(n == 0 || n == 1) return 1;

        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    //Bottom up approach

    public static int climbStairs(int n) {

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        return ClimbStairBottomUp(n, dp);
    }

    public static int ClimbStairBottomUp(int n, int dp[]) {


        if(n == 0 || n == 1) return 1;
        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];
        return dp[n] = ClimbStairBottomUp(n-1, dp) + ClimbStairBottomUp(n-2, dp);
    }

    public static void main(String[] args) {

        System.out.println(climbStairsTopDown(3));
    }
    
}
