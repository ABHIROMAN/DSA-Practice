package GFG30days;

import java.util.*;

public class minmNoOfStudents {
    
    public int binarySearch(int ele, ArrayList<Integer> arr) {
        int l = 0;
        int h = arr.size()-1;
        while(l <= h) {
            int mid = (l + h)/2;
            if(arr.get(mid) >= ele) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l;
    }
    public int removeStudents(int[] H, int n) {
        // code here
        ArrayList<Integer> dp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int index = binarySearch(H[i], dp);
            
            if(index == dp.size()) {
                dp.add(H[i]);
            }
            else {
                dp.set(index, H[i]);
            }
        }
        return n - dp.size();
    }
};
