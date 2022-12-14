package GFG30days.Day29;

public class maxmPathSum {
    
    static int maximumPath(int N, int Matrix[][]) {

        int m = Matrix[0].length;
        int dp[][] = new int[N][N];

        int ans = isSafe(Matrix, N, dp);

        return ans;

    }

    static int isSafe(int arr[][], int n, int dp[][]) {

        for(int j = 0; j < n; j++) {
            dp[0][j] = arr[0][j];
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {

                int s = arr[i][j] + dp[i-1][j];
                int ld = arr[i][j];

                if(j > 0) {
                    ld += dp[i-1][j-1];
                }
                else {
                    ld += Integer.MIN_VALUE;
                }
                int rd = arr[i][j];

                if(j + 1 < n) {
                    rd += dp[i-1][j+1];
                }
                else {
                    rd += Integer.MIN_VALUE;
                }
                dp[i][j] = Math.max(s, Math.max(ld, rd));
            }
        }

        int ans = Integer.MIN_VALUE;

        for(int j = 0; j < n; j++) {
            ans = Math.max(ans, dp[n-1][j]);
        }

        return ans;
    }
}
