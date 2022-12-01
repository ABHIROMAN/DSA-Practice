package GFG30days.Day21;

import java.util.*;

public class longestDistCharInStr {
    
    static int longestSubstrDistinctChars(String s) {

        Set<Character> set = new HashSet<>();

        int res = 0;
        int n = s.length();

        for(int i = 0; i < n; i++) {

            for(int j = i; j < n; j++) {

                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
            }

            int temp = set.size();
            res = Math.max(res, temp);
            set.clear();
        }
        return res;
    }
}
