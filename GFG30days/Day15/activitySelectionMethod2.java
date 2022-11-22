package GFG30days.Day15;

import java.util.*;

public class activitySelectionMethod2 {
    
    static class Pair implements Comparable<Pair> {
        int s, e;
        public Pair(int s, int e) {
            this.s = s;
            this.e = e;
        }
        
        public int compareTo(Pair that) {
            return this.e - that.e;
        }
    }
    public static int activitySelection(int start[], int end[], int n)
    {
        if(n == 0) return 0;
        Pair[] a = new Pair[n];
        for(int i = 0; i < n; i++) {
            a[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(a);
        
        int curEnd = a[0].e;
        int ans = 1;
        
        for(int i=1; i<n; i++) {
            if(a[i].s > curEnd) {
                ans++;
                curEnd = a[i].e;
            }
        }
        
        return ans;
        
    }
}
