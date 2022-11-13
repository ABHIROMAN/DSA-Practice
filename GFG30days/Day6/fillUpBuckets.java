package GFG30days.Day6;

import java.util.*;

public class fillUpBuckets {
    
    public int totalWays(int n, int capacity[]) {

        long ans = 1, mod = 1000000007;

        Arrays.sort(capacity);

        for(int i = 0; i < n; i++) {

            ans = (ans * (capacity[i] - i)) % mod;
        }
        return (int)ans;
    }
}
