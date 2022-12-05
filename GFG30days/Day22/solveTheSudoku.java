package GFG30days.Day22;

public class solveTheSudoku {
    
    static boolean checkValidity(int row, int col, int grid[][], int val) {
        
        for(int i = 0; i < grid.length; i++) {
            
            if((i != col && grid[row][i] == val) || (i != row && grid[i][col] == val)) 
                return false;
        }
        
        int boxRowStart = row/3 * 3;
        int boxColStart = col/3 * 3;
        
        for(int i = boxRowStart; i < boxRowStart + 3; i++) {
            
            for(int j = boxColStart; j < boxColStart + 3; j++) {
                
                if(!(i == row && j == col) && grid[i][j] == val)
                    return false;
            }
        }
        return true;
    }
    
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][]) {
        // add your code here
        for(int row = 0; row < grid.length; row++) {
            
            for(int col = 0; col < grid[0].length; col++) {
                
                if(grid[row][col] == 0) {
                    
                    for(int val = 1; val <= 9; val++) {
                        
                        if(checkValidity(row, col, grid, val)) {
                            grid[row][col] = val;
                            
                            if(SolveSudoku(grid)) 
                                return true;
                            grid[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
        
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][]) {
        // add your code here
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                System.out.printf("%d ", grid[i][j]);
            }
        }
    }
}
