package GFG30days.Day3;


import java.util.*;

public class subarrayWithGivenSum {

    static ArrayList<Integer> subarraySum(int arr[], int n, int s) {

        ArrayList<Integer> a = new ArrayList<>();

        long sum = 0;

        int start = 0;

        if(s == 0) {
            a.add(-1);
            return a;
        }
        for(int i = 0; i<n; i++) {
            if(sum < s) {
                sum = sum + arr[i];
            }

            while(sum > s) {
                sum = sum - arr[start];
                start++;
            }
            if(sum <= s) {
                a.add(start + 1);
                a.add(i + 1);
                return a;
            }
        }
        a.add(-1);
        return a;
    }
    
}
