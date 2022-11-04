public class divisorGame {
    
    public static boolean divisorG(int n) {

        boolean dp[] = new boolean[n+1];
        dp[1] = false;

        for(int i = 2; i <= n; i++) {
            for(int j = i-1; j>=1; j--) {
                if(i % j == 0 && dp[i-j] == false) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        System.out.println(divisorG(3));
        System.out.println(divisorG(2));
    }
}
