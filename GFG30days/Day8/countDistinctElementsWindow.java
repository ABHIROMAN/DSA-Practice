package GFG30days.Day8;

import java.util.*;

public class countDistinctElementsWindow {

    ArrayList<Integer> countDistinct(int A[], int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < k; i++) {

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        list.add(map.size()); //This is for first window 

        for(int i = k; i < A.length; i++) {

            //Remove
            if(map.get(A[i-k]) == 1) {
                map.remove(A[i-k]);
            }
            else {
                map.put(A[i-k], map.get(A[i-k]) - 1);
            }

            //Add onr new element in Map
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            list.add(map.size());
        }

        return list;
    }
    
}
