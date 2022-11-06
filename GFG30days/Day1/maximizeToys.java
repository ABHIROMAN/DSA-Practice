package GFG30days.Day1;

import java.util.*;

public class maximizeToys {
    
    static int toyCount(int n, int k, int arr[]) {

        Arrays.sort(arr);
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] <= k) {
                count++;
                k-= arr[i];
            }
            else {
                break;
            }
        }
        return count;
    }

}
