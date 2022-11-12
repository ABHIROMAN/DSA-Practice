package GFG30days.Day5;

import java.util.*;

public class kthElementOfTwoSortedArrays {

    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {

        int arr[] = new int[n + m];

        int i;

        for(i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }

        int x = 0;
        for(int j = i; j < n+m; j++) {
            arr[j] = arr2[x++];
        }

        Arrays.sort(arr);
        return (long)arr[k-1];
    }
      
}
