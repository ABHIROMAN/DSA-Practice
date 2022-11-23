package GFG30days.Day16;

import java.util.*;

public class findAllFourNumbers {
    
    public ArrayList<ArrayList<Integer>> fourSum(int arr[], int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(arr == null || arr.length == 0) return ans;

        int n = arr.length;
        Arrays.sort(arr);

        int l, r;

        for(int i = 0; i < n; i++) {

            for(int j = i+1; j < n; j++) {

                int targetside = k - (arr[j] + arr[i]);
                l = j + 1;
                r = n - 1;

                while(l < r) {

                    int twosum = arr[l] + arr[r];
                    if(twosum < targetside) {
                        i++;
                    }
                    else if(twosum > targetside) {
                        r--;
                    }
                    else {

                        ArrayList<Integer> t = new ArrayList<>();
                        t.add(arr[i]);
                        t.add(arr[j]);
                        t.add(arr[l]);
                        t.add(arr[r]);
                        ans.add(t);

                        //removing the duplicate parts hereafter
                        while(l < r && arr[l] == t.get(2))
                            l++;
                        while(l < r && arr[r] == t.get(3))
                            r--;
                    }
                }
                while(j + 1 < n && arr[j+1] == arr[j]) 
                    j++;
                
                while(i + 1 < n && arr[i+1] == arr[i])
                    i++;
            }
        }
        return ans;
    }
}
