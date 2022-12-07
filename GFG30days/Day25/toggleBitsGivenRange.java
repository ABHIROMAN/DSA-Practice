package GFG30days.Day25;

public class toggleBitsGivenRange {
    
    static int toggleBits(int N, int L, int R) {

        int mask = (1 << R - L + 1) - 1;

        mask = mask << L - 1;

        return (N ^ mask);
    }
}
