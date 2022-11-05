import java.util.*;

public class decodeWays {
    
    public static int numDecodings(String s) {

        int n = s.length();
        int dp[] = new int[n+1];

        Arrays.fill(dp, -1);

        return helper(0, s, dp);

    }

    public static int helper(int i, String s, int dp[]) {

        if(i >= s.length()) return 1;

        if(s.charAt(i) == '0') return 0;

        if(dp[i] != -1) return dp[i];

        int one = 0, two = 0;

        one = helper(i+1, s, dp);

        if(i<s.length()-1 && Integer.parseInt(s.substring(i, i+2)) <= 26) {
            two = helper(i+2, s, dp);
        }
        return dp[i] = one + two;
    }

    public static void main(String[] args) {

        System.out.println(numDecodings("226"));
    }


}
