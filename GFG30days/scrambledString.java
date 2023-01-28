package GFG30days;

import java.util.*;

public class scrambledString {
   
    static HashMap<String, Boolean> map;
    static boolean isScramble(String S1,String S2) {
        //code here
        map = new HashMap<>();
        return isSafe(S1, S2);
    }
    
    static boolean isSafe(String S1, String S2) {
        
        int n = S1.length();
        if(S1.equals(S2)) {
            
            map.put(S1 + S2, true);
            return true;
        }
        
        if(map.containsKey(S1+S2)) {
            
            return map.get(S1 + S2);
        }
        
        for(int i = 1; i < n; i++) {
            
            String a = S1.substring(0, i);
            String b = S2.substring(0, i);
            String c = S1.substring(i, n);
            String d = S2.substring(i, n);
            
            if(isSafe(a, b) && isSafe(c, d)) {
                map.put(S1+S2, true);
                return true;
            }
            
            String e = S1.substring(0, i);
            String f = S2.substring(n-i, n);
            String g = S1.substring(i, n);
            String h = S2.substring(0, n-i);
            
            if(isSafe(e, f) && isSafe(g, h)) {
                map.put(S1+S2, true);
                return true;
            }
        }
        map.put(S1 + S2, false);
        return false;
    }

}