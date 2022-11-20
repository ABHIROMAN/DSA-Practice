package GFG30days.Day13;

public class longestConsecutive1s {
    
    public static int maxConsecutiveOnes(int N) {
        
        int count = 0;
        
        while(N!=0) {
            
            N = (N & (N << 1));
            
            count++;
        }
        return count;
        
    }
}
