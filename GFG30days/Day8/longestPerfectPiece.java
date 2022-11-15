package GFG30days.Day8;

import java.util.*;

public class longestPerfectPiece {

    static int longPerfectPiece(int arr[], int N) {

        PriorityQueue<Integer> min = new PriorityQueue<>();

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0, j = 0;

        int ans = 0;

        while(j < N) {
            min.add(arr[j]);
            max.add(arr[j]);

            while(i <= j && max.peek() - min.peek() > 1) {

                min.remove(arr[i]);
                max.remove(arr[i]);
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
    
}
