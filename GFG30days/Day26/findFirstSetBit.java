package GFG30days.Day26;

public class findFirstSetBit {
    
    public static int getFirstSetBit(int n){
            
        // Your code here
        if(n == 0) return 0;
        int pos = 1;
        
        while(n > 0) {
            if((n & 1) > 0) {
                break;
            }
            
            pos++;
            n = n >> 1;
        }
       return pos;     
    }
}
