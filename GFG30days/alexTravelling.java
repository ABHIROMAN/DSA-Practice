package GFG30days;

import java.util.*;

public class alexTravelling {
    
    int minimumCost(int[][] flights, int n, int k) {
        // Your code here
        int[][] graph = new int[n][n];
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int[] flight : flights){
            int u = flight[0]-1, v = flight[1]-1 , w = flight[2];
            graph[u][v] = w;
        }
        int source = k-1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        dist[source] = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v=0;v<n;v++){
                if(graph[u][v] != 0 && dist[v]>dist[u] + graph[u][v]){   
                    dist[v] = dist[u] + graph[u][v];
                    q.offer(v);
                }
            }
        }
        int minCost = 0;
        for(int i=0;i<n;i++){
            minCost = Math.max(minCost,dist[i]);
        }
        
        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }
}
