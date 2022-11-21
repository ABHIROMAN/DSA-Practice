package GFG30days.Day14;

public class partitionEqualSubsetSum {
    
    static int helper(int N, int arr[], int target, int dp[][]) {

        if(target == 0) return 1;

        if(N == 0) return 0;

        if(dp[N][target] != -1) {

            return dp[N][target];
        }

        if(arr[N-1] > target) {

            return dp[N][target] = helper(N-1, arr, target, dp);
        }

        int pick = helper(N-1, arr, target-arr[N-1], dp);
        int notpick = helper(N-1, arr, target, dp);

        return dp[N][target] = pick | notpick;
    }

    static int equalPartition(int N, int arr[]) {

        int sum = 0;
        for(int i = 0; i < N; i++) {

            sum += arr[i];
        }

        if(sum % 2 != 0) return 0;

        int target = sum/2;

        int dp[][] = new int[N+1][target+1];
        for(int i = 0; i < N+1; i++) {

            for(int j = 0; j < target+1; j++) {

                dp[i][j] = 1;
            }
        }

        return helper(N, arr, target, dp);
    }
}
