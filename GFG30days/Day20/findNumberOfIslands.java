package GFG30days.Day20;

public class findNumberOfIslands {
    
    public void dfs(char grid[][], int i, int j, int n, int m, boolean visited[][]) {
        
        if(i >= n || i < 0 || j < 0 || j >= m) {
            
            return;
        }
        
        if(visited[i][j] || grid[i][j] == '0') {
            
            return;
        }
        
        visited[i][j] = true;
        
        for(int k = -1; k <=1; k++) {
            
            for(int l = -1; l <= 1; l++) {
                
                if(k == 0 && l == 0) continue;
                
                dfs(grid, i+k, j+l, n, m, visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        // Code here
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        boolean visited[][] = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < m; j++) {
                
                if(grid[i][j] == '1' && !visited[i][j]) {
                    
                    dfs(grid, i, j, n, m, visited);
                    count++;
                }
            }
        }
        return count;
    }
}
