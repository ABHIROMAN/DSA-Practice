package GFG30days;

import java.util.*;

public class sumOfMiddleEleTwoSortArrays {
    
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i = 0; i < ar1.length; i++) {
            al.add(ar1[i]);
            al.add(ar2[i]);
        }
        
        Collections.sort(al);
        
        n = al.size() - 1;
        int sum = al.get(n/2) + al.get((n/2) + 1);
        
        return sum;
    }
}
