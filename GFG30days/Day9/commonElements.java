package GFG30days.Day9;

import java.util.*;

public class commonElements {
    
    public static ArrayList<Integer> common_element(int v1[], int v2[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < v1.length; i++) {
            map.put(v1[i], map.getOrDefault(v1[i], 0) + 1);
        }
        
        Arrays.sort(v2);

        for(int i : v2) {
            if(map.containsKey(i)) {
                ans.add(i);
                map.put(i, map.get(i) - 1);

                if(map.get(i) == 0) map.remove(i);
            }
        }

        Collections.sort(ans);
        return ans;
    }
    
}
