package GFG30days.Day16;

import java.util.*;

class pair {
    long first, second;

    public pair(long first, long second) {

        this.first = first;
        this.second = second;
    }
}

public class findAllPairsWithGivenSum {

    public pair[] allPairs(long A[], long B[], long N, long M, long X) {

        ArrayList<pair> list = new ArrayList<>();

        HashSet<Long> set = new HashSet<>();

        for(long ele : B) {
            set.add(ele);
        }

        Arrays.sort(A);
        for(long ele : A) {
            if(set.contains(X - ele)) {
                list.add(new pair(ele, X-ele));
            }
        }
        
        pair[] ans = new pair[list.size()]; 

        return list.toArray(ans);
    }
}
