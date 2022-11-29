package GFG30days.Day20;

public class checkWhetherPathExist {
    
    public static boolean isPossible(int grid[][], boolean vis[][], int i, int j, int n, int m) {

        if(i < 0 || j < 0 || j >=m || i >= n || vis[i][j] || grid[i][j] == 0) {

            return false;
        }

        if(grid[i][j] == 2) return true;

        vis[i][j] = true;

        boolean r = isPossible(grid, vis, i, j+1, n, m);
        boolean b = isPossible(grid, vis, i+1, j, n , m);
        boolean l = isPossible(grid, vis, i, j-1, n, m);
        boolean t = isPossible(grid, vis, i-1, j, n, m);

        vis[i][j] = false;

        return r || b || l || t;

    }

    public boolean is_Possible(int grid[][]) {

        int n = grid.length;
        int m = grid[0].length;

        boolean vis[][] = new boolean[n][m];

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(grid[i][j] == 1) {

                    if(isPossible(grid, vis, i, j, n, m)) {

                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
