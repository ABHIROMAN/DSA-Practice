package GFG30days.Day14;

public class isPowerOfTwo {
    
    public static boolean isPowerofTwo(long n){
        
        if (n == 0) {
            return false;
        }
        else if ((n & n-1) == 0) {
            return true;
        }
        return false;
    }
}
