package GFG30days.Day14;

public class checkWhetherKthbitisSetOrNot {
    
    static boolean checkKthBit(int n, int k) {

        return ((n >> k) & 1) == 1 ? true : false;
    }
}
