package GFG30days.Day26;

import java.util.*;

public class uncommonChar {
    
    String UncommonChars(String A, String B) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        String ans = "";
        
        for(int i = 0; i < A.length(); i++) {
            map.put(A.charAt(i), 1);
        }
        
        for(int i = 0; i < B.length(); i++) {
            map1.put(B.charAt(i), 1);
        }
        
        for(int i = 0; i < A.length(); i++) {
            if(map1.containsKey(A.charAt(i)) && map.containsKey(A.charAt(i))) {
                continue;
            }
            else {
                if(!map2.containsKey(A.charAt(i))) {
                    
                    ans = ans + A.charAt(i);
                    map2.put(A.charAt(i), 1);
                }
            }
        }
        for(int i = 0; i < B.length(); i++){
              if(map.containsKey(B.charAt(i)) && map1.containsKey(B.charAt(i))){
                  continue;
              }
              else{
                   if(!map2.containsKey(B.charAt(i))){
                      
                  ans = ans + B.charAt(i);
                  map2.put(B.charAt(i),1);
                  }
              }
          }
        
        if(ans == "") {
            return "-1";
        }
        char aa[] = ans.toCharArray();
        Arrays.sort(aa);
        ans = new String(aa);
        return ans;
    }
}
