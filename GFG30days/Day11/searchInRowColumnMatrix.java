package GFG30days.Day11;

public class searchInRowColumnMatrix {
    
    static boolean search(int matrix[][], int n, int m, int x) {  
	    
	    int i = 0; 
	    int j = m - 1;
	    
	    while(i < n && j>=0) {
	        
	        if(matrix[i][j] == x) return true;
	        
	        else if(matrix[i][j] < x) i++;
	        
	        else j--;
	    }
	    return false;
	} 
}
