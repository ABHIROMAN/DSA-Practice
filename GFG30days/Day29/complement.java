package GFG30days.Day29;

import java.util.*;

public class complement {
    
    Vector<Integer> findRange(String str, int n) {

        Vector<Integer> vector = new Vector<Integer>();

        int count = 0;

        for(int i = 0; i < n; i++) {

            if(str.charAt(i) == '1') count++;
        }

        if(count == n) {

            vector.add(-1);
            return vector;
        }

        int left = 0, right = 0, start = 0, sum = 0, maxi = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            char c = str.charAt(i);

            if(c == '1') {
                sum -= 1;
            }
            else {
                sum += 1;
            }

            if(sum > maxi) {
                maxi = sum;
                left = start;
                right = i;
            }

            if(sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }
        vector.add(left + 1);
        vector.add(right + 1);

        return vector;
    }
}
