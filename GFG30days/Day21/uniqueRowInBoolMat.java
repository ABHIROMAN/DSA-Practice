package GFG30days.Day21;

import java.util.*;

public class uniqueRowInBoolMat {
    
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        int row = a.length, col = a[0].length;
        
        for(int i = 0; i < row; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int sum = 0;
            
            for(int j = col-1; j>=0; j--) {
                temp.add(a[i][j]);
                sum += a[i][j] * Math.pow(2, col-j-1);
            }
            
            if(!set.contains(sum)) {
                set.add(sum);
                Collections.reverse(temp);
                res.add(temp);
            }
        }
        return res;
    }
}
