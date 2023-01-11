package GFG30days;

import java.util.*;

public class miniTheSum {
    
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < N; i++) {
            
            pq.add(arr[i]);
        }
        
        long ans = 0;
        
        while(pq.size()>1) {
            
            int tmp1 = pq.poll();
            int tmp2 = pq.poll();
            
            ans += (tmp1 + tmp2);
            
            pq.add(tmp1 + tmp2);
        }
        return ans;
    }
}
