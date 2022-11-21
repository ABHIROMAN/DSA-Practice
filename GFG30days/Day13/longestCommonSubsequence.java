package GFG30days.Day13;

public class longestCommonSubsequence {
    
    static int f(int i, int j, String s1, String s2, int dp[][]) {
        
        if(i < 0 || j < 0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)) {
            
            dp[i][j] = 1 + f(i-1, j-1, s1, s2, dp);
            return dp[i][j];
        }
        dp[i][j] = Math.max(f(i, j-1, s1, s2, dp), f(i-1, j, s1, s2, dp));
        return dp[i][j];
    }
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2) {
        
        int dp[][] = new int[x][y];
        
        for(int i = 0; i < x; i++) {
            
            for(int j = 0; j < y; j++) {
                
                dp[i][j] = -1;
            }
        }
        return f(x-1, y-1, s1, s2, dp);
        
    }
}
