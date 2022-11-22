package GFG30days.Day15;

import java.util.*;

public class maximizeCutsegments {

    public int helper(int n, int arr[], int dp[]) {

        if(n == 0) return 0;

        if(n < 0) return Integer.MIN_VALUE;

        if(dp[n] != -1) return dp[n];

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<3; i++) {

            int ans = helper(n-arr[i], arr, dp);

            if(ans != Integer.MIN_VALUE) {

                max = Math.max(max, ans+1);
            }
        }

        return dp[n] = max;
    }

    public int maximizeCuts(int n, int x, int y, int z) {

        int arr[] = {x, y, z};

        int dp[] = new int[n+1];

        Arrays.fill(dp, -1);

        int res = helper(n, arr, dp);

        if(res == Integer.MIN_VALUE) {

            return 0;
        }

        return res;
    }
    
}
