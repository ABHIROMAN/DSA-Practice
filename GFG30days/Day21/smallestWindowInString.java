package GFG30days.Day21;

import java.util.*;

public class smallestWindowInString {
    
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int k = 0; k < p.length(); k++) {
            map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0) + 1);
        }
        
        int min = Integer.MAX_VALUE;
        
        String mins = "-1";
        
        int count = 0;
        count = map.size();
        
        int i = 0, j = 0;
        
        while(j < s.length()) {
            
            if(map.get(s.charAt(j)) != null) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                
                if(map.get(s.charAt(j)) == 0) count--;
            }
            
            if(count > 0) j++;
            
            else {
                if(count == 0) {
                    while(count == 0) {
                        if(min > j - i + 1) {
                            mins = s.substring(i, j+1);
                            min = Math.min(min, j-i+1);
                        }
                        
                        if(map.get(s.charAt(i)) != null) {
                            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                            
                            if(map.get(s.charAt(i)) == 1) count++;
                        }
                        i++;
                    }
                    j++;
                }
            }
        }
        return mins;
    }
}
