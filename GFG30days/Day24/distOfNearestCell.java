package GFG30days.Day24;

import java.util.*;

public class distOfNearestCell {
    
    public int[][] nearest(int[][] grid) {
        
        int row = grid.length, col = grid[0].length;
        int direction[][] = { {0,1}, {1,0}, {0,-1}, {-1,0} };
        
        Queue<int[]> que = new LinkedList<>();
        
        int arr[][] = new int[row][col];
        int i,j,d;
        
        for(i = 0; i < row; i++) {
            for(j = 0; j < col; j++) {
                if(grid[i][j] == 1) {
                    arr[i][j] = 0;
                    que.add(new int[]{i,j,0});
                }else {
                    arr[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        while(!que.isEmpty()) {
            int size = que.size();
            while(size --> 0) {
                
                int curr[] = que.poll();
                for(int dir[] : direction) {
                    i = curr[0] + dir[0];
                    j = curr[1] + dir[1];
                    d = curr[2];
                    if(i >= 0 && i < row && j >= 0 && j < col && arr[i][j] > d+1) {
                        arr[i][j] = d + 1;
                        que.add(new int[]{i, j, d+1});
                    }
                }
            }
        }
        return arr;
    }
}
