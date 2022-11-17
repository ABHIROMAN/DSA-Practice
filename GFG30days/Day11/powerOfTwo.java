package GFG30days.Day11;

public class powerOfTwo {

    public static boolean isPowerofTwo(long n){
        
        for(int i = 0; i < Math.sqrt(n); i++) {
            
            if(Math.pow(2,i) == n) return true;
        }
        
        return false;
        
    }
    
}
