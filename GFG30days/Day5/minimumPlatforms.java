package GFG30days.Day5;

import java.util.*;

public class minimumPlatforms {
    
    static int findPlatform(int arr[], int dep[], int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int count = 0;
        int max = 0;

        while(i < n) {

            if(arr[i] <= dep[j]) {
                count++;
                max = Math.max(max, count);
                i++;
            } else if(arr[i] > dep[j]) {
                count--;
                j++;
            }
        }
        return max;
    }
}
