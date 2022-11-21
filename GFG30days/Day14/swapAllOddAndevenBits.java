package GFG30days.Day14;

public class swapAllOddAndevenBits {
    
    public static int swapBits(int n) {
	    
	    int evenBits = (n & 0xAAAAAAAA);
	    int oddBits = (n & 0x55555555);
	    
	    return (evenBits>>1 | oddBits<<1);
	}
}
