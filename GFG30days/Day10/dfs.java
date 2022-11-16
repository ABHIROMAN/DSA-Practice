package GFG30days.Day10;

import java.util.*;

public class dfs {

    public void function(ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> dfs, int i) {
        
        vis[i] = true;
        dfs.add(i);
        for(Integer x : adj.get(i)) {
            if(!vis[x]) {
                function(adj, vis, dfs, x);
        }
    }
}
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);
        
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                function(adj, vis, dfs, i);
            }
        }
        return dfs;
    }
    
}
