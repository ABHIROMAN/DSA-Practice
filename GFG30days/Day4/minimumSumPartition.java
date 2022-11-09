package GFG30days.Day4;

import java.util.*;

public class minimumSumPartition {

    public int minDifference(int arr[], int n) {

        Map<String, Integer> map = new HashMap<>();

        return dfs(arr, n-1, 0, 0, map);
    }

    public int dfs(int arr[], int n, int s1, int s2, Map<String,Integer> map) {

        if(n < 0) return Math.abs(s1 - s2);

        String key = n + "," + s1;
        if(!map.containsKey(key)) {
            int first = dfs(arr, n-1, s1+arr[n], s2, map);
            int second = dfs(arr, n-1, s1, s2+arr[n], map);

            map.put(key, Math.min(first, second));
        }
        return map.get(key);
    }
    
}
