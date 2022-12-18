package GFG30days;

public class aGameOfLCM {
    
    long solve(long n) {
        
        long al = n;
        int include = 0;
        
        for(long i = n-1; i >= 1; i--) {
            long g = gcd(al, i);
            
            if(g == 1) {
                al *= i;
                include++;
            }
            if(include == 3) return al;
        }
        return al;
    }
    
    long maxGcd(int N) {
        // code here
        return Math.max(solve(N), solve(N-1));
    }
    
    long gcd(long a, long b) {
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
