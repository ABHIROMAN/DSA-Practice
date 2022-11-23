package GFG30days.Day16;

import java.util.*;

public class arraySubsetOfAnotherArray {

    public String isSubset(long a1[], long a2[], long n, long m) {

        HashMap<Long, Integer> map = new HashMap<>();

        //Storing first array in the HashMap

        for(int i = 0; i < n; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
        }

        int count = 0;

        //Traversing on second array if value is present decrease
        // frequency by 1, if frequency is 0 or less then 0 then remove from map

        for(int i = 0; i < m; i++) {
            if(map.containsKey(a2[i])) {
                map.put(a2[i], map.get(a2[i]) - 1);
            }

            if(map.get(a2[i]) <= 0) {
                map.remove(a2[i]);
            }

            count ++;
        }

        return count == m ? "Yes" : "No";
    }
}
