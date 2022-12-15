package GFG30days.Day30;

import java.util.*;

public class kthSmallestElement {
    
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
       
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        for(int i = 0; i < k; i++) {
            
            pq.add(arr[i]);
        }
        
        for(int j = k; j < arr.length; j++) {
            
            if(pq.peek() > arr[j]) {
                
                pq.poll();
                pq.add(arr[j]);
            }
        }
        return pq.peek();
     }
}
