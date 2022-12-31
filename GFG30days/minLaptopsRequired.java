package GFG30days;

import java.util.*;

public class minLaptopsRequired {
    
    public int minLaptops(int N, int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        
        int max1 = 0;
        int i = 0;
        int j = 0;
        int lap = 0;
        
        while(i < N) {
            
            if(end[j] > start[i]) {
                i++;
                lap++;
                max1 = Math.max(lap, max1);
            }
            else {
                lap--;
                j++;
            }
        }
        return max1;
    }
}
