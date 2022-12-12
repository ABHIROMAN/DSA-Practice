package GFG30days.Day27;

public class bitDifference {
    
    public static int countBits(int a, int b) {

        int x = a ^ b;

        int count = 0;

        while(x > 0) {
            if((x & 1) != 0) {
                count++;
            }

            x = x >> 1;
        }

        return count;
    }
}
