package GFG30days;

import java.util.*;

public class findLongestString implements Comparator<String> {
    
    public int compare(String obj1, String obj2) {
        if(obj1.length() == obj2.length()) {
            return obj2.compareTo(obj1);
        }
        return obj1.length() - obj2.length();
    }
    
    public static String longestString(int n, String[] arr) {
        // code here
        findLongestString obj = new findLongestString();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> l = new ArrayList<>();
        
        for(String s : arr) {
            l.add(s);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        Collections.sort(l, new findLongestString());
        
        for(int i = n-1; i >= 0; i--) {
            int len = l.get(i).length();
            boolean flag = false;
            for(int j = 0; j < len; j++) {
                String s = l.get(i).substring(0, j+1);
                if(!map.containsKey(s)) {
                    flag = true;
                }
            }
            if(flag == false) {
                return l.get(i);
            }
        }
        return "";
    }
}
