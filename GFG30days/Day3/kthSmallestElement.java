package GFG30days.Day3;

import java.util.*;

public class kthSmallestElement {
    
    public static int kthSmallest(int arr[], int l, int r, int k) {

        Arrays.sort(arr);
        return arr[k-1];
    }
}
