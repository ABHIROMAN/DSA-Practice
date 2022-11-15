package GFG30days.Day9;

import java.util.*;

public class findFirstRepeatedChar {

    String firstRepChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            if(map.get(s.charAt(i)) > 1) {

                return String.valueOf(s.charAt(i));
            }
        }
        return "-1";
    }
     
}
