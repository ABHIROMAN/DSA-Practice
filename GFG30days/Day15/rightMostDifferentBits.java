package GFG30days.Day15;

public class rightMostDifferentBits {
    
    public static int posOfRightMostDiffBit(int m, int n) {
            
        if(m == n) return -1;
        
        int count = 0;
        
        int ans = m ^ n;
        
        while(ans > 0) {
            
            count ++;
            
            if((ans & 1) == 1) return count;
            
            ans = ans >> 1;
        }
        
        return count;
    }
}
