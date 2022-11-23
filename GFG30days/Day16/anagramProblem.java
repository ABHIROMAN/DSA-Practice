package GFG30days.Day16;

import java.util.*;

public class anagramProblem {
    
    public static boolean isAnagram(String a, String b) {

        int n = a.length();
        int m = b.length();

        if(n != m) return false;

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i < n; i++) {

            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);

            if(hm1.containsKey(ch1)) {
                hm1.put(ch1, hm1.get(ch1) + 1);
            }
            else {
                hm1.put(ch1, 1);
            }
            
            if(hm2.containsKey(ch2)) {
                hm2.put(ch2, hm2.get(ch2) + 1);
            }
            else {
                hm2.put(ch2, 1);
            }
        }

        return hm1.equals(hm2);
    }
}
