package GFG30days.Day16;

import java.util.*;

public class uncommonCharsMethod2 {

    String UncoomonChars(String A, String B) {

        HashMap<Character, Integer> map1 = new HashMap<>();

        HashMap<Character, Integer> map2 = new HashMap<>();

        HashSet<Character> set = new HashSet<>();

        String ans = "";

        for(char c : A.toCharArray()) {
            if(map1.containsKey(c)) {
                continue;
            }else {
                map1.put(c, 1);
            }
        }

        for(char c : B.toCharArray()) {
            if(map2.containsKey(c)) {
                continue;
            }else {
                map2.put(c, 1);
            }
        }

        for(char c : A.toCharArray()) {
            if(!map2.containsKey(c)) {
                set.add(c);
            }
        }

        for(char c : B.toCharArray()) {
            if(!map1.containsKey(c)) {
                set.add(c);
            }
        }

        for(char c : set) {
            ans = ans + c;
        }

        if(ans.length() == 0) {
            return "-1";
        }

        char arr[] = new char[ans.length()];

        arr = ans.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
    
}
