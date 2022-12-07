package GFG30days.Day25;

import java.util.*;

public class removeDuplicates {
    
    String removeDups(String S) {

        HashSet<Character> set = new HashSet<Character>();

        String ans = "";

        for(int i = 0; i < S.length(); i++) {

            if(!set.contains(S.charAt(i))) {

                set.add(S.charAt(i));

                ans += S.charAt(i);
            }
        }
        return ans;
    }
}
