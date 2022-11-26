package GFG30days.Day19;

public class formAPalindrome {
    
    static int countMin(String str) {

        int n = str.length();

        StringBuilder sb = new StringBuilder(str);
        
        String s = sb.reverse().toString();

        //Using Longest Common Subsequence

        int dp[][] = new int[n+1][n+1];

        for(int i = 0; i <=n; i++) {

            for(int j = 0; j <= n; j++) {

                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (str.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return n - dp[n][n];
    }
}
