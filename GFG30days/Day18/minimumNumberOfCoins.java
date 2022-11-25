package GFG30days.Day18;

import java.util.*;

public class minimumNumberOfCoins {
    
    static List<Integer> minPartition(int N) {
        
        int deno[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        List<Integer> ans = new ArrayList<>();
        
        int n = deno.length;
        
        for(int i = n - 1; i >= 0; i--) {
            
            while (N >= deno[i]) {
            
            N -= deno[i];
            ans.add(deno[i]);
        }
    }
     return ans;   
    }
}
