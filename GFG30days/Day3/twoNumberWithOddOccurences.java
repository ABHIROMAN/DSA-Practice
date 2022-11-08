package GFG30days.Day3;

import java.util.*;

public class twoNumberWithOddOccurences {

    public int[] twoOddNum(int arr[], int n) {

        HashSet<Integer> list = new HashSet<>();

        int ans[] = new int[2];
        for(int i = 0; i<n; i++) {

            if(list.contains(arr[i])) {
                list.remove(arr[i]);
            }
            else list.add(arr[i]);
        }
        ArrayList<Integer> set = new ArrayList<>(list);
        Collections.sort(set);
        for(int i = 0; i<set.size(); i++) {
            ans[i] = set.get(set.size()-1-i);
        }
        return ans;
    }
    
}
