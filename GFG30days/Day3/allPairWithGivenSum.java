package GFG30days.Day3;

import java.util.*;

class pair {
    long first, second;
    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}
public class allPairWithGivenSum {
    
    public pair[] allPairs(int A[], int B[], long N, long M, long X) {

        ArrayList<pair> list = new ArrayList<>();
        HashSet<Long> set = new HashSet<>();

        for(long ele: B) {
            set.add(ele);
        }
        Arrays.sort(A);
        for(long ele : A) {
            if(set.contains(X-ele)) {
                list.add(new pair(ele,X-ele));
            }
        }
        pair[] ans = new pair[list.size()];
        return list.toArray(ans);
    }
}
