package GFG30days.Day2;

import java.util.*;

public class leadersInAnArray {
    
    static ArrayList<Integer> leaders(int arr[], int n) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        int lead  = arr[n-1];

        for(int i = n-1; i>=0; i--) {
            if(arr[i] >= lead) {
                lead = arr[i];
                a.add(lead);
            }
        }
        Collections.reverse(a);
        return a;
    }
}
