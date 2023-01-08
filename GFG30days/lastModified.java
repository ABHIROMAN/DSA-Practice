package GFG30days;

public class lastModified {
    
    int solve(int n, int[] a) {
        // code here
        if(a[n-1] == 9) {
            int i = n - 1;
            while(a[i] >= 9) {
                i--;
            }
            return i + 1;
        }
        return n;
    }
};
