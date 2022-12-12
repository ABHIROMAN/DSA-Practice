package GFG30days.Day27;

public class printFirstNFibo {

    public static long[] printFibb(int n) {
        //Your code here
        if(n == 1) return new long[]{1};
        if(n == 2) return new long[]{1,1};
        
        long[] res = new long[n];
        
        res[0] = 1;
        res[1] = 1;
        
        for(int i = 2; i < n; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        
        return res;
    }
    
}
