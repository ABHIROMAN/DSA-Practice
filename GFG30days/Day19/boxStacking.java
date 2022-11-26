package GFG30days.Day19;

import java.util.*;

public class boxStacking {
    
    private static class Pair implements Comparable<Pair>{
        int l;
        int b;
        int h;
        int area;
        
        Pair(int l, int b, int h){
            this.l = l;
            this.b = b;
            this.h = h;
            this.area = this.l * this.b;
        }
        
        public int compareTo(Pair o){
            return o.area - this.area; // Decreasing order sorting
        }
    }
    
    
    public static int maxHeight(int[] height, int[] width, int[] length, int n) {
        
        Pair [] arr = new Pair[3 * n];
        int j = 0;
        for(int i = 0; i < n; i++){
            int l = length[i];
            int b = width[i];
            int h = height[i];
            
            // LBH
            if(l > b){
                arr[j++] = new Pair(l, b, h);
            } else {
                arr[j++] = new Pair(b, l, h);
            }
            // HBL
            if(h > b){
                arr[j++] = new Pair(h, b, l);
            } else {
                arr[j++] = new Pair(b, h, l);
            }
            // LHB
            if(l > h){
                arr[j++] = new Pair(l, h, b);
            } else {
                arr[j++] = new Pair(h, l, b);
            }
        }
        
        Arrays.sort(arr);
        int [] dp = new int[3 * n];
        dp[0] = arr[0].h;
        int maxHeight = dp[0];
        
        for(int i = 1; i < 3 * n; i++){
            int max = 0;
            for(int k = 0; k < i; k++){
                if(arr[k].l > arr[i].l && arr[k].b > arr[i].b){
                    max = Math.max(max, dp[k]);
                }
            }
            dp[i] = max + arr[i].h;
            maxHeight = Math.max(maxHeight, dp[i]);
        }
        
        return maxHeight;
        
    }
}
