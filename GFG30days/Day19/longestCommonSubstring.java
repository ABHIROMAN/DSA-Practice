package GFG30days.Day19;

//This Recursive approach can give us Time Limit Exceeded error 
// We will see second method using DP.

public class longestCommonSubstring {
    
    int LCS(String x, String y, int i, int j, int ctr) {
        
        int ctr1 = 0;
        int ctr2 = 0;
        if(i == 0 || j == 0) return ctr;
        
        if(x.charAt(i-1) == y.charAt(j-1)) {
            ctr = LCS(x, y, i-1, j-1, ctr+1);
        }
        
        ctr1 = LCS(x, y, i-1, j, 0);
        ctr2 = LCS(x, y, i, j-1, 0);
        
        int ctr3 = Math.max(ctr, ctr1);
        ctr = Math.max(ctr3, ctr2);
        
        return ctr;
    }
    int longestCommonSubstr(String S1, String S2, int n, int m){
        
        int ctr = LCS(S1, S2, n, m, 0);
        
        return ctr;
        
    }
}
