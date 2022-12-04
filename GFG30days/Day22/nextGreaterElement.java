package GFG30days.Day22;

import java.util.*;

public class nextGreaterElement {
    
    public static long[] nextLargerElement(long arr[], int n) {

        Stack<Long> stack = new Stack<>();

        long ans[] = new long[n];

        for(int i = n-1; i >= 0; i--) {

            while(!stack.empty() && stack.peek() <= arr[i]) {

                stack.pop();
            }
            if(stack.empty()) {

                ans[i] = -1;
            }
            else {

                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return ans;
    }
}
