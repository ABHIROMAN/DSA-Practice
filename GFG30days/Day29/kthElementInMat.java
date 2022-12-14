package GFG30days.Day29;

import java.util.*;

public class kthElementInMat {
    
    public static int kthSmallest(int mat[][], int n, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int ans = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                pq.add(mat[i][j]);
            }
        }

        int start = 0;
        while(start < k) {
            ans = pq.poll();
            start++;
        }

        return ans;
    }

}