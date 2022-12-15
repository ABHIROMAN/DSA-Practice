package GFG30days.Day30;

import java.util.*;

public class arrayPairSum {
    
    public boolean canPair(int[] nums, int k) {
        // Code here
        
        if(nums.length % 2 == 1) return false;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            int rem = ((nums[i] % k) + k) % k;
            
            if(!hm.containsKey(rem)) {
                hm.put(rem, 0);
            }
            hm.put(rem, hm.get(rem) + 1);
        }
        
        //Traversing Input array
        
        for(int i = 0; i < nums.length; i++) {
            
            int rem = ((nums[i] % k) + k) % k;
            
            if(2 * rem == k) {
                
                if(hm.get(rem) % 2 == 1) return false;
            }
            else if(rem == 0) {
                
                if(hm.get(rem) % 2 == 1) return false;
            }
            else {
                if (hm.get(k - rem) != hm.get(rem)) return false;
            }
        }
        return true;
        
    }
}
