package GFG30days.Day10;

import java.util.*;

public class numberOfProvinces {
    
    static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean vis[]) {
        
        vis[node] = true;
        for(int i : adj.get(node)) {
            if(!vis[i]) {
                dfs(adj,i,vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < V; i++) {
            adjlist.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                if(adj.get(i).get(j) == 1 && i != j) {
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(i);
                }
            }
        }
        int c = 0;
        boolean vis[] = new boolean[V];
        
        for(int i = 0; i < V; i++) {
            if(!vis[i]){
                dfs(adjlist,i,vis);
                c++;
            }
         }
         return c;
    }
};
