package GFG30days.Day8;

import java.util.*;

public class minimumIndexedChar {


    public static int minIndexChar(String str, String patt) {


        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < patt.length(); i++) {

            map.put(patt.charAt(i), i);
        }

        for(int j = 0; j < str.length(); j++) {

            if(map.containsKey(str.charAt(j))) {
                return j;
            }
        }
        return -1;
    }
}
