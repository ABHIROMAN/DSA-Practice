package GFG30days.Day2;

import java.util.*;

public class reverseArrayInGroups {

    void reverseInGroups(ArrayList<Integer> arr, int n , int k) {

        for(int i = 0; i < n; i+=k) {

            int end = i + k - 1;
            if(end >= n) {
                end = n - 1;
            }

            int start = i;
            int temp;

            while(start < end) {

                temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end,temp);

                start++; 
                end--;
            }
        } 
    }
    
}
