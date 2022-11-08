package GFG30days.Day3;

import java.util.*;

public class minimizeTheSumOfProduct {

    public long minValue(long a[], long b[], long n) {

        Arrays.sort(a);
        Arrays.sort(b);

        long sum = 0;
        long i = 0, j = n-1;

        while(i < (int)n) {

            sum += (a[(int)i] * b[(int)j]);
            i++;
            j--;
        }
        return sum;
    }
    
}
