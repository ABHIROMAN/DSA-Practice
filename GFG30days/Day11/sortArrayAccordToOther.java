package GFG30days.Day11;

import java.util.*;

public class sortArrayAccordToOther {
    
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int i : A1) {
            
            if(!map.containsKey(i)) {
                
                map.put(i, 1);
            }
            else {
                map.put(i, map.get(i) + 1);
            }
        }
        
        int ans[] = new int[N];
        int k = 0;
        
        for(int i = 0; i < M; i++) {
            
            if(map.containsKey(A2[i])) {
                
                int temp = map.get(A2[i]);
                
                for(int x = 0; x < temp; x++) {
                    
                    ans[k++] = A2[i];
                }
                map.remove(A2[i]);
            }
        }
        for(int i : map.keySet()) {
            
            for(int x = 0; x < map.get(i); x++) {
                
                ans[k++] = i;
            }
        }
        return ans;
    }
}
