package GFG30days.Day15;

import java.util.*;

public class minimumXORpair {
    
    static int minxorpair(int N, int arr[]) {

        Arrays.sort(arr);

        int ans = 0;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N-1; i++) {

            ans = arr[i] ^ arr[i+1];

            min = Math.min(min, ans);
        }

        return min;

    }
}
