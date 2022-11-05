public class countingBits {

    public static int[] getCount(int n) {

        int dp[] = new int[n+1];

        for(int i = 0; i<=n; i++) {

            dp[i] = 0;
        }

        for(int i = 1; i<=n; ++i) {

            int x = i >> 1;
            if(i % 2 == 0) dp[i] = dp[x];

            else dp[i] = dp[x] + 1;

        }

        return dp;
    }

    public static void main(String[] args) {

        System.out.println(getCount(5));
    }
    
}