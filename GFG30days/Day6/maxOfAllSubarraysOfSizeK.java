package GFG30days.Day6;

import java.util.*;

public class maxOfAllSubarraysOfSizeK {
    
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {

        Deque<Integer> dq = new ArrayDeque<Integer>();
        ArrayList<Integer> li = new ArrayList<>();

        for(int i = 0; i < k; ++i) {

            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(int i = k; i < n; ++i) {

            li.add(arr[dq.peek()]);

            while((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            while((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        li.add(arr[dq.peek()]);

        return li;
    }
}
