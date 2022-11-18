package GFG30days.Day12;

import java.util.*;

public class dijikstraAlgorithm {
    
    public static class Pair implements Comparable<Pair>{
        int v;
        int wt;
        Pair(int v, int w){
            this.v = v;
            this.wt = w;
        }
        public int compareTo(Pair x){
         return this.wt-x.wt;
        }
    }

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        // Write your code here
        boolean visited[] = new boolean[V];
        PriorityQueue<Pair> que = new PriorityQueue<Pair>();
        que.add(new Pair(S,0));
        int ans[] = new int[V];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[S] = 0;
        while(que.size()>0){
            Pair curr = que.poll();
            int v = curr.v;
            if(visited[v])
                continue;
            visited[v] = true;
            
            ArrayList<ArrayList<Integer>> li = adj.get(v);
            for(ArrayList<Integer> lit: li){
               int vertex =  lit.get(0);
               int weight = lit.get(1);
               if(ans[vertex] > ans[v]+weight){
                   ans[vertex] = ans[v]+weight;
                   que.add(new Pair(vertex,ans[vertex]));
               }
               
            }
        }
        return ans;
    }
}
