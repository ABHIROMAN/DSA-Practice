
class maximumSubarray {

    public static int maxSubArray(int[] a)  {
        int n = a.length;
        int dp[] = new int[n];
        int max  = a[0];

        dp[0] = a[0];

        for(int i = 1; i<n; i++) {
            dp[i] = Math.max(dp[i-1] + a[i], a[i]);

            if(dp[i] > max) {
                max = dp[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {

        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}