package GFG30days.Day22;

import java.util.*;

public class permutationsOfGivenString {
    
    public List<String> find_permutation(String S) {

        List<String> arr = new ArrayList<String>();
        permutation(S, "", arr);
        Collections.sort(arr);
        return arr;
    }
    
    public void permutation(String str, String ans, List<String> list) {

        if(str.length() == 0) {
            if(!list.contains(ans)) 
                list.add(ans);
                return;
        }

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1, str.length());
            permutation(ros, ans+ch, list);
        }
    }
}
