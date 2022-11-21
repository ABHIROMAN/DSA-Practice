package GFG30days.Day13;

public class longestIncreasingSubsequence {
    
    static int longestSubsequence(int size, int a[]) {

        int dp[] = new int[size];

        for(int i = 0; i < size; i++) {

            dp[i] = 1;
        }

        for(int i = 1; i < size; i++) {

            for(int j = 0; j < i; j++) {

                if(a[i] > a[j] && dp[i] < dp[j] + 1) {

                    dp[i] = dp[j] + 1;
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++) {
            if(ans < dp[i]) {
                ans = dp[i];
            }
        }

        return ans;
    }
}
