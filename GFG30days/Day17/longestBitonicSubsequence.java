package GFG30days.Day17;

import java.util.*;

public class longestBitonicSubsequence {
    
    public int LongestBitonicSequence(int[] nums) {
        
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        
        for(int i = 1; i < nums.length; i++) {
            
            for(int j = 0; j < i; j++) {
                
                if(nums[i] > nums[j]) {
                    
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        
        int a[] = new int[nums.length];
        Arrays.fill(a, 1);
        
        for(int i = nums.length - 2; i >= 0; i--) {
            for(int j = nums.length-1; j > i; j--) {
                if(nums[i] > nums[j]) {
                    a[i] = Math.max(a[i], a[j] + 1);
                }
            }
        }
        
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            ans = Math.max(ans, (dp[i] + a[i] - 1));
        }
        
        return ans;
    }
}
