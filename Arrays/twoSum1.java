package Arrays;

import java.util.*;

public class twoSum1 {
    
    public int[] towSum(int nums[], int target) {

        HashMap<Integer, Integer> ans = new HashMap<>();

        int len = nums.length, difference ;

        for(int i = 0; i < len; i++) {
            difference = target - nums[i];

            if(ans.containsKey(difference))
                return new int[]{i, ans.get(difference)};
            ans.put(nums[i], i);
        }

        return new int[]{};
    }
}
