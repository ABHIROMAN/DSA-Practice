package GFG30days.Day10;

import java.util.*;

public class bfs {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V + 1];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);
        vis[0] = true;
        
        while(!queue.isEmpty()) {
            int tmp = queue.poll();
            bfs.add(tmp);
            
            for(int i : adj.get(tmp)) {
                if(!vis[i]) {
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
        return bfs;
    }
    
}
