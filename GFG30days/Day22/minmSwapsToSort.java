package GFG30days.Day22;

import java.util.*;

public class minmSwapsToSort {

    public int minSwaps(int arr[]) {

        int n = arr.length;
        int copyArray[] = new int[n];

        for(int i = 0; i < n; i++) {
            copyArray[i] = arr[i];
        }

        Arrays.sort(copyArray);

        Map<Integer, Integer> hm= new HashMap<>();

        for(int i = 0; i < n; i++) {
            hm.put(copyArray[i], i);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            while(hm.get(arr[i]) != i) {
                ans++;
                swap(arr, hm.get(arr[i]), i);
            }
        }
        return ans;
    }

    public void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
