package GFG30days.Day20;

import java.util.*;

public class chechWhetherPathExistMethod2 {
    
    static class Pair {
        int r, c;
        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public boolean equals(Pair that) {
            return this.r == that.r && this.c == that.c;
        }
    }
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] a)
    {
        
        int row = a.length;
        int col = a[0].length;
        boolean vis[][] = new boolean[row][col];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(a[i][j] == 1) {
                    Pair src = new Pair(i, j);
                    q.add(src);
                    break;
                }
            }
        }
        while(!q.isEmpty()) {
            Pair cur = q.poll();
            int x = cur.r;
            int y = cur.c;

            if(x < 0 || x >= row || y < 0 || y >= col) continue; // to check if they are in bounds

            if(vis[x][y] || a[x][y] == 0) continue; // to check if non visited and non-wall

            if(a[x][y] == 2) return true; // to check if destination found

            vis[x][y] = true; // to mark this visited

            q.add(new Pair(x-1, y));
            q.add(new Pair(x, y+1));
            q.add(new Pair(x+1, y));
            q.add(new Pair(x, y-1));

        }
        return false;
    }
}
