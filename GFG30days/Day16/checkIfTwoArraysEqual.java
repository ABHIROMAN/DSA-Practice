package GFG30days.Day16;

import java.util.*;

public class checkIfTwoArraysEqual {
    
    public static boolean check(long A[],long B[],int N) {
        
        HashMap<Long, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<N; i++) {
            
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
            hm.put(B[i], hm.getOrDefault(B[i], 0) - 1);
        }
        
        for(long i : hm.keySet()) {
            if(hm.get(i) != 0) return false;
        }
        
        return true;
    }
}
