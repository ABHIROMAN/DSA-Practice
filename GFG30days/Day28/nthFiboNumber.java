package GFG30days.Day28;

public class nthFiboNumber {
    
    static long nthFibonacci(long n){
        // code here
        if(n == 0) return 0;
        
        long m = 1000000007;
        
        long prev2 = 0;
        long prev = 1;
        
        for(long i = 2; i <= n; i++) {
            
            long cur = (prev % m) + (prev2 % m);
            
            prev2 = prev;
            prev = cur;
        }
        
        return prev % m;
    }
}
