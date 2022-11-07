package GFG30days.Day2;

import java.util.*;

public class largestSubarrayWith0sum {
    
    int maxLen(int arr[], int n) {

        HashMap<Integer, Integer> m = new HashMap<>();

        int sum = 0;
        int res = 0;

        for(int i = 0; i<n; i++) {

            sum += arr[i];

            if(sum == 0) res = i+1;

            if(m.containsKey(sum)) res = Math.max(res, i-m.get(sum));

            else m.put(sum,i);
        }
        return res;
    }
}
