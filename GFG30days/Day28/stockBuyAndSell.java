package GFG30days.Day28;

import java.util.*;

public class stockBuyAndSell {
    
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 1; i  < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            
            if(A[i] > A[i-1]) {
                al.add(i-1);
                al.add(i);
                ans.add(al);
            }
        }
        return ans;
    }
}
