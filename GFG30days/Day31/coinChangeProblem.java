package GFG30days.Day31;

public class coinChangeProblem {
    
    // public long count(int coins[], int N, int sum) {        // Recursion with TLE
    //     // code here.
    //     return utilFun(coins,N-1,sum);
    // }
    
    // public long utilFun(int coins[], int n, int sum){
        
    //     if(n==0) return (sum%coins[0]==0)?1:0;
    //     long take = 0;
    //     if(coins[n]<=sum)
    //         take = utilFun(coins,n,sum-coins[n]);
    //     long notTake = 0 + utilFun(coins,n-1,sum);
    //     return take + notTake;
    // }
    
    // public long count(int coins[], int N, int sum) {        // Recursion with DP
    //     // code here.
    //     long [][] dp = new long[N][sum+1];
    //     for(long[] row:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return utilFun(coins,N-1,sum,dp);
    // }
    
    // public long utilFun(int coins[], int n, int sum,long [][] dp){
        
    //     if(n==0) return (sum%coins[0]==0)?1:0;
    //     if(dp[n][sum]!=-1) return dp[n][sum]; 
        
    //     long take = 0;
    //     if(coins[n]<=sum)
    //         take = utilFun(coins,n,sum-coins[n],dp);
    //     long notTake = utilFun(coins,n-1,sum,dp);
    //     dp[n][sum] = take + notTake;
    //     return dp[n][sum];
    // }
    
    // public long count(int coins[], int N, int sum) {        // Tabulation
    //     // code here.
    //     long [][] dp = new long[N][sum+1];
    //     for(int val=0;val<=sum;val++){
    //         dp[0][val]= (val%coins[0]==0)?1:0;
    //     }
        
    //     for(int i=1;i<N;i++){
    //         for(int val=0;val<=sum;val++){
    //             long take = 0;
    //             if(coins[i]<=val)
    //                 take = dp[i][val-coins[i]];
    //             long notTake = dp[i-1][val];
    //             dp[i][val] = take + notTake;
    //         }
    //     }
    //     return dp[N-1][sum];
    // }
    
    public long count(int coins[], int N, int sum) {        // Tabulation with space optz
        // code here.
        long [] prev = new long[sum+1];
        long [] curr = new long[sum+1];
        
        for(int val=0;val<=sum;val++){
            prev[val]= (val%coins[0]==0)?1:0;
        }
        
        for(int i=1;i<N;i++){
            for(int val=0;val<=sum;val++){
                long take = 0;
                if(coins[i]<=val)
                    take = curr[val-coins[i]];
                long notTake = prev[val];
                curr[val] = take + notTake;
            }
            prev=curr;
        }
        return prev[sum];
    }
}
