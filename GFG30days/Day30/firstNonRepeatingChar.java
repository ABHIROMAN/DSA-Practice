package GFG30days.Day30;

import java.util.*;

public class firstNonRepeatingChar {
    
    public String FirstNonRepeating(String A) {
        // code here
        int vis[] = new int[26];
        
        String ans = "";
        
        ArrayList<Character> v = new ArrayList<>();
        
        for(int i = 0; i < A.length(); i++) {
            
            if(vis[A.charAt(i) - 'a'] == 0) {
                v.add(A.charAt(i));
            }
            vis[A.charAt(i) - 'a']++;
            
            int f = 0;
            
            for(Character c : v) {
                
                if(vis[c - 'a'] == 1) {
                    ans += c;
                    f = 1;
                    break;
                }
            }
            if(f == 0) ans += '#';
        }
        return ans;
    }
}
