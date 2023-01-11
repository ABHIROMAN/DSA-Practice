package GFG30days;

import java.util.*;

class makeArrayEleUniq {
    
    public long minIncrements(int[] arr, int N) {
        // Code here
        Arrays.sort(arr);
        long ans  = 0;
        
        for(int i = 1; i < arr.length; i++) {
            
            if(arr[i-1] >= arr[i]) {
                
                ans += (long)(arr[i-1] - arr[i] + 1);
                arr[i] = arr[i-1] + 1;
            }
        }
        return ans;
    }
}